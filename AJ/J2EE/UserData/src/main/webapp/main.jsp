<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("fname")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("lname")%>
         </p></li>
         <li><p><b>Username:</b>
         	<%= request.getParameter("usrname")%>
         </p></li>
         <li><p><b>Password:</b>
         	<%= request.getParameter("passwd")%>
         </p></li>
         <li><p><b>E-mail:</b>
         	<%= request.getParameter("email")%>
         </p></li>
         <li><p><b>Phone Number:</b>
         	<%= request.getParameter("phno")%>
         </p></li>
         <li><p><b>Address:</b>
         	<%= request.getParameter("addr")%>
         </p></li>
         
      </ul>
</body>
</html>