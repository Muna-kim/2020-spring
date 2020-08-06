<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="" >
		<div class="form-group">
		  <label for="id">ID:</label>
		  <input type="text" class="form-control" id="id" name="id" >
		</div>
		<div class="form-group">
		  <label for="pw">PASSWORD:</label>
		  <input type="password" class="form-control" id="pw" name="pw">
		</div>
		<div class="form-group">
		  <label for="pw2">PASSWORD CHECK:</label>
		  <input type="password" class="form-control" id="pw2" name="pw2" >
		</div>
		<div class="form-group">
		  <label for="sel1">GENDER:</label>
		  <select class="form-control" id="gender" name="gender">
		    <option>MALE</option>
		    <option>FEMALE</option>
		    
		  </select>
		</div>
		
		
		
		<div class="form-group">
		  <label for="email">EMAIL:</label>
		  <input type="text" class="form-control" id="email" name="email" >
		</div>
		
		
		
		<button type="submit" class="btn btn-warning">SIGN UP</button>
	 </form>
</body>
</html>