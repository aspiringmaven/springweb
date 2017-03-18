<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>App User Form</title>
</head>
<body>
	<form:form method="POST" modelAttribute="newAppUser" action="/springweb/AppUser" >
		
		<form:hidden path="id"/>
		<spring:message code="ui.message.home.title"></spring:message><br>
		<form:errors path="*" />
		<form:label path="name">Name : </form:label>
		<form:input path="name"/><br>
		<form:label path="name">Hobby : </form:label><br>
		<form:input path="hobby"/><br>

		
		<form:label path="bio">Bio : </form:label>
		<form:textarea path="bio"/>
		
		
		<form:radiobutton path="gender" value="Male"/>Male
		<form:radiobutton path="gender" value="Female"/>Female
		<br>
		<form:checkbox path="bca" value="true"/>BCA
		<form:checkbox path="mca" value="true"/>MCA
		<form:checkbox path="phd" value="true"/>BTECH
		<br>
		<form:select path="selDomain">
			<form:options items="${domains}"/>
		</form:select>
		<br>
		<form:label path="email">email : </form:label>
		<form:input path="email"/><br>
		
		<input type="submit" value="Save Article"/>
	</form:form>
	
</body>
</html>