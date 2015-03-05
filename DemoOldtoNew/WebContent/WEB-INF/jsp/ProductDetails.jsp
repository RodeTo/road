<!DOCTYPE HTML>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Save Product</title>
<style type="text/css">
@import url(css/main.css);
</style>
</head>
<body>
	<div id="global">
		<h1>Welcome ${userName }</h1>

		<h4>The product has been saved.</h4>

		<h5>Details:</h5>
		Product Name: ${product.name}<br /> Description:
		${product.description}<br /> Price: $${product.price}


		<form action="product_input.action" method="get">
			<input id="submit" type="submit" value="Add Product">
		</form>
		
		<p>
		<form action="login" method="get">
			<input id="submit" type="submit" value="Login">
		</form>
		<p/>

		<a href="<c:url value="/" />">HOME</a>


	</div>
</body>
</html>