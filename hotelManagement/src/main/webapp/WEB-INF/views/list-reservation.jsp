<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation List</title>
</head>
<body>
    <div id="Table root"></div>
    <table>
        <thead>
            <tr> 
                <th>Res_num</th>
                <th>Guest_id</th>
                <th>Hotel_code</th>
                <th>Room_id</th>
                <th>Res_date</th>
                <th>From_date</th>
                <th>To_date</th>
                 <th>No_of_persons</th>
                  <th>Payment_status</th>
               
            </tr>
        </thead>
        <tbody>
            <c:forEach var="reservaton" items="${allreservation}">
                <!-- var-variables,items-collection -->
                <tr>
                    <td>${reservation.res_num}</td>
                    <td>${reservation.guest_id}</td>
                    <td>${reservation.hotel_code}</td>
                    <td>${reservation.room_id}</td>
                    <td>${reservation.res_date}</td>
                    <td>${reservation.from_date}</td>
                    <td>${reservation.to_date}</td>
                    <td>${reservation.no_of_persons}</td>
                    <td>${reservation.payment_status}</td>
                     
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>