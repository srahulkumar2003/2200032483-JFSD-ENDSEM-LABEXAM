<html>
<head>
    <title>View Employee</title>
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
    <h3 style="text-align: center;"><u>View Employee</u></h3>
    <div class="form-container">
        <form method="post" action="display">
            <table>
                <tr>
                    <td><label for="eid">Enter ID</label></td>
                    <td><input type="number" id="eid" name="eid" required/></td>
                </tr>
                        <tr>
                    <td colspan="2" class="button-container">
                        <input type="submit" value="View"/>
                        <input type="reset" value="Clear"/>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>