package org.global.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class update
 */
@WebServlet("/updateProc.do")
public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public update() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String userId=request.getParameter("userId");
		String userPwd=request.getParameter("userPwd");
		String userName=request.getParameter("userName");
		String phoneNo=request.getParameter("phoneNo");
		String address=request.getParameter("address");
		String email=request.getParameter("email");
		String url="jdbc:mysql://localhost:3306/scottDB?useSSL=false";
		String dbId="scott",dbPwd="tiger";
		Connection conn=null;
		String sql=null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		HttpSession session = request.getSession(); //servlet에서 세션 생성시 필요
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,dbId,dbPwd);
			/* out.println("데이터베이스 연결 성공"); */
		sql= "update Members2 set userPwd=? ,userName=?,phoneNo=?,address=?,email=? where userId=?";
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1,userPwd);
		pstmt.setString(2,userName);
		pstmt.setString(3,phoneNo);
		pstmt.setString(4,address);
		pstmt.setString(5,email);
		pstmt.setString(6,userId);
		pstmt.executeUpdate();
		sql="select * from Members2 where userId=?"; //이렇게 하면 콜럼 1번부터 쫘라락 나오는데 이거를 getString(n)으로 사용가능
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1,userId);
		rs=pstmt.executeQuery();
		rs.next();

		session.setAttribute("userId",rs.getString(1)); //세션 생성
		response.sendRedirect("updateResult.jsp");
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}catch(SQLException e){
		e.printStackTrace();
	}
	finally{
		
	}

}
}
