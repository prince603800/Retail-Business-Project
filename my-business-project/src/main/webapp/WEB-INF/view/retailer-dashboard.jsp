<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Hello Retailer
Add new Item for the customer

<a href = "">Add new Item for the customer</a>

 <form:form method="post" action="${pageContext.request.contextPath}/retailerController/saveItems" modelAttribute="itemList">
	<table>
	<tr>
		<th>No.</th>
		<th>Item Name</th>
		<th>Item Size</th>
		
	</tr>
	<c:forEach items="${itemList}" var="itemList" varStatus="status">
		<tr>
			<td align="center">${status.count}</td>
			<td><input name="itemList[${status.index}].itemname" value="${itemList.itemname}"/></td>
			<td><input name="itemList[${status.index}].itemsize" value="${itemList.itemsize}"/></td>
		</tr>
	</c:forEach>
</table>	
<br/>
<input type="submit" value="Save" />
	
</form:form>
 
 
 
 
 
 
Add See the order received from the customer

</body>
</html>