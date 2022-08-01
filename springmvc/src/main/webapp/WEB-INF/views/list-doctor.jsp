<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor List</title>
</head>
<body>
    <div id="Table root"></div>
    <table>
        <thead>
            <tr> 
                <th>Doctor Id</th>
                <th>doctor_name</th>
                <th>dob</th>
                <th>speciality</th>
                <th>city</th>
                <th>phone_no</th>
                <th>standard_fees</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="doctor" items="${alldoctor}">
                <!-- var-variables,items-collection -->
                <tr>
                    <td>${doctor.doctor_id}</td>
                    <td>${doctor.doctor_name}</td>
                    <td>${doctor.dob}</td>
                    <td>${doctor.speciality}</td>
                    <td>${doctor.city}</td>
                    <td>${doctor.phone_no}</td>
                    <td>${doctor.standard_fees}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>