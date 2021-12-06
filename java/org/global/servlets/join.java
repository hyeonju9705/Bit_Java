package org.global.servlets;

import java.io.IOException;
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

import org.global.beans.Members2;

/**
 * Servlet implementation class join
 */
@WebServlet("/joinProc.do")
public class join extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public join() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userId = request.getParameter("userId"); // joinForm에서 받은 name의 정보를 getParameter로 String userId에저장
		String userPwd = request.getParameter("userPwd");
		String userName = request.getParameter("userName");
		String phoneNo = request.getParameter("phoneNo");
		String address = request.getParameter("address");
		String email = request.getParameter("email");

		String url = "jdbc:mysql://localhost:3306/scottDB?useSSL=false";
		String dbId = "scott", dbPwd = "tiger";
		Connection conn = null;
		String sql = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			request.setCharacterEncoding("UTF-8");
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbId, dbPwd);
			Members2 mb2 = new Members2(userId, userPwd, userName, phoneNo, address, email);
			sql = "insert into Members2 (userId,userPwd,userName,phoneNo,address,email) values(?,?,?,?,?,?);";
			pstmt = conn.prepareStatement(sql); // db에 insert
			pstmt.setString(1, userId);
			pstmt.setString(2, userPwd);
			pstmt.setString(3, userName);
			pstmt.setString(4, phoneNo);
			pstmt.setString(5, address);
			pstmt.setString(6, email);
			pstmt.executeUpdate();

			sql = "select * from Members2 where userId=?"; // 사용자가 입력한 userId랑 같은 것의 테이블 정보를 다 가져옴
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			rs.next();

			RequestDispatcher rd = getServletContext().getRequestDispatcher("/joinResult.jsp");
			rd.forward(request, response);
			/* response.sendRedirect(sql); forward는 하나를 거쳐서 보내기땜시 url이 joinResult로 안바뀌는데,
			 * sendRedirect로 하면 바로 보내버리라는 뜻이어서 url이 joinResult로 바뀜!! 이 방식이 좋은 방식인듯하다 */
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
