<%@page import="java.util.List"%>
<%@page import="com.sms.entity.Student"%>
<%@ include file="Header/header.jsp"%>
<main class="container">
	<h1 class="text-center mt-3">All Students page</h1>
	<%
	List<Student> allStudent = (List) request.getAttribute("allStudent");
	%>
	<%-- <% for (Student student : allStudent) {%>
						<%= student %>
							<% }%>

								<% for (Student student : allStudent) { out.println(student.getS_address()); } %> --%>
	<div>
		<table class="table mt-4 table-hover ">
			<thead>
				<th>Name</th>
				<th>Gender</th>
				<th>Address</th>
				<th>Course</th>
				<th>DOB</th>
				<th>Update</th>
				<th>Delete</th>
			</thead>
			<c:forEach var="student" items="${allStudent}">
				<tbody>
					<td>${student.getS_name() }</td>
					<td>${student.getS_gender() }</td>
					<td>${student.getS_address() }</td>
					<td>${student.getS_course() }</td>
					<td>${student.getLocaldate() }</td>
					<td><a
						href="UpdateStudent?roll=${String.valueOf(student.getRoll())}"
						class=" btn btn-warning ">Update</a></td>
					<td><a
						href="DeleteById?roll=${String.valueOf(student.getRoll())}"
						class="btn btn-danger ">Delete</a></td>
					<!-- onclick="deleteItem('${String.valueOf(student.getRoll())}')" -->
				</tbody>
			</c:forEach>

		</table>
		<a href="addStudent.jsp" class="btn btn-success"> Add Student</a>
	</div>
</main>
</body>

</html>