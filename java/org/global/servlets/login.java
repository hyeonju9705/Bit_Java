package org.global.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/loginProc.do") //폴더에 들어있다면 폴더명/loginProc.do해도됨
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
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
		String url="jdbc:mysql://localhost:3306/scottDB?useSSL=false";
		String dbId="scott",dbPwd="tiger";
		Connection conn=null;
		String sql=null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8"); //printwriter 객체생성 전에 선언 해줘야함
		HttpSession session = request.getSession(); //servlet에서 세션 생성시 필요
		PrintWriter writer = response.getWriter(); //script alert 사용하려면 printWriter 사용해야함
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,dbId,dbPwd);
			/* out.println("데이터베이스 연결 성공"); */
			
			if (request.getMethod().equals("POST")) {
				String userId=request.getParameter("userId"); //id get방식으로 받아옴
				String userPwd=request.getParameter("userPwd");
				
				/* 유효성 처리 */
				if (userId.isEmpty() || userPwd.isEmpty()) {
					RequestDispatcher rd = request.getRequestDispatcher("loginFrm.jsp");
					rd.forward(request, response);
				}
				/* 로그인 처리 */
				sql= "select userPwd from Members2 where userid = ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1,userId);
				rs=pstmt.executeQuery(); 
				if(rs.next()){//회원인 경우 = 데이터베이스에 아이디가 잇음
					if(rs.getString(1).equals(userPwd)){
						System.out.print("로그인성공");
						session.setAttribute("userId",userId); //세션 생성
						response.sendRedirect("loginResult.jsp"); //redirect
					}else if(rs.getString(1).equals(userId)){
						writer.print("<script>alert('비밀번호 불일치');history.back();</script>");
					}
				}else{ //데이터베이스에 아이디가 없는경우
					writer.print("<script>alert('아이디 불일치');history.back();</script>");
					//안 됐던 이유 : 데이터 베이스에 아이디가 없을 때를 안적어줌
				}
				
			}

		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			try {
				writer.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
