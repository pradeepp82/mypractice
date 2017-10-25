

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.catalina.servlet4preview.RequestDispatcher;

import com.sun.corba.se.pept.transport.Connection;
import com.sun.media.sound.RealTimeSequencerProvider;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   PrintWriter pw = response.getWriter();
		   response.setContentType("text/html");
		   String name = request.getParameter("uname");
		   String pass = request.getParameter("pass");
		   
		   
		   try{
			   
			   if(name.equals("") || pass.equals("")){
				   
				    
				   response.sendRedirect("localhost:8080/StudentManagement2/ "); 
			   }
			   
			   Class.forName("com.mysql.jdbc.Driver");  
			   java.sql.Connection con=DriverManager.getConnection(  
			   "jdbc:mysql://localhost:3306/Student","root","root"); 
			    PreparedStatement pst = con.prepareStatement("select * from Admin where Name= ?   and Password= ?");
		        pst.setString(1,name);
		        pst.setString(2,pass);
		        ResultSet rs =pst.executeQuery();
		     
		      if(rs.next()){
		    	  HttpSession session = request.getSession();
		    	  session.setAttribute("pass", pass);
		          response.sendRedirect("http://localhost:8080/StudentManagement2/AdminTask.html");
		      }else{
		    	   
		    		  response.sendRedirect("http://localhost:8080/StudentManagement2/Adminlogin.html");
		    		 
		      }
		   }catch (Exception e) {
                  e.printStackTrace();
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
