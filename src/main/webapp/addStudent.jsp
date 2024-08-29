<%@ include file="Header/header.jsp" %>
<main class="container d-flex justify-content-center ">
	<form action="AddStudent" method="post" class="mt-3 ">
		<div class="mb-1">
            <label for="Roll" class="form-label">Roll : </label>
            <input type="number" class="form-control" id="Roll" name="roll">
        </div>
		<div class="mb-1">
            <label for="name" class="form-label">Name : </label>
            <input type="text" class="form-control" id="name" name="s_name">
        </div>
        <div class="mb-1 mt-2">
            <label class="form-label">Gender : </label>
            <input type="radio" class="form-check-input " id="gender" name="s_gender" value="male">
            Male
            <input type="radio" class="form-check-input " id="gender" name="s_gender" value="female">
            Female
        </div>
        <div class="mb-1">
            <label for="address" class="form-label">Address : </label>
            <input type="text" class="form-control" id="address" name="s_address">
        </div>
        <div class="mb-1">
            <label for="course" class="form-label">Course : </label>
            <input type="text" class="form-control" id="course" name="s_course">
		</div>
        <div class="mb-1">
            <label for="DOB" class="form-label">DOB : </label>
            <input type="date" class="form-control" id="DOb" name="localdate">
		</div>
		<button type="submit" class="btn btn-primary mt-2">Submit</button>
	</form>
</main>
</body>
</html>