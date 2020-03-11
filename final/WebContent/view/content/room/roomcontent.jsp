<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<img src="<%= request.getContextPath()%>/uploadFile/${li.photo}">
<h3>${li.meet_title }</h3>
<p>
	${li.content }
</p>

<div>
	<c:forEach var="bookli" items="${booklist }" >
		${bookli.meet_subtitle}
		${bookli.meet_date }
		${bookli.meet_time }
		${bookli.meet_location }
		${bookli.fee }
	
	</c:forEach>
</div>
<button>가입하기</button>
</body>
</html>