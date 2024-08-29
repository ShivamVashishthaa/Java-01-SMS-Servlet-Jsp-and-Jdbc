<%@page import="com.sms.helper.ConnectionProvider"%>
<%@page import="java.sql.Connection"%>
<%@ include file="Header/header.jsp"%>
<main style="height: 79vh;"
	class="container d-flex justify-content-center align-items-center">
	<h1>Welcome to student Management System</h1>
	<%-- <%
	Connection conn = ConnectionProvider.getConnection();
	%>
	<h1><%= conn %></h1> --%>
</main>

</body>
</html>