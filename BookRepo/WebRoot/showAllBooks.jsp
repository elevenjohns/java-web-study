<%@ page language="java" import="java.util.*,com.domain.*"
	pageEncoding="gb2312"%>
<html>
	<head>
		<title>Book List</title>
	</head>
	<body>

		<table border=1>
			<tr>
				<td>
					Title
				</td>
				<td>
					Price				</td>
				<td>
					Author
				</td>
				<td>
					Press				</td>
				<td>
					Number
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
					<a href="saveBook.jsp">Add New Book</a>
				</td>
			</tr>
		</table>

	</body>
</html>
