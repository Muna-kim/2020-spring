<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="form-group">
	  <label for="name">BOARD NUM:</label>
	  <input type="text" class="form-control" id="name" value="${board.num}" readonly>
	</div>
	<div class="form-group">
	  <label for="registerDate">REGISTER DATE:</label>
	  <input type="text" class="form-control" id="registerDate" value="${board.registerDate}" readonly>
	</div>
	<div class="form-group">
	  <label for="writer">WRITER:</label>
	  <input type="text" class="form-control" id="writer" value="${board.writer}" readonly>
	</div>
	<div class="form-group">
	  <label for="title">TITLE:</label>
	  <input type="text" class="form-control" id="title" value="${board.title}" readonly>
	</div>
	
	
	<div class="form-group">
	  <label for="content">CONTENT:</label>
	  <textarea class="form-control" rows="5" id="content"  readonly>${board.content}</textarea>
	</div>
	<a href="<%=request.getContextPath()%>/board/list"><button type="button" class="btn btn-secondary">LIST</button></a>
	<a href="<%=request.getContextPath()%>/board/register"><button type="button" class="btn btn-outline-secondary">REGISTER</button></a>
	<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}"><button type="button" class="btn btn-secondary">MODIFY</button></a>
	<a href="<%=request.getContextPath()%>/board/delete?num=${board.num}"><button type="button" class="btn btn-outline-secondary">DELETE</button></a>
	
	

</body>
</html>