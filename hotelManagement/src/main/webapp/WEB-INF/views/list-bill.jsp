<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bill List</title>
</head>
<body>
    <div id="Table root"></div>
    <table>
        <thead>
            <tr> 
                <th>invoice</th>
                <th>guest_id</th>
                <th>room_charge</th>
                <th>invoice_date</th>
                <th>res_num</th>
                <th>payment_mode</th>
                <th>invoice_status</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="bill" items="${allbill}">
                <!-- var-variables,items-collection -->
                <tr>
                    <td>${bill.invoice}</td>
                    <td>${bill.guest_id}</td>
                    <td>${bill.room_charge}</td>
                    <td>${bill.invoice_date}</td>
                    <td>${bill.res_num}</td>
                    <td>${bill.payment_mode}</td>
                    <td>${bill.invoice_status}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>