-- 연습문제
select job_id,count(*)
from employees
group by job_id;

select max(salary)-min(salary)
from employees;
-- self join
select e.employee_id, concat(e.first_name,e.last_name) as Name, e.salary, e.job_id, e.hire_date, e.manager_id, m.first_name
from employees e
inner join employees m
on e.manager_id=m.employee_id;

select last_name, hire_date
from employees
where hire_date like '1994%';
-- hr 연습문제
select first_name, job_id, departments.department_id, department_name
from departments
inner join employees
on departments.department_id=employees.department_id
where location_id=1800;
-- 2번 잘 안됨.... 성이 Matos와 Taylor인 직원의 성, 직무 아이디, 입사일을 입사일 기준 오름차순으로 출력하기
-- last_name 에 matos랑 taylor가 있어서 안뜬것,, 나는 first_name으로 잘못함;;ㄷ
select last_name, job_id, hire_date
from employees
where last_name in ('Matos' ,'Taylor')
order by hire_date asc;
-- 사원 정보 테이블에서 모든 사원의 성과 연봉을 "성 : 1 Year Salary = $연봉" 형식으로 출력하고,
-- 1 Year Salary라는 별칭을 붙여 출력하시오
select concat('성: ',last_name), concat('1 Year Salary = $',salary) as '1 Year Salary'
from employees;
-- 연습문제
select concat(upper(first_name),' ' ,upper(last_name),' is a ') as Employee, upper(job_id) as JOBs
from employees
where last_name like '%s';

select concat(first_name,last_name) as Name, salary, ifnull(salary*(1+commission_pct),'Salary only')
from employees
order by salary desc;
-- 연습문제
select concat(first_name,last_name) as Name, hire_date, dayofweek(hire_date)
from employees
order by dayofweek(hire_date) asc;
-- self 조인을 하는문제
-- distinct 를 count 안에다가 넣어주어야 18명이 나오고, count 밖에다가 하면 106명이된다...
select count(distinct e.manager_id)
from employees e
inner join employees m
where e.manager_id= m.employee_id;

select department_id as DEPARTMENT_ID, sum(salary) as SUM_Salary, avg(salary) as Avg_Salary, max(salary) as Max_Salary,
	min(salary) as Min_Salary, concat_ws('$',DEPARTMENT_ID,sum(salary),avg(salary),max(salary),min(salary))
    from employees
    where department_id is not null
    group by department_id;
    
-- 연습문제 hr
select department_id, employee_id,last_name, salary
from employees
group by department_id
having salary>=max(salary)
order by salary desc;

select job_title, sum(salary) as sumSalary
from employees
inner join jobs
on jobs.job_id=employees.job_id
group by job_title
order by sumSalary desc;
-- 각 사원에 대해서 사번 , 이름, 부서명, 매니저의 이름을 출력 
-- e.manager_id = m.employee_id 에서 e랑 m을 바꿔서 썼는데 잘 보고 쓰기
select e.employee_id, e.first_name, d.department_name, m.first_name
from employees e
inner join departments d
on e.department_id=d.department_id
inner join employees m
on e.manager_id=m.employee_id;
-- 자신의 매니저보다 채용일이 빠른 사원의 사번, 성, 채용일을 출력 
-- hire_date를 hiredate라고 계속 사용해서 오류가 났었음........ 잘 확인하고 쓰기..... navigation bar 이용해서 변수 다 확인
select e.employee_id, e.last_name, e.hire_date
from employees e
inner join employees m
on e.manager_id=m.employee_id
where e.hire_date <
(select m.hire_date
from employees m
where e.manager_id = m.employee_id);

select * from employees;

select employee_id, last_name, salary
from employees e
where salary > (select avg(salary)
from employees m
where e.department_id = m.department_id);