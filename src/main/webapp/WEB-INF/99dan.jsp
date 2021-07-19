<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단</title>
</head>
<body>
<%
	int dan = Integer.parseInt(request.getParameter("dan"));
	int limit = Integer.parseInt(request.getParameter("limit"));
%>
	<h1><%=dan%>단</h1>
	 <%
        for(int i = 1; i <= limit; i++){ 
     %>
        	<%=dan%> * <%=i%> = <%=dan*i%><br> <%-- 단수 * i를 바로 표현식으로 표현 --%>
    <%
        }
    %>     
</body>
</html>