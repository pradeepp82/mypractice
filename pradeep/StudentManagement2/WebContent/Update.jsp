<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Student Management</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
    /* Remove the navbar's default margin-bottom and rounded borders */ 
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    .jumbotron {
    //background-image: url("image/Students-studying-outdoors.jpg");
    //background-repeat: no-repeat;
    background-size: cover;
    width: 100%;
    height: 567px;
}

 form {
    padding-top: 25px;
}
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #222;
      padding: 25px;
    }
    footer p {
    color: blanchedalmond;
}
.jumbotron {
    padding-top: 30px;
    padding-bottom: 30px;
    margin-bottom: 0px;
    color: inherit;
    background-color: #eee;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    text-align:center;
}
  </style>
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">logo</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="http://localhost:8080/StudentManagement2/#">Home</a></li>
        <li><a href="#">About</a></li>
        <li><a href="#">Gallery</a></li>
        <li><a href="#">Contact</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="Adminlogin.html"><span ></span>Admin</a></li>
         <li><a href="logout.jsp"><span></span>logout</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron">
  <div class="container text-center">
     <%
         request.getSession(false);
if(session!=null){
	String pass=(String)session.getAttribute("pass");
	String name =(String)session.getAttribute("name");
	String rollno =(String)session.getAttribute("rollno");
	
	Class.forName("com.mysql.jdbc.Driver");  
    java.sql.Connection con=DriverManager.getConnection(  
    "jdbc:mysql://localhost:3306/Student","root","root"); 
     PreparedStatement pst = con.prepareStatement("select * from Student_data where Name= ?   and Rollno= ?");
   pst.setString(1,name);
   pst.setString(2,rollno);
   ResultSet rs =pst.executeQuery();
   if(rs.next()){
   	
          int id  = rs.getInt("Id");
		  String name1 = rs.getString("Name");
		  String email = rs.getString("Email");
		  String rollno1 = rs.getString("Rollno");
		  String sem = rs.getString("Sem");
		  String marks = rs.getString("Marks");
		    session.setAttribute("id", id);
     
      
    %>
    <center>
        <h3>Semester:</h3><% out.print(sem);%> 
    <form method="post">
    <table style="width:100%">
  <tr>
   
    <th>Name</th>
    <th>Email</th> 
    <th>Rollno</th>
    <th>Marks/500</th>
  </tr>
  <tr>
    <td><input type="text" name="name1"  value=<%= name1%>></td>
    <td><input type="email" name="email" value=<%= email%>></td>
    <td><input type="text" name="rollno" value=<%= rollno1 %>></td>
    <td><input type="text" name="marks" value=<%= marks%>></td>
  </tr>
   
  
</table><br><br>
<!-- <input type="submit" value="Update"/> -->
<input type="submit" name="update" value="Update Button">
<input type="submit" name="delete" value="Delete Button">
</form>
</center>
    <% 
		   
   }
     		  
}else{
	  response.sendRedirect("Adminlogin.html");
}
	
	
     String nameu =request.getParameter("name1");
     String emailu =request.getParameter("email");
     String rollnou =request.getParameter("rollno");
     String marksu =request.getParameter("marks");
     String update =request.getParameter("update");
     String delete =request.getParameter("delete");
      int id1 = (int)session.getAttribute("id");
      
     
     
     if (request.getParameter("update") != null) {
          

     	try{
			if(nameu.equals("")||emailu.equals("")||rollnou.equals("")||marksu.equals("")){
				 out.print("plz fill all the fields");
			    
			} else
			{
		   	
		    Class.forName("com.mysql.jdbc.Driver");  
		    java.sql.Connection con=DriverManager.getConnection(  
		    "jdbc:mysql://localhost:3306/Student","root","root"); 
		    
		     PreparedStatement pst = con.prepareStatement("UPDATE Student_data SET Name=?, Email=?, Rollno=?,Marks=? WHERE Id=?");
	           pst.setString(1,nameu);
	           pst.setString(2,emailu);
	           pst.setString(3,rollnou);
	           pst.setString(4,marksu);
	           pst.setInt(5,id1);
	       
	        int rs =pst.executeUpdate();
	         if(rs==1){
	        	 
	        	 out.print("updated");
	         }else{
	        	 out.print("sorry");
	         }
	        
	        	
	        
	           
	      	}}catch (Exception e) {
			e.printStackTrace();
		    } 
              }else if (request.getParameter("delete") != null) {
        	 try{
        		 int id =(int)session.getAttribute("id");
        		 
        		 Statement stmt = null;
     		   	
     		    Class.forName("com.mysql.jdbc.Driver");  
     		    java.sql.Connection con=DriverManager.getConnection(  
     		    "jdbc:mysql://localhost:3306/Student","root","root"); 
     		   PreparedStatement pst = con.prepareStatement("DELETE  from  Student_data WHERE Id = ?");
     		      pst.setInt(1,id1);
     	          
     		     int rs =pst.executeUpdate();
    	         if(rs==1){
    	        	 out.print("record deleted");
    	        	 //RequestDispatcher rd = request.getRequestDispatcher("StudentUpdate.jsp");
    	        	 //rd.include(request, response);
    	        	 
    	         }else{
    	        	 out.print("sorry");
    	         }
     	            
     	            
     		     } catch (Exception e) {
     			    e.printStackTrace();
     		} 
                   
       }

%>
     
  
  </div>
</div>
<footer class="container-fluid text-center">
  <p>&copy; Indore Institute of Science & Technology;</p>
</footer>

</body>
</html>
