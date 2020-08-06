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
		  <label for="writer">작성자:</label>
		  <input type="text" class="form-control" id="writer" name="writer" value="${user.id}"  readonly>
		</div>
		<div class="form-group">
		  <label for="boardTitle">게시글이름:</label>
		  <input type="text" class="form-control" id="title" name="title">
		</div>
		<div class="form-group">
		  <label for="content">내용:</label>
		  <textarea class="form-control" rows="5" id="content" name="content"></textarea>
		</div>
		<button type="submit" class="btn btn-warning">등록하기</button>
	</form>
</body>
</html>