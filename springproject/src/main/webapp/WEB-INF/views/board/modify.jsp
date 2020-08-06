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
		  <label for="registerDate">작성일</label>
		  <input type="text" class="form-control" id="registerDAte" name="registerDate" value="${board.registerDate}" readonly>
		</div>
		<div class="form-group">
		  <label for="boardNum">게시글번호:</label>
		  <input type="text" class="form-control" id="boardNum" name="num" value="${board.num}" readonly>
		</div>
		<div class="form-group">
		  <label for="writer">작성자:</label>
		  <input type="text" class="form-control" id="boardNum" name="writer" value="${board.writer}" readonly>
		</div>
		<div class="form-group">
		  <label for="boardTitle">게시글이름:</label>
		  <input type="text" class="form-control" id="boardTitle" name="title" value="${board.title}" >
		</div>
		<div class="form-group">
		  <label for="content">내용:</label>
		  <textarea class="form-control" rows="5" id="content" name="content">${board.content}</textarea>
		</div>
		<button type="submit" class="btn btn-success">수정하기</button>
	</form>
</body>
</html>