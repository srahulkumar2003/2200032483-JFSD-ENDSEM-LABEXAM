<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View All Employees</title>
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
    <h3 align="center"><u>View All Employees</u></h3>
    <table align="center" border=1>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>GENDER</th>
            <th>DATE OF BIRTH</th>
            <th>DEPARTMENT</th>
            <th>SALARY</th>
            <th>LOCATION</th>
            <th>EMAIL</th>
            <th>CONTACT</th>
        </tr>
        <c:forEach items="${emplist}" var="emp">
            <tr>
                <td><c:out value="${emp.id}"/></td>
                <td><c:out value="${emp.name}"/></td>
                <td><c:out value="${emp.gender}"/></td>
                <td><c:out value="${emp.dateofbirth}"/></td>
                <td><c:out value="${emp.department}"/></td>
                <td><c:out value="${emp.salary}"/></td>
                <td><c:out value="${emp.location}"/></td>
                <td><c:out value="${emp.email}"/></td>
                <td><c:out value="${emp.contact}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
