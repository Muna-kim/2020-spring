
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
		
		<div class="writer">
		  <label for="writer">WRITER:</label>
		  <input type="text" class="form-control" id="writer" name="writer" value="${user.id}" readonly>
		</div>
		<div class="title">
		  <label for="title">TITLE:</label>
		  <input type="text" class="form-control" id="title" name="title"" >
		</div>
		
		<div class="content">
		  <label for="content">CONTENT:</label>
		  <textarea class="form-control" rows="5" id="content" name="content" ></textarea>
		</div>
		<a href="<%=request.getContextPath()%>/board/list"><button type="button" class="btn btn-secondary">LIST</button></a>
		<button type="submit" class="btn btn-outline-secondary">SUBMIT</button>
	</form>
</body>
</html>