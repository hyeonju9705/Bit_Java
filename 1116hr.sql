select job_id,avg(salary) 
from employees 
group by job_id
having job_id not in('clerk') and avg(salary)>10000;

select job_id, salary*(1+(
case job_id
	when 'hr_rep' then 0.1
    when 'mk_rep' then 0.12
    when 'pr_rep' then 0.15
    when 'sa_rep' then 0.18
	when 'it_prog' then 0.2
    else 0
    end)) as '급여 인상안'
from employees
group by job_id;  

select hire_date,salary*(
case year(hire_date)
	when 1987 then 1.05
    when 1989 then 1.03
    when 1990 then 1.01
    else 1
    end) as 급여
from employees
where year(hire_date) between 1987 and 1990
group by hire_date
order by hire_date asc;

select department_id, sum(salary), 
case
	when sum(salary)>100000 then 'Excellent'
    when sum(salary)>50000 then 'Good'
    when sum(salary)>10000 then 'Medium'
    when sum(salary)<=10000 then 'Well'
    else ''
    end
    as result
from employees
where department_id is not null
group by department_id;