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
	  <label for="date">작성일</label>
	  <input type="text" class="form-control" id="date" value="${registerDate}" readonly>
	</div>
	<div class="form-group">
	  <label for="boardNum">게시글번호:</label>
	  <input type="text" class="form-control" id="boardNum" value="${board.num}" readonly>
	</div>
	<div class="form-group">
		  <label for="writer">작성자:</label>
		  <input type="text" class="form-control" id="boardNum" name="writer" value="${board.writer}" readonly>
		</div>
	<div class="form-group">
	  <label for="boardTitle">게시글이름:</label>
	  <input type="text" class="form-control" id="boardTitle" value="${board.title}" readonly>
	</div>
	<div class="form-group">
	  <label for="comment">내용:</label>
	  <textarea class="form-control" rows="5" id="comment" readonly>${board.content}</textarea>
	</div>
	<a href="<%=request.getContextPath()%>/board/list"><button type="button" class="btn btn-danger">목록</button></a>
	<a href="<%=request.getContextPath()%>/board/register"><button type="button" class="btn btn-warning">글쓰기</button></a>
	<a href="<%=request.getContextPath()%>/board/modify?num=${board.num}"><button type="button" class="btn btn-success">수정</button></a>
	<a href="<%=request.getContextPath()%>/board/delete?num=${board.num}"><button type="button" class="btn btn-info">삭제</button></a>
</body>
</html>