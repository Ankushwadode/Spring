<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-3">
		<div class="col-md-6 offset-md-3">
			<h3 class="text-center mb-3">Change Product Details.</h3>
			<form action="${pageContext.request.contextPath }/handle-product" method="post">
			<input class="form-control mb-2" type="hidden" name="id" value="${product.id }"></input>
				<div class="form-group">
					<label for="name">Product Name</label> 
					<input type="text" class="form-control" name="name" id="name" value="${product.name }" aria-describedby="textHelp" placeholder="Enter Produdct Name here...">
				</div>
				<div class="form-group mt-2">
					<label for="description">Product Description</label>
					<textarea class="form-control" name="description" id="description" rows="6" placeholder="Enter Product Description..."> ${product.description }
					</textarea>
				</div>
				<div class="form-group mt-2">
					<label for="price">Product Price</label>
					<input type="text" class="form-control" name="price" value="${product.price }" id="price" placeholder="Enter Product Price...">
				</div>
				<div class="container text-center mt-3">
					<a href="${pageContext.request.contextPath }/" class="btn btn-outline-danger">Back</a>
					<button type="submit" class="btn btn-outline-primary">update</button>
				</div>
			</form>
		</div>
	</div>
</body>
</html>