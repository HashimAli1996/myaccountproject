<!DOCTYPE HTML>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Expires" content="Sat, 01 Dec 2001 00:00:00 GMT">

<title>Account Manager | Home</title>

<link href="static/css/bootstrap.css" rel="stylesheet">
<link href="static/css/_bootswatch.scss" rel="stylesheet">
<link href="static/css/_variables.css" rel="stylesheet">
<link href="static/css/style.css" rel="stylesheet">



</head>
<body>
	<div class="bs-component">
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<a class="navbar-brand" href="/">Account Manager</a>
			<button class="navbar-toggler collapsed" type="button"
				data-toggle="collapse" data-target="#navbarColor01"
				aria-controls="navbarColor01" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>

			<div class="navbar-collapse collapse" id="navbarColor01">
				<ul class="navbar-nav mr-auto">
					<li class="nav-item active"><a class="nav-link" href="/">Home</a></li>
					<li class="nav-item dropdown"><a
						class="nav-link dropdown-toggle" data-toggle="dropdown" href="#"
						role="button" aria-haspopup="true" aria-expanded="false">Accounts</a>
						<div class="dropdown-menu">
							<a class="dropdown-item" href="new-account">Add Accounts</a> <a
								class="dropdown-item" href="all-accounts">Get Accounts</a>
						</div></li>
				</ul>
			</div>
		</nav>
	</div>
	<div>
		<br>
	</div>
	
	<c:choose>
		<c:when test="${mode == 'MODE_HOME'}">
			<div class="container" id="homeDiv">
		<div class="jumbotron text-center">
			<h1>Welcome to Account Manager</h1>
		</div>
	</div>
		</c:when>
		<c:when test="${mode == 'MODE_ACCOUNTS'}">
			<div class="container text-center" id="accountDiv">
				<h3>Account List</h3>
				<hr>
				<div class="table-responsive">
					<table class="table table-striped table-bordered text-left">
						<thead>
							<tr>
								<th>Table ID</th>
								<th>Forename</th>
								<th>Surname</th>
								<th>Account Number</th>
								<th>Edit</th>
								<th>Delete</th>								
							</tr>
						</thead>
						<tbody>
							<c:forEach var="account" items="${accounts}">
								<tr>
									<td>${account.acc_id}</td>
									<td>${account.forename}</td>
									<td>${account.surname}</td>
									<td>${account.account_number}</td>
									<td><a href="update-account?acc_id=${account.acc_id}" class="btn btn-primary" role="button">Edit</a></td>
									<td><a href="delete-account?acc_id=${account.acc_id}" class="btn btn-primary" role="button">Delete</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>			
		</c:when>
		<c:when test="${mode == 'MODE_NEW' || mode == 'MODE_UPDATE'}">
			<div class="container text-center">
				<h1>Add Account</h1>
				<hr>
				<form class="form-horizontal" method="POST" action="save-account">
					<input type="hidden" name="id" value="${account.acc_id}" />
					<label class="control-label">Forename</label>
					<div class="form-group row">
						<div class="col-lg-4"></div>
						<div class="col-lg-4">
							<input type="text" class="form-control" name="forename"
								value="${account.forename}" />
						</div>
						<div class="col-lg-4"></div>
					</div>
					<label class="control-label">Surname</label>
					<div class="form-group row">
						<div class="col-lg-4"></div>
						<div class="col-lg-4">
							<input type="text" class="form-control" name="surname"
								value="${account.surname}" />
						</div>
						<div class="col-lg-4"></div>
					</div>
					<label class="control-label">Account Number</label>
					<div class="form-group row">
						<div class="col-lg-4"></div>
						<div class="col-lg-4">
							<input type="text" class="form-control" name="account_number"
								value="${account.account_number}" />
						</div>
						<div class="col-lg-4"></div>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-primary" value="Save" />
					</div>
				</form>
			</div>
		</c:when>
	</c:choose>
	
	

	


	<script src="../static/js/jquery.min.js"></script>
	<script src="../static/js/popper.min.js"></script>
	<script src="../static/js/bootstrap.min.js"></script>
	<script src="../static/js/custom.js"></script>
</body>

</html>