<jsp:useBean id="students" scope="application" class="Testbean.TestBean"> 
<jsp:setProperty name="students" property="firstName" value="Zara"/>
<jsp:setProperty name="students" property="lastName" value="Ali"/>
<%-- <jsp:setProperty name="students" property="age" value="10"/> --%>
</jsp:useBean>

<p>Student First Name: 
<jsp:getProperty name="students" property="firstName"/>
</p>
<p>Student Last Name: 
<jsp:getProperty name="students" property="lastName"/>
</p>
<%-- <p>Student Age: 
<jsp:getProperty name="students" property="age"/>

</p> --%>
<jsp:forward page="cout.jsp" />
</body>
</html>