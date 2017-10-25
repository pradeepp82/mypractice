

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlet4preview.RequestDispatcher;

/**
 * Servlet implementation class First
 */
//@WebServlet("/First")
public class First extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();
		 String uname = request.getParameter("uname");
		 String upass = request.getParameter("upass");
		 try{
			 if(uname.equalsIgnoreCase("pradeep")&&upass.equalsIgnoreCase("12345")){
				 HttpSession session = request.getSession();
				 session.setAttribute("user", uname);
				 javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("Second");
				 rd.forward(request, response);
			 }else{
				 javax.servlet.RequestDispatcher rd = request.getRequestDispatcher("login.html");
				 rd.include(request, response);
			 }
		 }finally {
			pw.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
