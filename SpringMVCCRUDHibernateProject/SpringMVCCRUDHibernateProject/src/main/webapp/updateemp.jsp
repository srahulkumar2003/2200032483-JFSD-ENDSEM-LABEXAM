<html>
<head>
    <title>Spring MVC</title>
    <style>
    </style>
</head>
<body>
    <h2 align="center">Spring MVC CRUD Operations with ORM/Hibernate</h2>
    <div class="navbar">
         <a href="home">Home</a>&nbsp;&nbsp;
        <a href="addemp">Add Employee</a>&nbsp;&nbsp;
        <a href="viewallemps">View All Employees</a>&nbsp;&nbsp;
        <a href="updateemp">Update Employee</a>&nbsp;&nbsp;
        <a href="deleteemp">Delete Employee</a>&nbsp;&nbsp;
    </div>
    <h3 style="text-align: center;"><u>Update Employee</u></h3>
    <div class="form-container">
        <form method="post" action="update">
            <table>
                <tr>
                    <td><label for="eid">Enter ID</label></td>
                    <td><input type="number" id="eid" name="eid" required/></td>
                </tr>
                <tr>
                    <td><label for="ename">Enter Name</label></td>
                    <td><input type="text" id="ename" name="ename" required/></td>
                </tr>
                <tr>
                    <td><label for="esalary">Enter Salary</label></td>
                    <td><input type="number" id="esalary" name="esalary" step="0.1" required/></td>
                </tr>
                <tr>
                    <td><label for="eemail">Enter Email ID</label></td>
                    <td><input type="email" id="eemail" name="eemail" required/></td>
                </tr>
                <tr>
                    <td><label for="econtact">Enter Contact</label></td>
                    <td><input type="number" id="econtact" name="econtact" required/></td>
                </tr>
                <tr>
                    <td colspan="2" class="button-container">
                        <input type="submit" value="Update Employee"/>
                        <input type="reset" value="Clear"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>