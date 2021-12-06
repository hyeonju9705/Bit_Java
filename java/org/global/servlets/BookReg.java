package org.global.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.global.beans.BookBean2;

/**
 * Servlet implementation class BookReg
 */
@WebServlet("/BookReg")
public class BookReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookReg() {
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
		request.setCharacterEncoding("UTF-8");
		String bookid=request.getParameter("bookid");
		String bookname=request.getParameter("bookname");
		String publisher=request.getParameter("publisher");
		int price=Integer.parseInt(request.getParameter("price"));
		BookBean2 book = new BookBean2(bookid,bookname,publisher,price);
		request.setAttribute("book", book); //요청정보에 속성으로 추가
		RequestDispatcher rd=request.getRequestDispatcher("bookResult.jsp");
		rd.forward(request, response);
	}

}
