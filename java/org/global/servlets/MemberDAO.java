package org.global.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.global.beans.MemberDTO;

/**
 * Servlet implementation class MemberDAO
 */

public class MemberDAO {
	private static final long serialVersionUID = 1L;

	private static MemberDAO dao = new MemberDAO();

	private MemberDAO() {
	}

	public static MemberDAO getInstance() {
		return dao;
	}

	public Connection getConnection() throws SQLException {// DB 연결 객체 반환}

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, dbId, dbPwd);
			/* out.println("데이터베이스 연결 성공"); */
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			return null;
		}
	}

	public void close(Connection conn, PreparedStatement pstmt, ResultSet rs) throws SQLException {
		conn.close();
	} // 연결 닫기

	public void close(Connection conn, PreparedStatement pstmt) throws SQLException {
		conn.close();
	} // 연결 닫기

	public ArrayList<MemberDTO> selectMemberAll() throws SQLException {
		sql = "select * from Members2";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		rs.next();
	} // 모든 멤버 조회

	public MemberDTO selectMember(String userId) throws SQLException {
		sql = "select * from Members2 where userid=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, userId);
		rs = pstmt.executeQuery();
	} // 특정 멤버 조회

	public int insertMember(MemberDTO dto) {

		sql = "insert into Members(userId,userPwd,userName,phoneNo,address,email) values(?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql); // db에 insert
		pstmt.setString(1, userId);
		pstmt.setString(2, userPwd);
		pstmt.setString(3, userName);
		pstmt.setString(4, phoneNo);
		pstmt.setString(5, address);
		pstmt.setString(6, email);
		pstmt.executeUpdate();
	} // 회원 정보 삽입

	public int updateMember(MemberDTO dto) {
		sql = "update Member2 set userId=? where userId=?";
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1,userPwd);
		pstmt.executeUpdate();
	} // 모든 멤버 수정

	public int deleteMember(String userId) {
		sql="delete from Member2 where userId=?";
		pstmt= conn.prepareStatement(sql);
		pstmt.setString(1,userPwd);
		pstmt.executeUpdate();
	} // 특정 멤버 삭제

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
		doGet(request, response);
	}

}
