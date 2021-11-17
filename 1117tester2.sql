   -- 연습문제
   -- 성이 biri인 사원의 근무 일수 출력
   select last_name, (curdate(),start_date) as 근무일수
   from s_emp
   where last_name like'%Biri%';
   
   -- 모든 사원이 근무한지 몇 주가 지났는지 를 출력
   select first_name, FLOOR(datediff(curdate(),start_date)/7) as 근무주수
   from s_emp;
   
   -- 각 부서별로 실적에 따라 급여를 다르게 인상하고자 한다
   -- 10번과 50번 부서는 각각 10%, 20% 인상을 하고 나머지 부서는 동결할 경우의 급여를 출력
   -- commision pct를 바꿔야하나..?
   select dept_id, salary*(
   case dept_id
	when 10 then 1.1
    when 50 then 1.2
    else 1
    end) as 급여
    from s_emp
    group by dept_id;
    -- 사원의 이름과 매니저 사번을 출력하시오, 단 매니저가 없는 사원의 경우 top로 출력
    select first_name, ifnull(manager_id, 'TOP') as mgr_id
    from s_emp;
    
    -- 매월 1,3주 토요일은 휴무이다. 현재 월의 휴무일을 출력하시오 ????????????? 어거지로 구한것..

    SELECT LAST_DAY(NOW() - interval 1 month) + interval 1 DAY+ -- 이 달의 첫번째 날짜를 구하는 공식
    -- 설명을 하자면,,,,, now()를 하면 오늘날짜인 11/17일이 나온다. 근데 1달을 뺌 그러면 10/17일이됨 근데 이걸 last_day()로 구하면 
    -- 10/31일이 나옴!! 근데 1일을 더해 그러면 11/1이 되는것..
    7 -- 더하기 7을해서 2번째 주의 첫번째날 요일이 됨
    -dayofweek(LAST_DAY(NOW() - interval 1 month) + interval 1 DAY), -- dayofweek는 요일을 숫자로 구해주는 공식인데, 첫번째 날의 요일을 숫자로 구해줌, 근데 첫번째 날의 요일이 월요일이어서 2가됨... 한마디로 월요일-2해서 토요일이됨
    LAST_DAY(NOW() - interval 1 month) + interval 1 DAY+ -- 세번째 주 토요일도 구해줌 
    7
    -dayofweek(LAST_DAY(NOW() - interval 1 month) + interval 1 DAY)+interval 2 week;
    -- 31번 부서의 이름과 그 부서에 근무하는 사원의 이름을 출력하시오
    select name,first_name
    from s_dept,s_emp
    where s_dept.id=s_emp.dept_id and s_emp.dept_id=31;
    -- 2번 지역의 이름과 그곳에 있는 부서의 이름을 출력하시오
    select s_region.name, s_dept.name
    from s_dept, s_region
    where s_dept.region_id=s_region.id and region_id=2;
    
    -- 연습문제
    -- asia 지역 고객의 이름과 전화번호, 담당 영업 사원의 이름을 출력하시오
    select s_customer.name, phone, first_name
    from s_region,s_customer, s_emp
    where s_region.name='Asia' and s_region.id=s_customer.region_id and s_customer.sales_rep_id=s_emp.id;
    
    -- 모든 사원의 id, last_name, salary, 매니저의 last_name, 소속 부서의 name을 출력하시오 ????????? 10개만 나오면 안되는디,,,,,,,
    -- 매니저의 아이디와 employee 테이블의 manager아이디가 같아야하니까,,,,,,, on 조건절을 잘못쓴 문제엿음
    select e.id,e.last_name '사원 성',e.salary,m.last_name as '매니저 성',d.name
    from s_emp e
    left outer join s_emp m
    on e.manager_id=m.id
    inner join s_dept d
    on d.id = e.dept_id
    order by e.id;
    
    -- 채현님 답
     select e.id, e.last_name, e.salary, m.last_name, d.name 
     from s_emp e 
     left outer join s_emp m on e.manager_id = m.id 
     left outer join  s_dept d on e.dept_id = d.id 
     order by e.id;
    
    -- 사원의 직무별로 급여의 평균과 최대, 최소 값을 구하시오
    select title,avg(salary), max(salary), min(salary)
    from s_emp
    group by title;
    
    select *
    from vw_region;
    -- 고객을 지역 별로 나눈 다음 다시 국가별로 나누어 명수를 구하시오 ??????? 이거 지역별로 나눈다음에 어떻게하누,,
    -- group by 두 번 쓰면 됨
   select s_customer.country, count(s_customer.id)
   from s_region, s_customer
   where s_customer.region_id=s_region.id and country is not null
   group by s_region.name, s_customer.country ;


  --   select s_customer.country, count(s_customer.id)
--     from s_customer
--     where country is not null
--     group by s_customer.country;
    
    -- stock clerk 직종의 사원들의 부서별 인원수를 출력하시오
    select dept_id, count(*)
    from s_emp
    where title like '%stock clerk%'
    group by dept_id;
    
    -- 신용등급별로 고객의 수를 출력하시오
    select credit_rating, count(*)
    from s_customer
    group by credit_rating;
    
    -- 직종별 최고 급여를 급여가 많은 직종부터 출력하기
    select title, max(salary)
    from s_emp
    group by title
    order by max(salary) desc;
    
    -- 사원이 3명 이상인 직종에 대해 직종별 평균 급여를 출력하기
    select title, avg(salary)
    from s_emp
    group by title
    having count(title)>=3;
    
    -- 부서별로 2명이상 근무하고 있는 직종만을 출력하기
    select dept_id, title
    from s_emp
    group by dept_id
    having count(dept_id)>=2;
    
    -- 각 부서별로 최고 급여를 받는 사원을 출력하기 
    -- in 을 써서 dept_id로 최고급여를 구햇을 때에 그 salary가 salary에 있는지 구하면 됨
    select dept_id, first_name
    from s_emp
	where salary in (select max(salary)
    from s_emp
    group by dept_id);
    
    -- 급여를 많이 받는 순서대로 상위 3명을 출력하기
    select *
    from 
    (select first_name, salary, rank()over(order by salary desc) as ranking
    from s_emp) as t
    where t.ranking <=3;
    
    -- 사원이 한명이라도 있는 부서명을 출력하기
    select s_dept.name, count(s_emp.id)
    from s_emp,s_dept
    where s_emp.dept_id=s_dept.id
    group by s_dept.name
    having count(s_emp.id)>=1;
    