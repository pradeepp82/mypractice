<%! int day = 3; %> 
<html> 
   <head><title>IF...ELSE Example</title></head> 
   
   <body>
      <% if (day==1 | day==7){ %>
      <p>today is weekend</p>
      <%} else {%>
      <p>today is not weekend</p>
      <%} %>
      
      
      
   </body> 
</html> 

