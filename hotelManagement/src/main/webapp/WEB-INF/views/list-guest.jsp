<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Guest List</title>
</head>
<body>
    <div id="Table root"></div>
    <table>
        <thead>
            <tr> 
                <th>Guest_id</th>
                <th>F_name</th>
                <th>L_name</th>
                <th>Phone_no</th>
                <th>Address</th>
                <th>Email</th>
                <th>Gender</th>
                <th>Dob</th>
                <th>Aadhar_number</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="guest" items="${allguest}">
                <!-- var-variables,items-collection -->
                <tr>
                    <td>${guest.guest_id}</td>
                    <td>${guest.f_name}</td>
                    <td>${guest.l_name}</td>
                    <td>${guest.phone_no}</td>
                    <td>${guest.address}</td>
                    <td>${guest.email}</td>
                    <td>${guest.gender}</td>
                    <td>${guest.dob}</td>
                    <td>${guest.aadhar_number}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>