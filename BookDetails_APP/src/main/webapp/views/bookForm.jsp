<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Apllication</title>
</head>
<body>
<h1 align="center">${bookmsg}</h1>.
<h1 align="center"><font color="gren">${msg1}</font></h1>

<form:form action="bookReg" method="post"  modelAttribute="book" >
		<table align="center">
			
			<tr>
				<td>Book Name</td>
				<td><form:input path="bookName"/></td>				
			</tr>
			<tr>
				<td>Book Price</td>
				<td><form:input path="bookPrice"/></td>				
			</tr>	
			<tr>
				<td>Author Name</td>
				<td><form:input path="author"/></td>				
			</tr>						
			<tr>
				<td><form:button>Submit</form:button>
			</tr>
		</table>
		
		<table>
			<tr>
				<th>Book_Id</th>
				<th>Book_Name</th>
				<th>Book_Price</th>
				<th>Author</th>
				<th>Action</th>
			</tr>
			<c:forEach items="${books}" var="b" >
				<tr>
				
					<td>${b.id}</td>
					<td>${b.bookName}</td>
					<td>${b.bookPrice}</td>
					<td>${b.author }</td>
					<td><a href="#">EDIT</a>&nbsp/&nbsp<a href="#">DELETE</a>
					</td>

				</tr>
			
			</c:forEach>
	
		</table>
		</form:form>
</body>
</html>