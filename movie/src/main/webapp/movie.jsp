<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Movie</h1>
	<!-- <h2>Actor was Punith Raj Kumar</h2> -->

	<form action="saveMovie.do">
		<input type="text" name="movieName"> 
		<input type="text" name="actorName">
		<a href="movieProfile.jsp" ><input type="submit" value="save Movie" ></a>
		<br> 
		<a href="movieProfile.jsp">save Movie</a>
	</form>
</body>
</html>