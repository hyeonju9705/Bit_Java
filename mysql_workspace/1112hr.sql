desc employees;
select * from jobs;
select * from countries;
-- employees 테이블에서 급여가 12000이상인 직원의 성과 급여 출력하기 
select last_name,salary
from employees
where salary>=12000;
-- 부서 번호가 20 혹은 50인 직원의 성 과 부서번호를 성에 대하여 오름차순으로 출력하기 
select last_name, department_id
from employees
where department_id=20 or department_id=50
order by last_name;
-- 성의 세번째에 a가 들어가는 직원의 성 출력하기 
select last_name
from employees
where last_name like '__a%';

-- 사원정보 
select last_name as Name, job_id as Job, salary, salary+100 as IncreaseAnn_Salary,
salary/12+100 as IncreaseSalary
from employees;

select last_name, hire_date
from employees
where hire_date like '1994%';
-- 연습문제 scott/hr
select job_id,count(*)
from employees
group by job_id;

select max(salary)-min(salary)
from employees;
-- hr연습문제 
select distinct job_id, department_id
from employees;
-- 행수 안맞음 75헹 출력..?
select concat(first_name,last_name) as Name, salary
from employees
where salary between 7000 and 10000
order by salary;

select concat(first_name,last_name) as 'e or o Name'
from employees
where last_name like '%e%' or '%o%';
-- 0명 나오는게 맞음
select  concat(first_name,last_name) as 'Name', job_id,hire_date
from employees
where hire_date between '20-MAY-2006' and '20-MAY-2007'
order by hire_date desc;

select concat(first_name,last_name) as 'Name', salary, job_id, commission_pct
from employees
order by salary desc, commission_pct desc;

