<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="egovframework.sample.service.impl.SampleDAOJDBC" %>
<%@page import="egovframework.sample.service.SampleVO" %>

<%
	// 1. 사용자 입력 정보 추출
	request.setCharacterEncoding("UTF-8");
	String title = request.getParameter("title");
	String regUser = request.getParameter("regUser");
	String content = request.getParameter("content");
	
	// 2. DB 연동 처리
	SampleVO vo = new SampleVO();
	vo.setTitle(title);
	vo.setRegUser(regUser);
	vo.setContent(content);
	
	SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
	sampleDAO.insertSample(vo);
	
	// 3. 화면 네비게이션
	response.sendRedirect("selectSampleList.jsp");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>