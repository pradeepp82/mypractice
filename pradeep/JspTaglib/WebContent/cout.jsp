<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<jsp:useBean id="students"  scope="application" class="Testbean.TestBean"> </jsp:useBean>
<html>
   <head>
      <title> Tag Example</title>
   </head>

   <body>
      <c:set var = "salary" scope = "session" value = "${2000*2}"/>
      <c:out value = "${salary}"/>
      <p>Student First Name: 
<jsp:getProperty name="students" property="firstName"/>
</p>
<p>Student Last Name: 
<jsp:getProperty name="students" property="lastName"/>
</p>
   </body>
</html>