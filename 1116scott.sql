create table dept_temp
as select * from dept;

drop table dept_temp;

insert into dept_temp
(deptno,dname,loc)
values (50, 'database', 'seoul');

insert into dept_temp
values (60,'java', 'busan');

insert into dept_temp
values (70,'web',null);

insert into dept_temp
(deptno, loc)
values (80,'incheon');

create table emp_temp
as select *
from emp
where 1<>1;

insert into emp_temp
(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values
(1111,'코난','president', null, '2021/01/01', 5000, 1000, 10);

insert into emp_temp
(empno, ename,job,mgr,hiredate,sal,comm,deptno)
values
(2222, '장미', 'manager', 9999, '2020-12-01', 4000, 2000, 20);

-- str _to_date 를 사용하여 날짜정보 입력하기(형변환 안해도 ok) ??????????????????????? y가 아니라 Y임 y는 두자리 Y는 네자리
insert into emp_temp
(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values (3333,'미란', 'analyst', 5555, str_to_date('2018-08-08', '%Y-%m-%d'), 4000, 2000, 20);

-- sysdate를 사용하여 날짜정보 입력하기
insert into emp_temp
(empno, ename, job, mgr, hiredate, sal, comm, deptno)
values
(5555,'키드', 'analyst',1111, sysdate(), 1200, 1200, 30);
-- 서브쿼리를 사용하여 여러 데이터를 한번에 추가하기
insert into emp_temp
(empno, ename, job, mgr, hiredate, sal, comm, deptno)
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno
from emp e, salgrade s
where e.sal between s.losal and s.hisal
and s.grade = 1;
-- dept 테이블을 복사하여 dept_temp생성
update dept_temp2
set loc='seoul';

rollback; -- 마지막에 커밋한 상태로 되돌리는 방법

desc dept_temp2;

drop table dept_temp2;

set autocommit=0;
start transaction ; -- 트랜잭션 시작
create table dept_temp2
as select * from dept;

desc dept_temp2;
-- 일부만 수정하기
update dept_temp2
set dname = 'database', loc='seoul'
where deptno = 40;
-- 서브쿼리를 사용하여 데이터 수정하기 ??????????????????????????????
update dept_temp2
set dname = (select dname from dept where deptno=40)
, loc = (select loc from dept where deptno = 40)
where deptno = 40;

-- where 절에서 서브쿼리를 사용하는 경우
update dept_temp2
set loc='seoul'
where deptno
in (select tbl_deptno
from
(select deptno tbl_deptno
from dept_temp2
where dname = 'operations') temp);

select *
from dept_temp2;

select *
from emp_temp2;
-- emp_temp 테이블의 사원들 중 급여가 2500이하인 사원만 추가수당을 50으로 수정하시오
update emp_temp
set comm =50
where sal<=2500;

-- 테이블 생성하기
create table emp_temp2 as select * from emp;

-- 데이터 일부 삭제하기
delete from emp_temp2 
where job = 'manager';

-- 서브쿼리를 사용하여 데이터 삭제하기
delete from emp_temp2
where empno
in (select tbl_empno
from 
(select e.empno tbl_empno
from emp_temp2 e, salgrade s
where e.sal between s.losal
and s.hisal and s.grade = 3
and deptno = 30) temp);

select *
from ex_dept;
-- 연습문제
-- emp_temp 테이블에서 급여가 3000이상인 사원을 삭제하시오
delete from emp_temp
where sal>=3000;
-- emp_temp2에 있는 모든 데이터를 삭제하시오
delete from emp_temp2;

-- 연습문제
create table ex_emp as select * from emp;
create table ex_dept as select * from dept;
create table ex_salgrade as select * from salgrade;

insert into ex_dept
(deptno, dname, loc) values
(60, 'oracle', 'busan');

insert into ex_dept
(deptno, dname, loc) values
(70, 'HTML', 'INCHEON');

insert into ex_dept
(deptno, dname, loc) values
(80, 'JAVA', 'ILSAN');

insert into ex_dept
(deptno, dname, loc) values
(90, 'SPRING', 'JEJU');

select *
from ex_emp;
-- 연습문제 EX_EMP테이블에 새로운 데이터 추가하기
insert into EX_EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) values
(8001, 'TEST_USER1', 'MANAGER', 7788, '21/01/01', 4500 , (null), 60);

insert into EX_EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) values
(8002, 'TEST_USER2', 'CLERK', 8001, '21/01/11', 1200 , (null), 60);
-- 여기부터 입력하기
insert into EX_EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) values
(8003, 'TEST_USER3', 'ANALYST', 8001, '21/01/21', 3300 , (null), 70);

insert into EX_EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) values
(8004, 'TEST_USER4', 'SALESMAN', 8001, '21/01/24', 2000 , 300, 70);

insert into EX_EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) values
(8005, 'TEST_USER5', 'CLERK', 8001, '21/01/15', 3400 , 200, 80);

insert into EX_EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) values
(8006, 'TEST_USER6', 'CLERK', 8001, '21/02/22', 2800 , (null), 80);
insert into EX_EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) values
(8007, 'TEST_USER7', 'OPERATOR', 8001, '21/03/03', 2600 , (null), 90);
insert into EX_EMP
(EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO) values
(8008, 'TEST_USER8', 'CREATER', 8001, '21/03/11', 1500 , (null), 90);
-- 60번 부서에서 근무하는 사원들의 평균 급여보다 많은 급여를 받고 있는 사원들을 70번 부서로 옮기기 (6행 업데이트)
-- 서브쿼리를 UPDATE에서 쓰고싶을 때에는 무조건 두번 묶어서 해야함,,,,, 공식을 잘 외위@
UPDATE EX_EMP
SET DEPTNO= 70 -- DEPTNO를 70으로 수정하겟따
WHERE SAL>(SELECT AVG_SAL -- 내 월급이 전체 평균 (AVG_SAL이라는 변수명)보다 높을때
FROM
(SELECT AVG(SAL) AVG_SAL -- 평균 SAL을 AVG_SAL이라고 부르겠음
FROM EX_EMP
WHERE DEPTNO=60) TEMP); -- 184~186 행을 TEMP라고 부르겠음

-- 60번 부서에서 근무하는 사원 중에 입사일이 가장 빠른 사원보다 늦게 입사한 사원의 급여를 10% 인상하고 80번 부서로 옮기기(6행 업데이트) ????????????????
UPDATE EX_EMP
SET DEPTNO=80, SAL=SAL*1.1
WHERE HIREDATE > ( SELECT  MIN_DATE
FROM
(SELECT MIN(HIREDATE) MIN_DATE
FROM EX_EMP
WHERE DEPTNO=60) TEMP);

SELECT *
FROM EX_EMP;

-- EX_EMP에 속한 사원 중, 급여 등급이 5인 사원을 삭제하기(5행 삭제)
-- EMPNO를 WHERE절에 넣어서 비교를 하는거지,,
-- SELECT에서도 똑같이 EMPNO로 비교를 해줘야하고
DELETE FROM EX_EMP
WHERE EMPNO
IN (SELECT GRADE_MAN
FROM 
(SELECT EMPNO GRADE_MAN
FROM SALGRADE S, EX_EMP E -- 두개 불러와서 사용해준다 ()안에서
WHERE SAL BETWEEN S.LOSAL AND S.HISAL -- 급여가 LOSAL<SAL<HISAL 인데 GRADE가 5인것에 대해서만 비교한 EMPNO를 또 WHERE절에서 비교해주는것..
AND S.GRADE=5) TEMP);

-- 자료형을 각각 정의하여 테이블 생성하기
create table emp_ddl(
empno int,
ename varchar(10),
job varchar(9),
mgr int,
hiredate datetime,
sal double,
comm double,
deptno int
);

-- 다른 테이블을 복사하여 테이블 생성하기
create table dept_ddl
as select * from dept;

-- 기존 테이블의 열 구조와 일부 데이터를 복사하여 생성하기
create table emp_ddl_30
as select *
from emp
where deptno=30;

select *
from emp_ddl_30;

-- 기존 테이블의 열 구조만 복사하여 생성하기
create table empdept_ddl
as select
e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, d.deptno, d.dname, d.loc
from emp e, dept d
where 1<>1;

select *
from emp_rename;

-- emp 테이블을 복사하여 emp_alter 생성
create table emp_alter as select * from emp;

-- 테이블에 열을 추가하는 add
alter table emp_alter add hp varchar(20);

-- 열 이름을 변경하는 rename
alter table emp_alter rename column hp to tel;

-- 열의 자료형을 변경하는 modify
alter table emp_alter modify empno char(5);

-- 특정 열을 삭제할 때 사용하는 drop
alter table emp_alter
drop column tel;

-- 테이블 이름을 변경하는 rename
rename table emp_alter to emp_rename;

-- 데이터를 삭제하는 truncate , 테이블의 구조는 남아잇음
truncate table emp_rename;

-- 테이블을 삭제하는 drop
drop table emp_rename;

select *
from emp_rename;

-- 연습문제 
create table emp_ex(
empno int(4),
ename varchar(10),
job varchar(9),
mgr int(4),
hiredate datetime,
sal  decimal(7,2),
comm decimal(7,2),
deptno int(2));

select *
from emp_ex;

alter table emp_ex add BIGO varchar(20);

alter table emp_ex modify BIGO varchar(30);

alter table emp_ex rename column BIGO to 비고;
-- emp_ex 테이블에 emp 테이블 데이터를 모두 저장하기 (비고열은 null) -> 확인 
-- insert 서브쿼리 사용해서 해보기 ???????????????????????????왜안대 --> select 뒤에는 괄호 하면 안됌.....!!!!!!!!!!!!!!!!!!!!
insert into emp_ex(empno, ename, job, mgr, hiredate, sal, comm, deptno,비고)
select e.empno, e.ename, e.job, e.mgr, e.hiredate, e.sal, e.comm, e.deptno,null
from emp e;

-- 테이블 생성 후 이전 페이지를 참조하여 데이터 삽입
create table book(
bookid smallint primary key,
bookname varchar(40),
publisher varchar(40),
price int
);
create table customer(
custid smallint primary key,
name varchar(40),
address varchar(50),
phone varchar(20)
);

create table orders(
orderid smallint primary key,
custid smallint,
bookid smallint,
salesprice int,
orderdate date,
foreign key(custid) references customer(custid),
foreign key(bookid) references book(bookid)
);

select *
from orders;
-- book만들기
insert into book
(bookid,bookname,publisher, price)
values (1,'축구의 역사', '굿스포츠',7000);

insert into book
(bookid,bookname,publisher, price)
values (2,'축구 아는 여자', '나무수',13000);

insert into book
(bookid,bookname,publisher, price)
values (3,'축구의 이해', '대한미디어',22000);

insert into book
(bookid,bookname,publisher, price)
values (4,'골프 바이블', '대한미디어',35000);

insert into book
(bookid,bookname,publisher, price)
values (5,'피겨 교본', '굿스포츠',8000);

insert into book
(bookid,bookname,publisher, price)
values (6,'배구의 기술', '굿스포츠',8000);

insert into book
(bookid,bookname,publisher, price)
values (7,'야구의 추억', '이상미디어',20000);

insert into book
(bookid,bookname,publisher, price)
values (8,'야구를 부탁해', '이상미디어',13000);

insert into book
(bookid,bookname,publisher, price)
values (9,'올림픽 이야기', '심성당',7500);

insert into book
(bookid,bookname,publisher, price)
values (10,'Olympic Champions', 'Pearson',13000);

-- 커스토머 만들기
insert into customer
(custid, name, address, phone)
values (1,'손흥민', '영국 런던' , '000-5000-0001');

insert into customer
(custid, name, address, phone)
values (2,'김연아', '대한민국 서울' , '000-6000-0001');

insert into customer
(custid, name, address, phone)
values (3,'김연경', '대한민국 인천' , '000-7000-0001');

insert into customer
(custid, name, address, phone)
values (4,'류현진', '캐나다 토론토' , '000-8000-0001');

insert into customer
(custid, name, address, phone)
values (5,'박세리', '대한민국 대전' , null);

-- orders 만들기
insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (1,1, 1 , 6000, '2014-07-01');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (2,1, 3 , 21000, '2014-07-03');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (3,2, 5 , 8000, '2014-07-03');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (4,3, 6 , 6000, '2014-07-04');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (5,4, 7 , 20000, '2014-07-05');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (6,1, 2 , 12000, '2014-07-07');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (7,4, 8 , 13000, '2014-07-07');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (8,3, 10 , 12000, '2014-07-08');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (9,2, 10 , 7000, '2014-07-09');

insert into orders
(orderid, custid, bookid, salesprice, orderdate)
values (10,3, 8 , 13000, '2014-07-10');

select *
from book;

-- 고객별로 주문한 모든 도서의 총 판매액을 구하고, 고객 별로 정렬하여 출력하기

select name, sum(salesprice)
from customer inner join orders
on customer.custid = orders.custid
group by customer.name
order by customer.name;

-- 고객의 이름과 고객이 주문한 도서의 이름 출력하기
select customer.name, book.bookname
from customer, orders, book
where customer.custid = orders.custid and orders.bookid = book.bookid;

-- 가격이 20000원인 도서를 주문한 고객의 이름과 도서의 이름을 출력하기
select customer.name, book.bookname
from customer,orders, book
where customer.custid=orders.custid
and orders.bookid=book.bookid and book.price = 20000;

-- 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총 수량을 구하시오
-- 단 두권 이상 구매한 고객만 구한다
select *
from book;

select custid, count(bookid)
from orders
where 2<=(select count(custid)
from orders)
group by custid; 

-- 출판사별로 출판사의 평균 도서 가격보다 비싼 도서를 구하시오 
-- > book이랑 book b 랑 같은거긴 하지만 publisher를 비교해주는거임 그래서 비교하려는 book의 퍼블리셔랑 b의 퍼블리셔가 같으면
-- 그것의 가격의 avg를 구해라....!!!!
select bookname
from book
where price>(select avg(b.price)
from book b where book.publisher = b.publisher);

-- 고객별 구매한 도서 수량을 출력하기
-- group by 잘 쓰고 outer join 잘하기
-- 박세리 같은경우엔 0번 구매해서 0도 출력하려면 outer join 해야한다 inner join은 값이 있을때만 나오기 땜에
select name, count(orders.custid) as 구매수량
from customer
left outer join orders
on customer.custid=orders.custid
group by customer.custid;

-- 도서별 판매수량 출력하기
select bookname, price, count(orders.bookid) as 판매수량
from orders,book
where orders.bookid=book.bookid
group by bookname;