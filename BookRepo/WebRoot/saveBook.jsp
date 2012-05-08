<%@ page language="java" pageEncoding="gb2312"%>
<html>
	<head>
		<title>Enter Book Infomartion</title>
	</head>
	<body>
		<form action="bookshop.html?arg=2" method="post">
			<table>
				<tr>
					<td>
						Title
					</td>
					<td>
						<input type="text" name="name" />
					</td>
				</tr>
				<tr>
					<td>
						Price
					</td>
					<td>
						<input type="text" name="price" />
					</td>
				</tr>
				<tr>
					<td>
						Author
					</td>
					<td>
						<input type="text" name="author" />
					</td>
				</tr>
				<tr>
					<td>
						Press
					</td>
					<td>
						<input type="text" name="concern" />
					</td>
				</tr>
				<tr>
					<td>
						Number
					</td>
					<td>
						<input type="text" name="counts" />
					</td>
				</tr>
				<tr>
					<td>
						<input type="submit" name="submit" value="Submit" />
					</td>
				</tr>
			</table>
		</form>
	</body>
</html>
