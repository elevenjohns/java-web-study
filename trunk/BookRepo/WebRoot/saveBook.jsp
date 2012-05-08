<%@ page language="java" pageEncoding="gb2312"%>
<html>
	<head>
		<title>保存图书信息</title>
	</head>
	<body>
		<form action="bookshop.html?arg=2" method="post">
			<table>
				<tr>
					<td>
						图书名称：
					</td>
					<td>
						<input type="text" name="name" />
					</td>
				</tr>
				<tr>
					<td>
						图书价格：
					</td>
					<td>
						<input type="text" name="price" />
					</td>
				</tr>
				<tr>
					<td>
						图书作者：
					</td>
					<td>
						<input type="text" name="author" />
					</td>
				</tr>
				<tr>
					<td>
						出版社：
					</td>
					<td>
						<input type="text" name="concern" />
					</td>
				</tr>
				<tr>
					<td>
						存放数量：
					</td>
					<td>
						<input type="text" name="counts" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="submit" value="提交" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
