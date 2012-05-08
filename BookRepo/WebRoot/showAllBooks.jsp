<%@ page language="java" import="java.util.*,com.domain.*"
	pageEncoding="gb2312"%>
<html>
	<head>
		<title>显示所有图书信息</title>
	</head>
	<body>

		<table border=1>
			<tr>
				<td>
					图书名称
				</td>
				<td>
					图书价格
				</td>
				<td>
					图书作者
				</td>
				<td>
					出版社
				</td>
				<td>
					存放数量
				</td>
			</tr>
			<%
				List list = (List) request.getAttribute("booklist");
				Book book = null; // new Book
				for (int i = 0; i < list.size(); i++) {
					book = (Book) list.get(i);
			%>
			<tr>
				<td>
					<%=book.getName()%></td>
				<td>
					<%=book.getPrice()%></td>
				<td>
					<%=book.getAuthor()%></td>
				<td>
					<%=book.getBookConcern()%></td>
				<td>
					<%=book.getCounts()%></td>
			</tr>
			<%
				}
			%>
			<tr>
				<td>
					<a href="saveBook.jsp">添加图书信息</a>
				</td>
			</tr>
		</table>

	</body>
</html>
