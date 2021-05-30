<%@page import="egovframework.sample.service.impl.SampleDAOJDBC" %>
<%@page import="egovframework.sample.service.SampleVO" %>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	// 1. DB 연동 처리
	SampleVO vo = new SampleVO();
	SampleDAOJDBC sampleDAO = new SampleDAOJDBC();
	List<SampleVO> sampleList = sampleDAO.selectSampleList(vo);

	// 2. 응답 화면 구성
%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SAMPLE 목록</title>
</head>
<body>
<center>
<table border="1" cellpadding="0" cellspacing="0" width="800">
<tr>
	<th bgcolor="orange" width="60">아이디</th>
	<th bgcolor="orange" width="240">제목</th>
	<th bgcolor="orange" width="40">작성자</th>
	<th bgcolor="orange" width="60">등록일</th>
</tr>

<% for(SampleVO sample : sampleList) { %>
<tr>
	<td align="center"><a href="selectSample.jsp?id=<%= sample.getId() %>">
	<%= sample.getId() %>
	</a></td>
	<td align="center"><a href="selectSample.jsp?id=<%= sample.getId() %>"><%= sample.getTitle() %></a></td>
	<td align="center"><%= sample.getRegUser() %></td>
	<td align="center"><%= sample.getRegDate() %></td>
</tr>
<% } %>
</table>
<br>
<a href="insertSample.jsp">샘플 등록</a>
</center>
</body>
</html>