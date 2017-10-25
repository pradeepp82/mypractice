<%! int p; %> 
<html> 
   <head><title>FOR LOOP Example</title></head> 
   
   <body>
      <% for (p = 1; p <= 4; p++) {%>
      <font color="red"size="<%= p %>">pradeep</font></br>
      <%} %>
   </body> 
</html> 

<%! int p1; %> 
<html> 
   <head><title>FOR LOOP Example</title></head> 
   
   <body>
      <%for ( p1 = 1; p1 <= 3; p1++){ %>
         <font color = "green" size = "<%= p1 %>">
            JSP Tutorial
      </font><br />
      <%}%>
   </body> 

