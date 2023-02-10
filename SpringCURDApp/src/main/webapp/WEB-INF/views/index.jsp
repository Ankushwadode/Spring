<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<%@include file="./base.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
</head>
<body>
	<div class="container mt-3">
		<div class="row">
			<div class="col-md-12">
				<h2 class="text-center mb-3">Spring CURD Product App</h2>
				<table class="table">
					<thead class="table-dark">
						<tr>
							<th scope="col">ID</th>
							<th scope="col">Description</th>
							<th scope="col">Name</th>
							<th scope="col">Price</th>
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>
					<c:forEach items="${products}" var="p">
 						<tr>
							<th scope="row">${p.id }</th>
							<td>${p.name }</td>
							<td>${p.description }</td>
							<td class="fw-bold">&#8377;${p.price }</td>
							<td>
								<a href="delete-product/${p.id }"><i style="font-size: 23px" class="fa-solid fa-trash text-dark"> | </i></a> 
								<a href="update-product/${p.id }"><i style="font-size: 23px"  class="fa-solid fa-pen-to-square text-dark"></i></i></a>
							</td>
						</tr> 						
					</c:forEach>
					</tbody>
				</table>
				<div class="text-center">
					<div class="container">
						<a href="addProduct"><button class="btn btn-outline-success">Add</button></a>
					</div>				
				</div>
			</div>
		</div>
	</div>
</body>
</html>
