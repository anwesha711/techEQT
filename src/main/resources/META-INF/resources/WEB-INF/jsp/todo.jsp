<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">
		<title>Add ToDo Page</title>
	</head>
	<body>
		<div class="container">
			<h2>Enter Todo Details</h2>
			<form method="post">
				Description: <input type="text" name="description" required="required"/>
				<input type="submit" claa="btn btn-success"/>
			</form>
		</div>
		<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
		<script src="webjars/jquery/3.6.4/jquery.min.js"></script>
	</body>
</html>