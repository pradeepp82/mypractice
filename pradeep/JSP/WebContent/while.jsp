<%! int fontSize; %> 
<html> 
   <head><title>WHILE LOOP Example</title></head> 
   
   <body>
      <% while(fontSize<=3){ %>
      <font color="red" size="<%= fontSize %>>">pradeep</font><br>
      <% fontSize++; %>
      <%} %>
   </body> 
</html> 

