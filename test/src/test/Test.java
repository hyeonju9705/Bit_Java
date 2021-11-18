package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("도서 번호와 책 이름을 입력하세요 >> ");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   try {
		         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottDB?useSSl=false","scott","tiger");
		         System.out.println("DB 연결 성공");
//		         Statement stmt = conn.createStatement();
//		         
//		         String sql = String.format("insert into book (bookid, bookname) values (%d, '%s')", 
//		        		 scan.nextInt(), scan.next());
//		         stmt.executeUpdate(sql); //인서트 쿼리문 작성
		         
//		         String sql = "insert into book values(?, ?, ?, ?)"; // ?인 곳에다가 setInt,setString할 수 잇는것
		         //물음표 갯수만큼 set이 있어야함
//		         PreparedStatement pstmt = conn.prepareStatement(sql);
//		         pstmt.setInt(1,36); // 1은 물음표 인덱스, 첫번째 물음표 라는뜻
//		         pstmt.setString(2, "행복한 왕자");
//		         pstmt.setString(3, "와일드 출판사");
//		         pstmt.setInt(4, 12000);
		         
//		         pstmt.executeUpdate();
		         
		         // 평균 급여가 가장 높은 부서와 낮은 부서의 번호를 출력하시오 ???????????????????????????????
		         PreparedStatement pstmt = conn.prepareStatement("select deptno, sal "
		         		+ "from emp "
		         		+ "where avg(sal) in "
		         		+ "(select max(avg(sal)), min(avg(sal))"
		         		+ "from emp group by deptno)");
		         
		         //salesman을 제외하고 각 업무별 사원의 총 급여가 3000이상인 각 업무에 대해서, 업무명과 각 업무별 평균급여를 출력하시오
		         // 단 , 평균 급여의 내림차순으로 출력 ??????????????????????????????????????????????????????????????????????????????
//		         PreparedStatement pstmt = conn.prepareStatement("select job, avg(sal)"
//		         		+ "from emp"
//		         		+ "where job not in( 'salesman') and sum(sal)>=3000"
//		         		+ "group by avg(sal) desc");
		         
		         // 전체 사원 가운데 직속 상관이 있는 사원의 수를 출력하시오
		        // PreparedStatement pstmt = conn.prepareStatement("select count(mgr) from emp");
		         
		         // emp 테이블에서 이름, 급여, 커미션 금액, 총액(sal+comm)을 구하여 총액이 많은 순서대로 출력
		         // 단, 커미션이 null인 사람은 제외
//		         PreparedStatement pstmt = conn.prepareStatement("select ename, sal, comm, sal+comm\r\n"
//		         		+ "from emp\r\n"
//		         		+ "where comm is not null\r\n"
//		         		+ "order by sal+comm desc");
		         
		         // 각 부서별로 같은 업무를 하는 사람의 인원수를 구하여 부서번호, 업무 이름, 인원 수를 출력
//		         PreparedStatement pstmt = conn.prepareStatement("select deptno, job, count(job)\r\n"
//		         		+ "from emp\r\n"
//		         		+ "group by job");
		         
		         // 사원이 한 명도 없는 부서의 이름을 출력
//		         PreparedStatement pstmt = conn.prepareStatement("select dname\r\n"
//		         		+ "from dept\r\n"
//		         		+ "left outer join emp\r\n"
//		         		+ "on dept.deptno=emp.deptno \r\n"
//		         		+ "where dept.deptno not in (select deptno\r\n"
//		         		+ "from emp)");
		         
		         // 같은 업무를 하는 사람의 수가 4명 이상인 업무와 인원 수를 출력
//		         PreparedStatement pstmt = conn.prepareStatement("select job, count(job)\r\n"
//		         		+ "from emp\r\n"
//		         		+ "group by job\r\n"
//		         		+ "having count(job)>=4");
		  
		         // 사원번호가 7400이상, 7600이하인 사원의 이름 출력
//		         PreparedStatement pstmt = conn.prepareStatement("select empno,ename\r\n"
//		         		+ "from emp\r\n"
//		         		+ "where empno between 7400 and 7600;");

		         
		         //		         pstmt.setInt(1, 36);
		         
		         ResultSet rs = pstmt.executeQuery();
//		         sql = "select * from Book";
//		         
//		         ResultSet rs = stmt.executeQuery(sql); // ResultSet으로 결과 반환
		         while(rs.next()) {
		            //System.out.printf("%s %s %s %s \n",rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
		            //System.out.printf("%s %s %s \n",rs.getString(1),rs.getString(2),rs.getString(3));
		        	System.out.printf("%s %s \n",rs.getString(1),rs.getString(2));
		            //System.out.printf("%s \n",rs.getString(1));
//		            System.out.print(rs.getString("bookid"));
//		            System.out.print(rs.getString("bookname"));
//		            System.out.println(rs.getString("publisher"));
		         }
		      }catch(SQLException e) {
		       e.printStackTrace();

	}

}
}
