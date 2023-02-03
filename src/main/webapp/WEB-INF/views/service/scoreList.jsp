<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jstl선언-모델값 가져오기 -->    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>목록화면</h3>
	<!-- 향상된for문 -->
	<c:forEach var="article" items="${list }" varStatus="num">
		${article.num }<!-- 인덱스번호 -->
		${article.name }
		${article.kor }
		${article.eng }
		<a href="delete?num=${article.num } ">삭제</a> <!-- 삭제는 post방식 -->
		<br/>
	</c:forEach>




</body>
</html>