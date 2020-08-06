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
	  <label for="isDel">isDel:</label>
	  <input type="text" class="form-control" id="isDel" name="isDel" value="${board.isDel}" >
	</div>
	<div>삭제되었습니다.</div>
		<a href="<%=request.getContextPath()%>/board/list"><button type="button" class="btn btn-secondary">LIST</button></a>
</body>
</html>