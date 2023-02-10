<!doctype html>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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

<%-- <link href='<c:url value="/resources/css/style.css" />'/> --%>
<%-- <script type="text/javascript" src="<c:url value="/resources/JS/script.js" />"></script> --%>

<title>Home</title>
</head>
<body>
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
    
<%--     <img alt="image" src='<c:url value="/resources/images/images1.jpeg"/>'> --%>
    
		<div class="container">
		<h2 class="text-center m-4">Just a home page...</h2>
			<div class="card mx-auto mt-5 bg-dark" style="width: 600px;">
				<div class="card-body py-4">
					<h2 class="text-center text-uppercase" style="color: white">Google ka sata copy</h2>
					<form action="search" class="mt-4">
						<div class="form-group">
							<input class="form-control" type="text" name="query"
								placeholder="What would you like to search..">
						</div>
						<div class="container text-center mt-3">
							<button class="btn btn-outline-danger">Search</button>
						</div>
					</form>
				</div>
			</div>
		</div>
</body>
</html>