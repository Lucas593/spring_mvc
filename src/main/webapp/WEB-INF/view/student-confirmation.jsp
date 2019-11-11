<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>

	Student confirmed: ${ student.firstName } ${ student.lastName }
	<br /> Country: ${ student.country }

	<br /> Favorite Language: ${ student.favoriteLanguage }

	<br /> Operation Systems
	<ul>
		<c:forEach var="opSys" items="${ student.operationSystems }">
			<li>${ opSys }</li>
		</c:forEach>
	</ul>
</body>
</html>