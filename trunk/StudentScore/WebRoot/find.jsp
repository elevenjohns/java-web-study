<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>查询分数</title>
	</head>

	<body>
		<center>
			学生成绩查询系统
		</center>
		<form action="find.action" method="post">
			请输入考号：
			<input type="text" name="snumber">
			<br>
			<input type="submit" name="submit" value="查询">
		</form>
	</body>
</html>
