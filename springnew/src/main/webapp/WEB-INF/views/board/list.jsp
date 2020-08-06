<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	
<div class="container">
  <h2>게시판</h2>
  <p>게시판입니다</p>
  <table class="table">
    <thead>
      <tr>
        <th>NUM</th>
        <th>TITLE</th>
        <th>WRITER</th>
        <th>DATE</th>
      </tr>
    </thead>
    <tbody>
    	 
	    	<c:forEach var="board" items="${list}">
	     		<tr class="table-dark text-dark">
			        <td>${board.num}</td>
			        <td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}">${board.title}</a></td>
			        <td>${board.writer}</td>
			        <td>${board.registerDate}</td>
	      		</tr>
	     	</c:forEach>
 
    </tbody>
  </table>
 <a href="<%=request.getContextPath()%>/board/register"><button type="button" class="btn btn-outline-secondary">REGISTER</button></a>
</div>
	
		
</body>
</html>