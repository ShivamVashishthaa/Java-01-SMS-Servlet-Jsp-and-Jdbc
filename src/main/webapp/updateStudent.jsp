<%@page import="com.sms.entity.Student"%>
<%@ include file="Header/header.jsp"%>
<main class="container d-flex justify-content-center ">
	<%
	Student student = (Student) request.getAttribute("student");
	%>

	<form action="UpdateStudent" method="POST" class="mt-3 ">
		<div class="mb-1">
			<input type="text" class="form-control" id="name" name="roll"
				value="${student.getRoll() }" hidden>
		</div>
		<div class="mb-1">
			<label for="name" class="form-label">Name : </label> <input
				type="text" class="form-control" id="name" name="s_name"
				value="${student.getS_name() }" required="required">
		</div>
		<div class="mb-1 mt-2">
			<label class="form-label">Gender : </label> <input type="radio"
				class="form-check-input " id="gender" name="s_gender" value="male">
			Male <input type="radio" class="form-check-input " id="gender"
				name="s_gender" value="female" required="required"> Female
		</div>
		<div class="mb-1">
			<label for="address" class="form-label">Address : </label> <input
				type="text" class="form-control" id="address" name="s_address"
				value="${student.getS_address() }" required="required">
		</div>
		<div class="mb-1">
			<label for="course" class="form-label">Course : </label> <input
				type="text" class="form-control" id="course" name="s_course"
				value="${student.getS_course() }" required="required">
		</div>
		<div class="mb-1">
			<label for="DOB" class="form-label">DOB : </label> <input type="date"
				class="form-control" id="DOb" name="localdate" required="required">
		</div>
		<button type="submit" class="btn btn-primary mt-2">Submit</button>
	</form>
</main>
</body>
</html>