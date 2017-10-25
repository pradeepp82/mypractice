

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
import javax.websocket.Session;

//import org.apache.jasper.compiler.Node.IncludeAction;

/**
 * Servlet implementation class StudentRegistered
 */
@WebServlet("/StudentRegistered")
public class StudentRegistered extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String rollno = request.getParameter("rollno");
		String sem = request.getParameter("sem");
		String marks = request.getParameter("marks");
		
		HttpSession session = request.getSession(false);
		if(session!=null){
			
			String pass=(String)session.getAttribute("pass");
		try{
			if(name.equals("")||email.equals("")||rollno.equals("")||marks.equals("")||sem.equals("")){
				//RequestDispatcher rd = request.getRequestDispatcher("StudentRegistration.html");
				//rd.include(request, response);
				response.sendRedirect("http://localhost:8080/StudentManagement2/StudentRegistration.html");
			    
			} else
			{
		   	
		    Class.forName("com.mysql.jdbc.Driver");  
		    java.sql.Connection con=DriverManager.getConnection(  
		    "jdbc:mysql://localhost:3306/Student","root","root"); 
		    
		     PreparedStatement pst = con.prepareStatement("INSERT INTO Student_data"
		    		+ "(Name,Email,Rollno,Marks,Sem) VALUES"
		    		+ "(?,?,?,?,?)");
	        pst.setString(1,name);
	        pst.setString(2,email);
	        pst.setString(3,rollno);
	        pst.setString(4,marks);
	        pst.setString(5,sem);
	        int rs =pst.executeUpdate();
	         if(rs==1){
	        	 response.sendRedirect("http://localhost:8080/StudentManagement2/StudentRegisterd.html");
	        	    //pw.print("student add succesfully");
	        	 //RequestDispatcher rd =request.getRequestDispatcher("StudentRegistration.html");
	        	// rd.include(request, response);
	        	 
	         }
	        
	        	
	        
	        
		}}catch (Exception e) {
			e.printStackTrace();
		}
		}else{
			  response.sendRedirect("Adminlogin.html");
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