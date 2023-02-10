<!doctype html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>Complex Forms.</title>
</head>
<body style="background-color:#808080">
	<!-- Optional JavaScript; choose one of the two! -->
	<!-- Option 1: Bootstrap Bundle with Popper -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
		crossorigin="anonymous"></script>

	<!-- Option 2: Separate Popper and Bootstrap JS -->
	<!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->

	<div class="container">
		<div class="card mx-auto mt-5 " style="width: 800px;">
			<div class="card-body py-4">
				<h2 class="text-center text-uppercase" >Complex Forms</h2>
				<div class="alert alert-danger" role="alert">
				  <form:errors path="student.*" />
				</div>
				<form action="handleform" method="post" class="mt-4">
					<div class="form-group">
							<div class="mb-3">
								<label for="exampleInputNmae" class="form-label">Name</label>
								<input name="name" type="text" class="form-control" id="exampleInputName">
							</div>
							<div class="mb-3">
								<label for="exampleInputNmae" class="form-label">ID</label>
								<input name="id" type="text" class="form-control" id="exampleInputName">
							</div>
							<div class="mb-3">
								<label for="exampleInputEmail1" class="form-label">Email address</label> 
								<input name="email" type="email" required class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
								<div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
							</div>
							<div class="mb-3">
								<label for="exampleInputPassword1" class="form-label">Password</label>
								<input name="password" type="password" class="form-control" id="exampleInputPassword1">
							</div>
      						<div class="mb-3"> <!-- Date input -->
        						<label class="form-label" for="date">Date of Birth</label>
        						<input name="date" class="form-control" id="date" name="date" placeholder="MM/DD/YYYY" type="text"/>
      						</div>
							<div class="card">
								<div class="card-body">
									<label class="form-label" for="address">Address</label>
									<table>
										<tr>
											<td>
												<input size="50px" name="address.street" type="text" class="form-control" id="StreetName" placeholder="Street Name">
											</td>
											<td>
												<input size="50px" name="address.city" type="text" class="form-control" id="CityName" placeholder="City Name">											
											</td>
										</tr>
									</table>
								</div>
							</div>     						
							<div class="mb-3"> 
								<label  class="form-label" for="checkboxinpute"> Courses </label> 
								<select class="form-select" multiple name="courses" aria-label="Default select example">
								  <option>Java</option>
								  <option>Python</option>
								  <option>AI</option>
								  <option>DataBase</option>
								  <option>UI/UX</option>
								  <option>Machine Learning</option>
								</select> 
								<div id="courseHelp" class="form-text">*To select multiple press ctrl and choose the option*</div> 
							</div> 
							<div class="mb-3">
								<table>
									<tr>
									<label class="form-label" for="gender">Gender</label>
										<td>
											<input class="form-check-input" type="radio" name="gender" value="male" id="Male">
	  										<label class="form-check-label" for="flexRadioDefault1"> Male</label>										
										</td>
										<td>&nbsp;&nbsp;</td>
										<td>
											<input class="form-check-input" type="radio" name="gender" value="female" id="Female">
	  										<label class="form-check-label" for="flexRadioDefault1"> Female </label>
										</td>
										<td>&nbsp;&nbsp;</td>
										<td>
											<input class="form-check-input" type="radio" name="gender" value="nts" id="NTS">
	  										<label class="form-check-label" for="flexRadioDefault1"> Prefer not to say </label>
										</td>
									</tr>
								</table> 
							</div>
							<div class="mb-3">
								<label for="exampleInputtype" class="form-label">Select type</label>
								<select class="form-select" name="type" aria-label="Default select example">
								  <option selected>Select</option>
								  <option value="NS">New Student</option>
								  <option value="OS">Old Student</option>
								</select> 
							</div>
					</div>
					<div class="container text-center mt-3">
						<button class="btn btn-outline-primary">submit</button>
					</div>
				</form>
			</div>
		</div>
	</div>

</body>
</html>