select concat('성:',last_name),concat('Year Salary = $',salary) as 'Year Salary'
from employees;

select employee_id, concat(first_name,last_name) as Name, salary, round(salary*1.123) as 'Increase Salary'
from employees
where department_id=60;
