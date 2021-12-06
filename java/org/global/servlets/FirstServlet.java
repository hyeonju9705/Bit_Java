package org.global.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/hello2") //요즘은 이렇게 url매핑 하는 추세 -> 가급적 어노테이션@활용
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      @Override
     public void init() throws ServletException{
    	  System.out.println("init() 실행됨");
    	  //init은 한번만 실행 service는 계속 실행
      }
      @Override
      protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
    	  System.out.println("service()실행됨");
      }
     
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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
		doGet(request, response);
	}

}
