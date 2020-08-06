<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <form method="post" action="">
	<div class="form-group">
	  <label for="name">BOARD NUM:</label>
	  <input type="text" class="form-control" id="name" name="num" value="${board.num}" readonly>
	</div>
	<div class="form-group">
	  <label for="registerDate">REGISTER DATE:</label>
	  <input type="text" class="form-control" id="registerDate" nane="registerDate" value="${board.registerDate}" readonly>
	</div>
	<div class="form-group">
	  <label for="writer">WRITER:</label>
	  <input type="text" class="form-control" id="writer" name="writer" value="${board.writer}" readonly>
	</div>
	<div class="form-group">
	  <label for="title">TITLE:</label>
	  <input type="text" class="form-control" id="title" name="title" value="${board.title}" >
	</div>
	
	
	<div class="form-group">
	  <label for="content">CONTENT:</label>
	  <textarea class="form-control" rows="5" id="content" name="content" >${board.content}</textarea>
	</div>
	<button type="submit" class="btn btn-outline-secondary">SUBMIT</button>
	</form>
</body>
</html>