<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a vendor</title>
</head>
<body>
<form action="saveVend" method="post">
<pre>
<h3>Create a Vendor</h3>
Id: <input type="text" name="id"/>
Code: <input type="text" name="code"/>
Name: <input type="text" name="name"/>
Type: <select name="Type">
	  <option value="regular">REGULAR</option>
	  <option value="contract">CONTRACT</option>	
</select>
Email: <input type="text" name="email"/>
Address: <textarea rows="3" cols="15" name="address"></textarea>

<input type="submit" value="save" />
</pre>
</form>
${msg}

<a href="displayVendors">View All Vendors</a>
</body>
</html>