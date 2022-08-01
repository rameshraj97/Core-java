<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Reservation</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="findreservationbyid">
				<div>
					<label for="res_num">Res_num</label>
					<div>
						<form:input path="res_num" readonly="true"/>
					</div>
				</div>
				
				<div>
					<label for="guest_id">Guest_id</label>
					<div>
						<form:input path="guest_id" readonly="true" />
					</div>
				</div>
				<div>
					<label for="hotel_code">Hotel_code</label>
					<div>
						<form:input path="hotel_code" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="room_id">room_id</label>
					<div>
						<form:input path="room_id" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="res_date">Res_date</label>
					<div>
						<form:input path="res_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="from_date">From_date</label>
					<div>
						<form:input path="from_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for=to_date>To_date</label>
					<div>
					<form:input path="to_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for=no_of_persons>No_of_persons</label>
					<div>
					<form:input path="no_of_persons" readonly="true"/>
					</div>
				</div>
				<div>
					<label for=payment_status>Payment_status</label>
					<div>
					<form:input path="payment_status" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>