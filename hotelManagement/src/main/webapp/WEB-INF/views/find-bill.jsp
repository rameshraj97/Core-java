<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>find Bill</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="" method="post" modelAttribute="findbillbyid">
				<div>
					<label for="invoice">Invoice</label>
					<div>
						<form:input path="invoice" readonly="true"/>
					</div>
				</div>
				
				<div>
					<label for="guest_id">Guest_id</label>
					<div>
						<form:input path="guest_id" readonly="true" />
					</div>
				</div>
				<div>
					<label for="room_charge">Room_charge</label>
					<div>
						<form:input path="room_charge" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="invoice_date">Invoice_date</label>
					<div>
						<form:input path="invoice_date" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="res_num">Res_num</label>
					<div>
						<form:input path="res_num" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="payment_mode">Payment_mode</label>
					<div>
						<form:input path="payment_mode" readonly="true"/>
					</div>
				</div>
				<div>
					<label for="invoice_status">Invoice_status</label>
					<div>
					<form:input path="invoice_status" readonly="true"/>
					</div>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>