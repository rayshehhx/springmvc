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
   <form action="multi" method="post" enctype="multipart/form-data">
    上传文件；<input type="file" name="fileUpload" />
    <input id="asset_tagnum_id" type="hidden" value="A000001" name="asset_tagnum">
    <input id="token_id" type="hidden" value="aefd7aba-26cc-4a2a-9d0f-feb34490f523" name="token">
    <button type="submit">提交</button>
    </form>

</body>
</html>