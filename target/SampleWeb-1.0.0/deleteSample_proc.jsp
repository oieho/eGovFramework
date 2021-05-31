<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="egovframework.sample.service.impl.SampleDAOJDBC" %>
<%@page import="egovframework.sample.service.SampleVO" %>

<%
	// 1. 사용자 입력 정보 추출
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	
	// 2. DB 연동 처리
	SampleVO vo = new SampleVO();
	vo.setId(id);
	
	SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
	sampleDAO.deleteSample(vo);
	
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