<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
		 isELIgnored="false"
%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h>传递数据</h>1111
	你好：${mystr}
	<div>
		<c:forEach items="${map}" var="m">
		
		${m.key } -----> ${m.value } <br/>
		
		</c:forEach>
	</div>
	
</body>
</html>