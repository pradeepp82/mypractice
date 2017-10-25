<html>
   <head><title>Hello World</title></head>
   
   <body>
      Hello World!<br/>
      <%
         out.println("Your IP address is " + request.getRemoteAddr());
      %>
       <p>Today's date: <%= (new java.util.Date()).toLocaleString()%></p>
       <h2>A Test of Comments</h2> 
      <%-- This comment will not be visible in the page source --%> 
   </body>
</html>