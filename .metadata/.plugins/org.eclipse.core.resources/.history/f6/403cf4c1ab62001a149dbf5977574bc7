<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name = "viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content = "ie-edge">
<meta name = "format-detection" content = "telephone-no">
<link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:100,300,400,500,700,900&display=swap&subset=korean" rel="stylesheet">
<link rel="stylesheet" href="//cdn.jsdelivr.net/npm/xeicon@2.3.3/xeicon.min.css">
<link rel = "stylesheet" href="${pageContext.request.contextPath}/css/header.css">
<link rel= "stylesheet" href="${pageContext.request.contextPath}/css/style_tablet.css" media="all and (max-width:1420px)">
<link rel= "stylesheet" href="${pageContext.request.contextPath}/css/style_moblie.css" media="all and (max-width:760px)">
<title>속닥속닥 :: 오프라인 모임 플랫폼</title>
</head>
<body>

	<div class = "container">
		<div class = "header">
			<h1><a href = "${pageContext.request.contextPath}/content/main"><img src = "${pageContext.request.contextPath}/images/logo2.png" alt = "속닥속닥"></a></h1>
			<nav>
				<ul>
					<li>
						<div class="search">
							<div class="search-box">
								<form name="searchform" action="${pageContext.request.contextPath}/#">
									<div class="search-area">
										<input class="input-searchbox" id="txtSearchKeyword" type="text" name="keyword" placeholder ="검색">
										<button type="submit" class="btn-search" id="btnSearchKeyword">
											<i class="fa fa-search" style="font-size: 19px;"></i>
										</button>
									</div>
								</form>
							</div>
						</div>
					</li>
					<c:if test='${name == null || name.equals("") }'>
					<li><a href = "${pageContext.request.contextPath}/member/signUpForm"><i class = "xi-user"></i><span>Sign In</span></a></li>
					</c:if>
					<c:if test="${name != null }">
					<li><a href = "${pageContext.request.contextPath}/content/loginForm"><i class="xi-profile"></i><span>${name}님</span></a>
						<ul class = "sub-menu">
							<li><a href = "${pageContext.request.contextPath}/member/logoutPro">로그아웃</a></li>
							<li><a href = "#">마이페이지</a></li>
						</ul>
					</li>
					</c:if>
				</ul>
				<a href = "#" class = "total xi-bars"><span>전체메뉴보기</span></a>
			</nav>
		</div>
	</div>


</body>
</html>