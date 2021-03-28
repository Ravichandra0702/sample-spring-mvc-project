<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<!DOCTYPE HTML>
<html>
<body>
<i>* fields are mandatory</i>
<style>
	.error{color:red}
</style>
<form:form action="processEmployeeForm" modelAttribute="employee">
	Employee First Name(*)	: <form:input path="employeeFirstName" />
	<form:errors path="employeeFirstName" cssClass="error"></form:errors>
	<br><br>
	Employee Last Name	: <form:input path="employeeLastName" />
	<br><br>
	Employee Pan Card(*) 	: <form:input path="employeePancard"/>
	<form:errors path="employeePancard" cssClass="error"></form:errors>
	<br><br>
	Employee Address  	: <form:input path="employeeAddress"/>
	<br><br>
	Employee District 	: 
		<form:select path="employeeDistrict">
		<form:options items="${employee.districtOPtions}"/>
		</form:select>
	<br><br>
	Employee ID (*)  		: <form:input path="employeeId"/>
	<form:errors path="employeeId" cssClass="error"></form:errors>
	<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>