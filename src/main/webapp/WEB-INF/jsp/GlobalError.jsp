<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My Cutom Error JSP</title>
</head>
<body>
	<p>Spring way to get Global Exception on UI </p>
	

    <p>Failed URL: ${url}</p>
    <p>Exception:  ${exception.message}</p>
    <c:forEach items="${exception.stackTrace}" var="ste">   
    <p> ${ste} </p>
    </c:forEach>



</body>
</html>