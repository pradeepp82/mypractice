

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Student_task
 */
@WebServlet("/Student_task")
public class Student_task extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  //HttpSession session = request.getSession();
		 PrintWriter pw = response.getWriter();
		 response.setContentType("text/html");
		 String name = request.getParameter("name");
		 String pass = request.getParameter("pass");
		 try{
			   
			   if(name.equals("") || pass.equals("")){
				   
				    
				   response.sendRedirect("http://localhost:8080/StudentManagement2/Studentlogin.html"); 
			   }
			   
			   Class.forName("com.mysql.jdbc.Driver");  
			   java.sql.Connection con=DriverManager.getConnection(  
			   "jdbc:mysql://localhost:3306/Student","root","root"); 
			    PreparedStatement pst = con.prepareStatement("select * from Student_data where Name= ? and Rollno= ?");
		        pst.setString(1,name);
		        pst.setString(2,pass);
		        ResultSet rs =pst.executeQuery();
		     
		      if(rs.next()){
		    	 
		           
		           
		        	   
		              int id  = rs.getInt("Id");
		              String age = rs.getString("name");
		              String first = rs.getString("Email");
		              String last = rs.getString("Rollno");
		              String Sem = rs.getString("Sem");
		              HttpSession session = request.getSession();
		              session.setAttribute("id", id);
          
		             pw.print("<center>Student_ID: " + id + "<br>"+
		              "Name: " + age + "<br>"+
		              "Email: " + first + "<br>"+
		              "Rollno: " + last + "<br>"+
		              "want to see the result"+
		              "<a href= http://localhost:8080/StudentManagement2/Result.jsp> result</a>"+
		            		 "</center>");        
		              		               
		            		 
		          
		      }else{
		    	   
		    		  response.sendRedirect("http://localhost:8080/StudentManagement2/Studentlogin.html");
		    		 
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
