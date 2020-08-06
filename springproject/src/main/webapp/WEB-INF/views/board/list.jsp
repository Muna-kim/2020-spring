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
  <h2>BOARD</h2>
  <p>게시판을 선택하세요</p>            
  <table class="table table-hover">
    <thead>
	      <tr>
	        <th>게시글번호</th>
	        <th>게시글이름</th>
	        <th>작성자</th>
	        <th>작성일</th>
	        <th>조회수</th>
	      </tr>
    </thead>
    <tbody>
   
    <c:forEach var="board" items="${list}">
      <tr>
        <td>${board.num}</td>
        <td><a href="<%=request.getContextPath()%>/board/detail?num=${board.num}">${board.title}</a></td>
        <td>${board.writer}</td>
        <td>${board.registerDate}</td>
        <td>조회수</td>
      </tr>
	</c:forEach>
      
    </tbody>
  </table>
</div>
<a href="<%=request.getContextPath()%>/board/register"><button type="button" class="btn btn-warning">글쓰기</button></a>

</body>
</html>