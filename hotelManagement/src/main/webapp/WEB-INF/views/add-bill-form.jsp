<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Bill</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addbill">
				<div>
					<label for="invoice">invoice</label>
					<div>
						<form:input path="invoice" />
					</div>
				</div>
				<div>
					<label for="guest_id">guest_id</label>
					<div>
						<form:input path="guest_id" />
					</div>
				</div>
				<div>
					<label for="room_charge">room_charge</label>
					<div>
						<form:input path="room_charge" />
					</div>
				</div>
				<div>
					<label for="invoice_date">invoice_date</label>
					<div>
						<form:input path="invoice_date" />
					</div>
				  </div>
				<label for="res_num">res_num</label>
					<div>
						<form:input path="res_num" />
					</div>
				    <div>
					<label for=payment_mode>payment_mode</label>
					<div>
						<form:input path="payment_mode" />
					</div>
				</div>
				<div>
					<label for=invoice_status>invoice_status</label>
					<div>
						<form:input path="invoice_status" />
					</div>
				</div>
				<div>
					<form:button>Add New</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>