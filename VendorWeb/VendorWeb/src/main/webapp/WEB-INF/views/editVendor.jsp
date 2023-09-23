<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Vendor</title>
</head>
<body>
<form action="updateVend" method="post">
<pre>
<h3>Edit Vendor</h3>
Id: <input type="text" name="id" value="${vendor.id}" readonly="true"/>
Code: <input type="text" name="code" value="${vendor.code}"/>
Name: <input type="text" name="name" value="${vendor.name}"/>
Type: <select name="Type">
	  <option value="regular" ${vendor.type=='regular'?'selected':''}>REGULAR</option>
	  <option value="contract" ${vendor.type=='contract'?'selected':''}>CONTRACT</option>	
</select>
Email: <input type="text" name="email" value="${vendor.email}"/>
Address: <textarea rows="3" cols="15" name="address">${vendor.address}</textarea>

<input type="submit" value="save" />
</pre>
</form>
</body>
</html>