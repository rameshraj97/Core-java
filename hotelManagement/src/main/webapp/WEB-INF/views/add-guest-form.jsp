<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Guest</title>
</head>
<body>
	<div id="root">
		<div id="form">
			<form:form action="add" method="post" modelAttribute="addguest">
				<div>
					<label for="guest_id">Guest_id</label>
					<div>
						<form:input path="guest_id" />
					</div>
				</div>
				<div>
					<label for="f_name">F_name</label>
					<div>
						<form:input path="f_name" />
					</div>
				</div>
				<div>
					<label for="l_name">L_name</label>
					<div>
						<form:input path="l_name" />
					</div>
				</div>
				<div>
					<label for="phone_no">Phone_no</label>
					<div>
						<form:input path="phone_no" />
					</div>
				</div>
				<div>
					<label for="address">Address</label>
					<div>
						<form:input path="address" />
					</div>
				</div>
				<div>
					<label for="email">Email</label>
					<div>
						<form:input path="email" />
					</div>
				</div>
				<div>
					<label for="gender">Gender</label>
					<div>
						<form:input path="gender" />
					</div>
				</div>
				<div>
					<label for="dob">Dob</label>
					<div>
						<form:input path="dob" />
					</div>
				</div>
				<div>
					<label for="aadhar_number">Aadhar_number</label>
					<div>
						<form:input path="aadhar_number" />
					</div>
				<div>
					<form:button>Add Guest</form:button>
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>