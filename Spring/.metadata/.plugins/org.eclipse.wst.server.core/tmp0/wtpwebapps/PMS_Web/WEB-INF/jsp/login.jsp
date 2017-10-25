
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">

<style>
.lg-btn {
	width: 20%;
}

h4 {
	color: red;
}
</style>
</head>
<body>
	<h2>
		<spring:message code="label.login.header" />
	</h2>

	<form:form method="POST" action="login.do" modelAttribute="user"
		autocomplete="off">
		<table width="100%" border="0">
			<tr>
				<td><div class="form-control">

						<label>

							<p>
								<spring:message code="label.userName" />
								<small class="required"></small>
							</p> <form:input path="email" class="inputControl inptlogin"
								placeholder="Please enter your email" required="autofocus"
								maxlength="50" id="emailId" />
						</label>
					</div></td>
			</tr>
			<tr>
				<td><div class="form-control">
						<%-- <form:errors path="subject"  class="label error-label"></form:errors> --%>
						<label>

							<p>
								<spring:message code="label.password" />
								<small class="required"></small>
							</p> <form:password path="password" class="inputControl inptlogin"
								placeholder="Password" required="autofocus" maxlength="15"
								id="password" />
						</label>
					</div></td>
			</tr>

			<tr>
				<td><input type="submit" name="submit"
					value=<spring:message code="label.login.submit"/>></td>
			</tr>
		</table>
		
		 <a href="?language=en">English</a>| <a href="?language=de">german</a>  <a href="?language=hi_IN">hindi</a>
		
	</form:form>
	<h4>
		<c:out value="${invalid}"></c:out>
	</h4>
	</div>
	</div>


</body>
</html>