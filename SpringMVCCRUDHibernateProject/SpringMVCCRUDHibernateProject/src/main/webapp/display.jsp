<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Employee</title>
    <style>
       
    </style>
</head>
<body bgcolor="lightgrey">
    <h2 align="center">Spring MVC CRUD Operations With ORM</h2>
    <div class="navbar">
<a href="home">Home</a>&nbsp;&nbsp;
<a href="addemp">Add Employee</a>&nbsp;&nbsp;
<a href="viewallemps">View all Employee</a>&nbsp;&nbsp;
<a href="updateemp">Update Employee</a>&nbsp;&nbsp;
<a href="deleteemp">Delete Employee</a>&nbsp;&nbsp;
    </div>
    
                <c:out value="${emp.id}"/><br>
                <c:out value="${emp.name}"/><br>
                <c:out value="${emp.gender}"/><br>
                <c:out value="${emp.dateofbirth}"/><br>
                <c:out value="${emp.department}"/><br>
                <c:out value="${emp.salary}"/><br>
                <c:out value="${emp.location}"/><br>
                <c:out value="${emp.email}"/><br>
                <c:out value="${emp.contact}"/><br>
</body>
</html>
