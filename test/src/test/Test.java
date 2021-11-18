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
		System.out.println("���� ��ȣ�� å �̸��� �Է��ϼ��� >> ");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		   try {
		         Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/scottDB?useSSl=false","scott","tiger");
		         System.out.println("DB ���� ����");
//		         Statement stmt = conn.createStatement();
//		         
//		         String sql = String.format("insert into book (bookid, bookname) values (%d, '%s')", 
//		        		 scan.nextInt(), scan.next());
//		         stmt.executeUpdate(sql); //�μ�Ʈ ������ �ۼ�
		         
//		         String sql = "insert into book values(?, ?, ?, ?)"; // ?�� �����ٰ� setInt,setString�� �� �մ°�
		         //����ǥ ������ŭ set�� �־����
//		         PreparedStatement pstmt = conn.prepareStatement(sql);
//		         pstmt.setInt(1,36); // 1�� ����ǥ �ε���, ù��° ����ǥ ��¶�
//		         pstmt.setString(2, "�ູ�� ����");
//		         pstmt.setString(3, "���ϵ� ���ǻ�");
//		         pstmt.setInt(4, 12000);
		         
//		         pstmt.executeUpdate();
		         
		         // ��� �޿��� ���� ���� �μ��� ���� �μ��� ��ȣ�� ����Ͻÿ� ???????????????????????????????
		         PreparedStatement pstmt = conn.prepareStatement("select deptno, sal "
		         		+ "from emp "
		         		+ "where avg(sal) in "
		         		+ "(select max(avg(sal)), min(avg(sal))"
		         		+ "from emp group by deptno)");
		         
		         //salesman�� �����ϰ� �� ������ ����� �� �޿��� 3000�̻��� �� ������ ���ؼ�, ������� �� ������ ��ձ޿��� ����Ͻÿ�
		         // �� , ��� �޿��� ������������ ��� ??????????????????????????????????????????????????????????????????????????????
//		         PreparedStatement pstmt = conn.prepareStatement("select job, avg(sal)"
//		         		+ "from emp"
//		         		+ "where job not in( 'salesman') and sum(sal)>=3000"
//		         		+ "group by avg(sal) desc");
		         
		         // ��ü ��� ��� ���� ����� �ִ� ����� ���� ����Ͻÿ�
		        // PreparedStatement pstmt = conn.prepareStatement("select count(mgr) from emp");
		         
		         // emp ���̺��� �̸�, �޿�, Ŀ�̼� �ݾ�, �Ѿ�(sal+comm)�� ���Ͽ� �Ѿ��� ���� ������� ���
		         // ��, Ŀ�̼��� null�� ����� ����
//		         PreparedStatement pstmt = conn.prepareStatement("select ename, sal, comm, sal+comm\r\n"
//		         		+ "from emp\r\n"
//		         		+ "where comm is not null\r\n"
//		         		+ "order by sal+comm desc");
		         
		         // �� �μ����� ���� ������ �ϴ� ����� �ο����� ���Ͽ� �μ���ȣ, ���� �̸�, �ο� ���� ���
//		         PreparedStatement pstmt = conn.prepareStatement("select deptno, job, count(job)\r\n"
//		         		+ "from emp\r\n"
//		         		+ "group by job");
		         
		         // ����� �� �� ���� �μ��� �̸��� ���
//		         PreparedStatement pstmt = conn.prepareStatement("select dname\r\n"
//		         		+ "from dept\r\n"
//		         		+ "left outer join emp\r\n"
//		         		+ "on dept.deptno=emp.deptno \r\n"
//		         		+ "where dept.deptno not in (select deptno\r\n"
//		         		+ "from emp)");
		         
		         // ���� ������ �ϴ� ����� ���� 4�� �̻��� ������ �ο� ���� ���
//		         PreparedStatement pstmt = conn.prepareStatement("select job, count(job)\r\n"
//		         		+ "from emp\r\n"
//		         		+ "group by job\r\n"
//		         		+ "having count(job)>=4");
		  
		         // �����ȣ�� 7400�̻�, 7600������ ����� �̸� ���
//		         PreparedStatement pstmt = conn.prepareStatement("select empno,ename\r\n"
//		         		+ "from emp\r\n"
//		         		+ "where empno between 7400 and 7600;");

		         
		         //		         pstmt.setInt(1, 36);
		         
		         ResultSet rs = pstmt.executeQuery();
//		         sql = "select * from Book";
//		         
//		         ResultSet rs = stmt.executeQuery(sql); // ResultSet���� ��� ��ȯ
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
