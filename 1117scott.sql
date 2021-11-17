-- 기본키를 지정하는 경우
create table newbook(
bookid int,
bookname varchar(20),
publisher varchar(20),
price int,
primary key (bookid)
);

drop table newbook;
-- 복합키를 지정하는 경우(bookname, publisher)
-- bookid 속성이 없어서 두 개의 속성 bookname, publisher가 기본키가 된다면 괄호를 사용하여 복합키를 지정
create table newbook(
bookname varchar(20),
publisher varchar(20),
price int,
primary key(bookname,publisher)
);

drop table newbook;

-- 제약 조건이 있는 테이블 생성
-- bookname은 null값을 가질 수 없다
-- publisher는 같은 값이 있으면 안된다
-- price에 값이 입력되지 않을 경우 기본 값 10000을 저장한다. 또 가격은 최소 2000원 이상으로 한다.
create table newbook(
bookname varchar(20) not null,
publisher varchar(20) unique,
price int default 10000 check(price>2000),
primary key(bookname,publisher)
);

create table newcustomer(
custid int primary key,
name varchar(40),
address varchar(40),
phone varchar(30)
);
-- 제약 조건이 있는 테이블 생성
-- 부모테이블의 데이터가 삭제되는 경우 자식 테이블의 데이터 연쇄 삭제
create table neworders(
orderid int,
custid int not null,
bookid int not null,
saleprice int,
orderdate date,
primary key (orderid),
foreign key (custid) references newcustomer(custid) on delete cascade
);

-- 테이블 변경 연습문제
-- newbook 테이블의 varchar(13)의 자료형을 가진 isbn속성을 추가하기
alter table newbook
add isbn varchar(13);
-- new book table의 isbn속성의 데이터 타입을 int형으로 변경하기
alter table newbook
modify isbn int;
-- new book 테이블의 isbn 속성 삭제하기
alter table newbook
drop column isbn;

-- new book 테이블의 number 자료형을 가진 bookid 속성 추가하기
-- number 자료형= numeric
alter table newbook
add bookid numeric;
-- new book 테이블의 bookid속성에 notnull 제약 조건을 적용하기
alter table newbook
modify bookid int not null;
-- new book 테이블의 bookid 속성을 기본키로 변경하기
-- 먼저 기본키를 변경하려면 기본키 속성을 삭제 한 후 다시 설정해야함
alter table newbook drop primary key;

alter table newbook add constraint primary key(bookid);
-- 키 확인
desc newbook;

select *
from newbook;

-- 테이블 삭제 연습문제
select * from information_schema.table_constraints where table_name = 'newcustomer';

alter table neworders drop constraint primary;
alter table newcustomer drop foreign key PRIMARY; -- ???????????????????????????????????????????
-- new customer 가 외래키 제약조건 때문에 neworders랑 참조되어있어서 삭제못한다
select * from information_schema.table_constraints;

-- 뷰 생성하기
-- 부서가 20번에서 근무하는 직원들 정보만 보여주는 뷰
create view vw_emp20
as(select empno, ename, job, deptno
from emp
where deptno=20);

select *
from vw_book;

-- book 테이블에서 '축구'라는 문구가 포함된 자료만 보여주는 뷰
create view vw_book
as
select *
from book
where bookname like '%축구%';

-- 예제
-- 주소에 '대한민국'을 포함하는 고객들로 구성된 뷰를 만들고 조회하시오
-- 뷰의 이름은 vw_customer로 설정하시오
create view vw_customer
as select *
from customer
where address like '%대한민국%';

select *
from orders;

drop view vw_orders;
-- 연습문제
-- orders 테이블에 고객 이름과 도서 이름을 바로 확인할 수 있는 뷰를 생성한 후
-- '김연아' 고객이 구입한 도서의 주문번호, 도서이름, 주문액을 보이시오
create view vw_orders
as select orderid, bookname, salesprice
from orders, customer,book
where orders.custid=customer.custid and
book.bookid=orders.bookid and
name like '%김연아%';

select *
from highorders;

-- 뷰의 수정
-- vw_customer는 주소가 대한민국인 고객을 보여준다. 이 뷰를 영국을 주소로 가진 고객으로 변경하시오
-- phone 속성은 필요 없으므로 제외시키시오
create or replace view vw_customer(custid, name, address) as
select custid, name, address
from customer
where address like '%영국%';

-- 뷰의 삭제
drop view vw_customer;

-- 연습문제
-- 판매가격이 20000원 이상인 도서의 도서번호, 도서이름, 고객이름, 출판사, 판매가격을 보여주는 highorders 뷰를 생성
create or replace view highorders as
select book.bookid,bookname,name,publisher,salesprice
from customer,book,orders
where customer.custid=orders.custid and book.bookid=orders.bookid and
salesprice>=20000;
-- 생성한 뷰를 이용하여 판매된 도서의 이름과 고객의 이름을 출력하는 sql문을 작성하시오
select bookname, name
from highorders;
-- highorders view를 변경하고자 한다. 판매가격 속성을 삭제하는 명령을 수행하시오
-- 삭제 후 위의 도서 이름과 고객의 이름을 출력하는 sql문을 다시 수행하시오
create or replace view highorders (bookid,bookname,name,publisher) as
select book.bookid,bookname,name,publisher
from customer,book,orders
where customer.custid=orders.custid and book.bookid=orders.bookid and
salesprice>=20000;

select bookname, name
from highorders;

select *
from highorders;

-- 인덱스
create index ix_book
on book(bookname);

select *
from book
where publisher='대한미디어' and price >=30000;

select * from dept_tcl;

-- dept 테이블을 복사해서 dept_tcl 테이블 만들기
create table dept_tcl
as select * from dept;

-- dept 테이블을 복사해서 데이터 입력, 수정, 삭제하기
insert into dept_tcl values(50,'database','seoul');
update dept_tcl set loc = 'busan' where deptno = 40;
delete from dept_tcl where dname = 'research';

-- rollback 명령으로 취소하기
rollback;
-- dept 테이블을 복사해서 데이터 입력, 수정, 삭제하기
insert into dept_tcl values(50, 'network', 'seoul');
update dept_tcl set loc = 'busan' where deptno = 20;
delete from dept_tcl where deptno = 40;
-- commit 으로 반영하기
commit;

-- 프로시저
use scottdb;

delimiter $$
create procedure insertbook(
	in mybookid integer,
	in mybookname varchar(40),
	in mypublisher varchar(40),
	in myprice integer)
begin
	insert into book(bookid, bookname,publisher, price)
	values (mybookid, mybookname, mypublisher, myprice);
end $$ 
delimiter ;

call insertbook(100, '도리안그레이의 초상', '몰라', 12000);

-- 같은 도서가 있는지 확인 후 삽입
delimiter //
create procedure bookinsertorupdate(
	mybookid integer,
    mybookname varchar(40),
    mypublisher varchar(40),
    myprice int)
begin
	declare mycount integer;
    select count(*) into mycount from book where bookname like mybookname;
    if mycount!=0 then
    set sql_safe_updates=0; -- delete, update 연산에 필요한 설정문
    update book set price = myprice
    where bookname like mybookname;
    else
    insert into book(bookid, bookname, publisher, price)
    values(mybookid, mybookname, mypublisher, myprice);
    end if;
    end; //
    delimiter ;
    
    -- 15번 튜플 삽입 결과 확인
    call bookinsertorupdate(15, '스포츠 즐거움', '땡땡과학서적', 25000); 
    select * from book;
    -- 15번 튜플 가격 변경 확인
    call bookinsertorupdate(15, '스포츠 즐거움', '땡땡과학서적', 20000);
    
    -- 결과를 반환하는 프로시저
    delimiter //
    create procedure averageprice(
    out averageval integer)
    begin
		select avg(price) into averageval from book
        where price is not null;
	end;
    //
    delimiter ;
    
    -- 프로시저 averageprice 테스트
    -- myvalue는 그냥 변수명 일 뿐!! averageprice를 구해온 값을 담아주는 변수 @myvalue
    call averageprice(@myvalue);
    select @myvalue;
    
    -- 커서 키워드
   delimiter //
   create procedure interest()
   begin
	declare myinterest integer default 0.0;
    declare price integer;
    declare endofrow boolean default false;
    declare interestcursor cursor for
		select salesprice from orders;
	declare continue handler -- 행의 끝이면, endOfRow --> true
		for not found set endofrow = true;
	open interestcursor; -- 커서 열기
    cursor_loop : LOOP
		fetch interestcursor into price; -- 테이블의 첫번째 판매가를 price에 대입
        if endofrow then leave cursor_loop;
        end if;
        if price>=30000 then set myinterest = myinterest + price * 0.1;
        else set myinterest = myinterest+price*0.05;
        end if;
	end LOOP cursor_loop;
    close interestcursor;
    select concat('전체 이익 금액 =', myinterest);
end; //
delimiter ;

drop procedure if exists interest; -- 프로시저 잘못 만들었을 때 삭제

call interest(); -- select 문이 procedure 안에 들어있어서 실행하면 테이블이 뜬다

-- 새로운 도서를 삽입한 후 자동으로 book_log 테이블에 삽입한 내용을 기록하는 트리거
create table book_log(
bookid_l integer,
bookname_l varchar(40),
publisher_l varchar(40),
price_l integer);

select * from book_log;
select * from book;

delimiter //
create trigger afterinsertbook
	after insert on book
    for each row
begin
	insert into book_log values(new.bookid, new.bookname, new.publisher, new.price);
    -- new는 뭐냐면 after insert on 에서 after을 써줘서 after 후에 새롭게 만들겠다는 의미로 new고
    -- 만약에 before이라면 old키워드를 사용한대
end; //
delimiter ;

insert into book values(14, '스포츠 과학 1', '이상미디어', 25000);
select * from book where bookid=14; -- 원본 테이블 확인
select * from book_log where bookid_l='14'; -- 트리거 결과 확인
-- 트리거는 항상 원본테이블과 같이 비교하기!

-- 사용자 정의 함수
-- 입력된 값을 처리하여 결과값을 반환
-- 판매된 도서에 대한 이익을 계산하는 함수
delimiter //
create function fnc_interest(price integer)
returns int
begin
	declare myinterest integer; -- 가격이 30000원 이상이면 10%, 30000원 미만이면 5%
    if price >=30000 then
		set myinterest = price * 0.1;
	else
		set myinterest :=price * 0.05; -- 오른쪽에 있는거를 왼쪽에다가 넣는거 :=  그런데 =이랑 똑같은 기능임
	end if;
    return myinterest;
end; //
delimiter ;
-- 위에꺼가 안만들어짐 --> 그 이유는 만들 수 잇는 권한이 없어서 ,,,,
-- 그래서 밑의 set global 뭐시기로 만들수 있는 권한을 준다!!
set global log_bin_trust_function_creators = on;

-- orders 테이블에서 각 주문에 대한 이익 출력  interest = 이익
select custid, orderid, salesprice, fnc_interest(salesprice) interest
from orders;

-- 연습문제
-- 새로 등록하는 insertcustomer() 프로시저 작성하기 (4개 입력)
select *
from customer;

desc customer;

delimiter $$
create procedure insertcustomer(
	in mycustid smallint,
    in myname varchar(40),
    in myaddress varchar(50),
    in myphone varchar(20))
begin
insert into customer(custid, name, address, phone)
values (mycustid,myname,myaddress,myphone);
end $$
delimiter ;

call insertcustomer(6,'정현주','대한민국 경기','010-2305-8913');

-- customer 테이블에서 데이터를 삭제할 경우 자동으로 customer_log 테이블에 삭제된 내용을 기록하는 트리거 작성하기
-- 삭제 되기 전에 백업을 위한 로그 = before
-- 빈 테이블 일단 만듬,,,,,,,

create table customer_log(
custid smallint,
name varchar(40),
address varchar(50),
phone varchar(20));

select *
from customer_log;

delimiter //
create trigger beforedeletecustomer
	before delete on customer
    for each row
begin
	insert into customer_log values (old.custid,old.name,old.address,old.phone);
end; //
delimiter ;

delete from customer; -- foreign key 제약조건땜에 안된다

delete
from customer
where custid=5; -- 대신 5번 박세리 지우면

select *
from customer_log; -- 여기에 들어옴 !! 완료