select * from emp;
desc emp;

select empno, ename
from emp;

-- select distinct deptno from emp;-- 

select distinct job, deptno
from emp;

select ename, sal, sal*12+comm, comm
from emp;

select ename,sal,sal*12+comm as annsal, comm from emp;

select empno, ename, sal, deptno 
from emp
order by sal desc;

select *
from emp
order by deptno asc, sal desc;

select *
from emp
where deptno = 30;

select *
from emp
where deptno = 30 or job='clerk';

select *
from emp
where sal >=3000;

select *
from emp
where ename<+'forz';

select *
from emp
where sal !=3000;

select *
from emp
where sal<> 3000;

select *
from emp
where not sal = 3000;

select *
from emp
where job = 'manager'
or job = 'salesman'
or job='clerk';
-- 위의 or로 하는거는 너무 가독성이 떨어지므로 이럴때에는 밑에 처럼 in을 사용하는게 편리-- 
select *
from emp
where job
in('manager','salesman','clerk');

select *
from emp
where job != 'manager'
and job <>'salesman'
and job<> 'clerk';

select *
from emp
where job
not in('manager','salesman','clerk');

select *
from emp
where sal>=2000 and sal<=3000;

select *
from emp
where sal
between 2000 and 3000;
-- 연봉 2000-3000인 사람 다 빼뜨리고 싶을때
select *
from emp
where sal
not between 2000 and 3000;

select *
from emp
where ename like 's%';
-- 이름의 두번째 글짜가 l인 사원 조회하기
select *
from emp
where ename like '_l%';
-- 사원 이름에 am이 포함되어있는 사원 데이터 조회
select *
from emp
where ename like '%am%';
-- 사원 이름에 am이 포함되어있지 않은 사원 데이터 조회
select *
from emp
where ename not like '%am%';

select *
from emp
where comm=null;

select *
from emp
where comm is null;

select ename as '사원이름', job as '사원직위'
from emp;
-- mgr = 매니저의 사원번호
select ename, sal
from emp
where deptno = 30;

select empno,ename,sal, sal*1.1 as '인상된 급여',sal*0.1 as 증가액
from emp
order by empno;

select ename,deptno
from emp
where ename like 'f%';
-- 합계를 구하는 sum함수
-- 사원들의 급여 합계 구하기 (distinct, all 사용)
select sum(distinct sal),
sum(all sal),
sum(sal)
from emp;
-- 데이터 개수를 구해주는 count
-- *를 사용하면 select문의 결과값으로 나온 행 데이터 개수를 반환
-- 사원들의 수 구하기
select count(*)
from emp;
-- 부서번호가 30번인 사원 수 구하기
select count(*)
from emp
where deptno=30;

select
count(distinct sal),
count(all sal),
count(sal)
from emp;

select
max(sal)as 최대,
min(sal) as 최소
from emp
where deptno = 10;
-- 날짜 데이터에 max, min 함수 사용하기
-- 부서 번호가 20인 사원의 입사일 중 가장 최근 입사일과 가장 오래된 입사일 출력하기
select max(hiredate) as 최근입사일,
min(hiredate)as 오래된입사일
from emp
where deptno=20;
-- 평균값을 구하는 avg
-- 부서번호가 30인 사원들의 평균 급여 출력하기
select avg(sal)
from emp
where deptno=30;
-- 부서별 평균 급여를 부서 번호와 함께 출력하기
select avg(sal), deptno
from emp
group by deptno;

-- 부서의 직무별 평균 급여 출력하기
select deptno, job, avg(sal)
from emp
group by deptno, job
order by deptno, job;
-- ename은 각각 다른 이름을 갖고있는데 그중에 첫번째 행의 이름을 따서 가져오니까(그룹화 할 수 없어서)
-- 좋은 결과는 아님...
select
ename, deptno, avg(sal)
from emp
group by deptno;
--  group by 절에 조건을 줄 때는 having 절
-- 각 부서의 직무별 평균 급여를 구하되 그 평균 급여가 2000이상인 그룹만 출력
select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal)>=2000
order by deptno, job;

select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal)>=2000
order by deptno, job;

select
deptno,job,avg(sal)
from emp
where sal<=3000
group by deptno, job
having avg(sal) >=2000
order by deptno, job;
-- 연습문제 1.
select max(sal) as MAX, min(sal) as MIN, sum(sal) as SUM, round(avg(sal),1) as AVG
from emp;

select job as 업무, count(job) as '업무별 사원수'
from emp
group by job;

select max(sal)-min(sal)
from emp;

select count(*), sum(sal), avg(sal)
from emp
where deptno = 30;
--  평균 급여가 가장 높은 부서의 번호 출력 이게맞나,,,,,
select deptno, avg(sal)
from emp
group by deptno
order by avg(sal) desc;

select job, count(*)
from emp
group by job
having count(job)>=4;

select ename
from emp
where empno between 7400 and 7600;
-- 사원 blake보다 연봉이 많은 사람의 이름을 출력하시오
select ename
from emp
where sal>(select sal
from emp
where ename='blake');

-- 연습문제 scott/hr
select deptno,job,count(*)
from emp
group by deptno;
-- 사원이 한명도 없는 부서의 이름을 출력하시오 ?????????????? 없는데,,
select deptno
from emp
where empno is null;

select ename, upper(ename), lower(ename)
from emp;

select *
from emp
where upper(ename)=upper('smith');

select *
from emp
where upper(ename) like upper('%smith%');

select ename, length(ename)
from emp;

select ename, length(ename)
from emp
where length(ename)>=5;

select job, substr(job,1,2), substr(job,5)
from emp;

select job,
substr(job, -length(job)),
substr(job, -length(job),2),
substr(job,-3)
from emp;
-- instr은 문자열의 처음부터 찾고자 하는 문자열을 찾다가 그 문자열을 만나면 문자열의 index 위치를 구해주는 함수!
select
instr('hello, oracle!', 'l') as instr_1;
-- instr 함수로 사원 이름에 문자 s가 있는 행 구하기
select *
from emp
where instr(ename, 's')>0;
-- like 연산자로 사원 이름에 문자 s 가 있는 행 구하기
select *
from emp
where ename like '%s%';

select '010-1234-5678' as "before",
replace('010-1234-5678', '-', ' ') as after1,
replace('010-1234-5678','-', '') as after2;

select 'oracle',
lpad('oracle', 10, '#') as lpad1,
rpad('oracle',10,'*') as rpad1;

select
concat(empno, ename),
concat(empno, concat(':',ename))
from emp
where ename = 'smith';

select trim('=' from '==browning==')as trim;

select
round(1234.5678) as round,
round(1234.5678, 0) as round_0,
round(1234.5678, 1) as round_1,
round(1234.5678, 2) as round_2,
round(1234.5678, -1) as round_minus1,
round(1234.5678, -2) as round_minus2;
-- truncate 는 반올림으로 버리는 거인가봐
select
truncate(1234.5678, 0) as trunc_0,
truncate(1234.5678, 1) as trunc_1,
truncate(1234.5678, 2) as trunc_2,
truncate(1234.5678, -1) as trunc_minus1,
truncate(1234.5678, -2) as trunc_minus2;

select if(100>200, '참이다', '거짓이다');
-- ifnull(수식1,수식2) 수식1이 null이 아니면 수식1반환, 수식1이 null이면 수식2를반환
select ifnull(null,'널이군요'),ifnull(100,'널이군요');

select nullif(100,100), nullif(200,100);

select empno,ename,sal,comm,sal+comm, ifnull(comm,0), sal+ifnull(comm,0)
from emp;

select empno, ename, comm,
if(comm is null, 'x','o')
from emp;
-- 문자열은 무조건 작은따옴표, 큰따옴표는 *같은거,,인가봐,,
select case 10
	when 1 then '일'
    when 5 then '오'
    when 10 then '십'
    else '모름'
end;