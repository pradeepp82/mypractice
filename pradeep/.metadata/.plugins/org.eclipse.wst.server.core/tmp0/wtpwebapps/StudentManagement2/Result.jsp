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
    background-image: url("image/73_big.jpg");
    background-repeat: no-repeat;
    background-size: cover;
    width: 100%;
    height: 567px;
}

  .jumbotron {
    padding-top: 30px;
    padding-bottom: 30px;
    margin-bottom: 0px;
    color: inherit;
    background-color: #eee;
}
    
    /* Add a gray background color and some padding to the footer */
    footer {
      background-color: #222;
      padding: 25px;
    }
    footer p {
    color: blanchedalmond;
}
table, th {
    text-align: center;
}
table, th, td {
    border: 2px solid grey;
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
         <li><a href="Studentlogin.html"><span ></span>Student</a></li>
      </ul>
    </div>
  </div>
</nav>

<div class="jumbotron">
  <div class="container text-center">
     <% 
      int id =(int)session.getAttribute("id");
     try{
		   
		   
		   Class.forName("com.mysql.jdbc.Driver");  
		   java.sql.Connection con=DriverManager.getConnection(  
		   "jdbc:mysql://localhost:3306/Student","root","root"); 
		    PreparedStatement pst = con.prepareStatement("select * from Student_data where Id=?");
	        pst.setInt(1,id);
	        
	        ResultSet rs =pst.executeQuery();
	     
	      if(rs.next()){   
	    	 
			  String name1 = rs.getString("Name");
			  String email = rs.getString("Email");
			  String rollno1 = rs.getString("Rollno");
			  String sem = rs.getString("Sem");
			  String marks = rs.getString("Marks");
	           %><center>
	             <table style="width:100%;">
	             <tr>
	                <th>Name</th>
	                <th>Sem</th>
	                <th>Marks</th>
	                </tr>
	                <tr>
	                <td><%= name1 %></td>
	                <td><%= sem %></td>
	                <td><%= marks %></td>
	                </tr>
	             </table>
	             <!-- <a href= Student_task>Go back</a> -->
	           </center>
	           <% 
	      }else{
	    	  out.print("sorry"); 
	    		  
	    		 
	      }
	   }catch (Exception e) {
          e.printStackTrace();
	}
     
     %>
  
  </div>
</div>
<footer class="container-fluid text-center">
  <p>&copy; Indore Institute of Science & Technology;</p>
</footer>

</body>
</html>
