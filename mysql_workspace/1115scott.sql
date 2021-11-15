SELECT * FROM emp;

SELECT
empno,ename,str_to_date(hiredate,'%y-%m-%d') AS '입사일'
FROM emp
WHERE hiredate>=DATE_FORMAT('19810401','%y%m%d');

SELECT
YEAR(CURDATE()),
MONTH(CURRENT_DATE()),
DAYOFMONTH(CURRENT_DATE);

SELECT
HOUR(CURTIME()),
MINUTE(CURRENT_TIME()),
SECOND(CURRENT_TIME),
MICROSECOND(CURRENT_TIME);


SELECT
DAYOFWEEK(CURDATE()),
MONTHNAME(CURDATE()),
DAYOFYEAR(CURDATE());

-- LAST_DAY('2020-02-01');

-- SELECT period,ADD(202001,11), PERIOD_DIFF(201812,202001);

SELECT TIME_TO_SEC('12:11:10');

SELECT CURDATE(), CURTIME(), NOW(), SYSDATE();
-- 현재 사용자와 현재 선택된 데이터베이스 반환
SELECT CURRENT_USER(), DATABASE();

SELECT * FROM emp;
-- 바로 이전 select문에서 조회된 행의 수
SELECT FOUND_ROWS();

select CAST(AVG(sal) AS SIGNED integer) AS '평균 월급' FROM emp;

select CONVERT(AVG(sal), CHAR(10)) AS '평균 월급' FROM emp;

SELECT CAST('2021$11$11' AS DATE);
SELECT CAST('2021/11/11' AS DATE);
SELECT CAST('2021%11%11' AS DATE);
SELECT CAST('2021@11@11' AS DATE);

SELECT '100'+'200';
SELECT CONCAT('100','200');
SELECT CONCAT(100,'200');
SELECT 1 > '3mega';
SELECT 4 > '3MEGA';
SELECT 0 = 'mega3';

SELECT *
FROM emp
INNER JOIN dept;

-- 열 이름을 비교하는 조건식으로 비교하기
select *
from emp
inner join dept
on emp.deptno = dept.deptno
order by empno;
-- 테이블의 별칭 설정 (출력 결과에 영향을 주지 않음)
select *
from emp e
inner join dept d
on e.deptno = d.deptno
order by empno;
-- emp 테이블 별칭을 e로 , dept 테이블 별칭을 d로 하여 사원 번호와 부서 이름을 출력하기
select e.empno, d.dname
from emp e
inner join dept d
on e.deptno = d.deptno
order by empno;
-- 여러 테이블의 열 이름이 같을 때 유의점 >> deptno가 같아서 실행 오류남
select empno, ename, deptno, dname, loc
from emp e
inner join dept d
on e.deptno= d.deptno
order by empno;
-- deptno 열은 두 테이블에 모두 존재하므로, 어느 테이블에 속해있는 열인지 반드시 명시해야함
select empno, ename, e.deptno, dname, loc
from emp e
inner join dept d
on e.deptno= d.deptno
order by empno;
-- where 절에 조건식 추가하여 출력 범위 설정하기
-- 사원 번호, 이름, 급여, 근무 부서를 함께 출력하되 급여가 3000이상인 데이터만 출력
select e.empno, e.ename, e.sal, e.deptno, d.dname, d.loc
from emp e
inner join dept d
on e.deptno=d.deptno
where sal>=3000;
-- 비등가조인
select *
from emp e
inner join salgrade s
on e.sal between s.losal and s.hisal;
-- 셀프조인 (자기 자신을 두개의 테이블인것처럼 나눠서 원하는 정보를 출력)
select e.empno, e.ename, e.mgr, m.empno as mgr_no, m.ename as mgr_name
from emp e
inner join emp m
on e.mgr = m.empno;
-- 조건을 만족하지 않는 행도 모두 출력 left join
select e.empno, e.ename, e.mgr, m.empno as mgr_no, m.ename as mgr_name
from emp e
left outer join emp m
on e.mgr = m.empno
order by e.empno;

-- cross join
-- 한쪽 테이블의 모든 행과 다른쪽 테이블의 모든 행을 조인 하는 것


-- 연습문제 1. 아닌거같음 ??????????????
select emp.deptno as blake, dept.deptno as dallas
from emp,dept
where emp.ename='BLAKE' or dept.loc = 'dallas';

select count(*)
from emp
where mgr is not null;
-- sales 맨을 제외하고 각 업무별 사원들의 총 급여가 3000 이상인 각 업무에 대해서
-- 업무명과 각 업무별 평균 급여를 출력하되, 평균 급여의 내림차순으로 출력하시오
select job,avg(sal)
from emp
where job not in('salesman')
group by job
having sum(sal)>=3000
order by avg(sal) desc;

-- 연습문제 2-1 하나도못함.. --> not in (null) 이 아니고 is not null
select ename, sal, COMM, sal+comm
from emp
where comm is not null
order by (sal+comm) desc;
-- 틀린 내꺼 답 : 사원이 한 명도 없는 부서의 이름을 출력하시오
select dname
from dept
inner join emp
on dept.deptno=emp.deptno
where dept.deptno not in (emp.deptno);
-- 인우님 답
-- dept 의 deptno와 emp의 deptno가 같은게 emp e에 있는것중에 dept 에서 dname에 있냐는거얌..
-- 왜케 복잡하누
select d.dname 
from dept d
where not exists(
select * 
from emp e 
where d.deptno = e.deptno);


select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname,d.loc
from emp e natural join dept d
order by deptno, e.empno;

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, deptno, d.dname, d.loc
from emp e join dept d using(deptno)
where sal>=3000
order by deptno, e.empno;

select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno, d.dname, d.loc
from emp e join dept d on (e.deptno=d.deptno)
where sal>=3000
order by e.deptno, empno;
-- 서브쿼리 select문 두개 쓰는 것을 sub 쿼리라고 하나봐.,..
select *
from emp
where sal>(select sal
from emp
where ename = 'jones');

select *
from emp
where hiredate<(select hiredate
from emp
where ename='blake');

select e.empno, e.ename, e.job, e.sal, d.deptno, d.dname, d.loc
from emp e
inner join dept d
on e.deptno = d.deptno
where e.deptno=20
and e.sal>(select avg(sal)
from emp);

select *
from emp
where sal = any(select max(sal)
from emp
group by deptno);

select *
from emp
where sal = some(select max(sal)
from emp
group by deptno);

select *
from emp
where sal < any(select sal
from emp
where deptno = 30)
order by sal, empno;

select *
from emp
where sal < all(select sal
from emp
where deptno = 30);

select *
from emp
where exists (select dname
from dept
where deptno = 10);

-- 연습문제 
select empno, ename, job, mgr, hiredate, sal, comm ,deptno
from emp
where hiredate<(select min(hiredate)
from emp
where deptno =10);
-- 인라인 뷰 : from절에 사용하는 서브쿼리
select e10.empno, e10.ename, e10.deptno, d.dname, d.loc
from (select *
from emp
where deptno = 10) e10
inner join (select * from dept) d
on e10.deptno = d.deptno;

select
empno, ename, job, sal,
(select grade from salgrade where e.sal between losal and hisal) as salgrade,
deptno,
(select dname from dept where e.deptno = dept.deptno) as dname
from emp e;

-- allen과 직무가 같은 사원들의 사웑정보
select job,empno,ename,sal,e.deptno, d.dname
from emp e
inner join dept d
on e.DEPTNO=d.deptno
where job=(select job
from emp
where ename='allen');
-- 전체 사원의 평균 급여보다 높은 급여를 받는 사원들의 사원정보, 부서 정보, 급여 등급 정보를 출력하기
-- 일단 grade는 1~5까지 들어있어서 select문에서 subQuery사용하지 않으면 5개 다나와서 salary가 losal~hisal사이에 얼마인지에 따라 salgrade가 정해지게끔
-- 서브쿼리를 짜면 되고, avg(sal)같은 집계함수는 select문에서 사용이 되야하는데, 그렇게 못한다면 group by함수가 필요,
-- 근데 못쓴다면 괄호로 묶어주면 됨 ***그리고 inner join 쓰려면 꼭 on 써줘야하고, 그냥 from에 여러가지 쓰는건 안됨(그러면 같은 데이터 별로 안묶임)
select empno, ename, dname, hiredate, loc, sal, (select grade from salgrade where e.sal between losal and hisal)
from emp e
inner join dept
on e.deptno=dept.deptno
where sal>(select avg(sal)
from emp)
order by sal desc, empno asc;

select * from emp;
select * from dept;

-- 연습문제
select e.empno, ename, job, e.deptno, dname, loc
from emp e
inner join dept d
on e.deptno=d.deptno
where e.deptno =10 and job not in (select job
from emp
where deptno=30);
select * from salgrade;
-- 직책이 salesman 인 사람들의 최고 급여보다 높은 급여를 받는 사원들의 사원 정보, 급여 등급 정보를 다음과 같이 출력
-- 일단 grade는 1~5까지 들어있어서 select문에서 subQuery사용하지 않으면 5개 다나와서 salary가 losal~hisal사이에 얼마인지에 따라 salgrade가 정해지게끔
select empno, ename, sal, (select grade from salgrade where e.sal between losal and hisal)
from emp e
where sal>(select max(sal)
from emp
where job='salesman');

-- 연습문제 scott 
-- 추가수당을 받는 사원 수와 받지 않는 사원 수 출력하기
-- 원하는 대로 안나올 때는 group by를 사용해보자.....
select if(comm is null, 'X', 'O') as EXIST_COMM, count(*) as CNT
from emp
group by EXIST_COMM;

select job, count(*)
from emp
group by job
having count(job) >= 3;
-- 입사년도를 기준으로 부서별 입사 인원 수 출력하기 *****
-- hiredate가 입사일 이기때문에 year(hiredate)하면 hiredate에서 년도를 가져와줌
-- 그리고 groupby 를 두개 hire_year과 deptno로 다 해주는게 핵심인데,
-- 그 이유는 입사년도를 기준으로 group by 를 하면 deptno가 여러개 나와서 cnt가 나오지가 않기때문에
-- deptno도 groupby로 묶어준다
select year(hiredate) as HIRE_YEAR,deptno,count(*) as CNT
from emp
group by HIRE_YEAR,deptno;

-- 사원들은 입사일을 기준으로 3개월이 지난 후 첫 월요일에 정직원이 된다
-- 정직원이 되는 날짜를 yyyy-mm-dd형식으로 출력하고 , 추가수당이 없는 사원의 추가 수당은 n/a로 출력 *****
-- 먼저 date_format 함수를 사용해야한느데 나는 str_to_date를 사용햇었다... 근데 날짜에 날짜를 더해주다보면
-- 처음엔 string 형이었어도 더해주면서 date형으로 바뀌게되서 date_format(date, format)형이고, str_to_date(string, format)함수여서
-- date_format을 사용하지 않으면 출력이안되기 땜에 date_format을 사용해줘야하고
-- 3개월 더하는거 adddate사용해서 hiredate에 3개월 더해준 거에다가 case문을 사용해서 또 요일에 따라 며칠을 더해줄지를 한다음에
-- format함수 이용해서 y-m-d형태로 출력해주는 문제!!!!
-- cas에다가 dayofweek(hiredate)왜썼냐면 3개월이 더해지던 안더해지던 요일은 같아서 요일을 알려주는 dayofweek함수를 사용해서 이렇게 짰음...
select empno, ename, hiredate ,
date_format(
adddate(adddate(hiredate, INTERVAL 3 MONTH), 
case dayofweek(hiredate)
	when 1 then 1
    when 3 then 6 
    when 4 then 5 
	when 5 then 4 
    when 6 then 3
    when 7 then 2
    else 0
end) ,'%y-%m-%d') as R_JOB, 
if(comm is null, 'N/A', comm) as COMM
from emp;