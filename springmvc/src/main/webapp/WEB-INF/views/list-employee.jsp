<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
</head>
<body>
    <div id="Table root"></div>
    <table>
        <thead>
            <tr>
                <th>Employee Id</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Hire Date</th>
                <th>Job Id</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="employee" items="${allemployees}">
                <!-- var-variables,items-collection -->
                <tr>
                    <td>${employee.emp_Id}</td>
                    <td>${employee.first_name}</td>
                    <td>${employee.last_name}</td>
                    <td>${employee.email}</td>
                    <td>${employee.hire_data}</td>
                    <td>${employee.job_id}</td>
                    <td>${employee.salary}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>