<%@ page language="java" import="java.util.*,com.school.domain.*"
	pageEncoding="gbk"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>��ѯ���ҳ��</title>
	</head>
	<center><h3>�ɼ���ѯ���</h3></center>
	<body>
		<table border="1" align="center"  width="400" height="180" cellpadding="0" cellspacing="0">
			<tr align="center">
				<td>����</td>
				<td>����</td>
				<td>Ժϵ</td>
				<td>רҵ</td>
				<td>��Ŀ</td>
				<td>�ɼ�</td>
			</tr>
			<% 
  List list=(List)request.getAttribute("list"); 
  if(list!=null){
  for(int i=0;i<list.size();i++){ 
  Student student=(Student)list.get(i); 
  Iterator it=student.getScores().iterator();
  while(it.hasNext()){
  Score score=(Score)it.next();
  Course course=score.getCourse(); 
			%>
 			<tr align="center">
 				<td><%=student.getSnumber() %></td>
				<td><%=student.getName() %></td>
 				<td><%=student.getDepartment() %></td>
				<td><%=student.getSpecialty() %></td>
 				<td><%=course.getName() %></td> 
 				<td><%=score.getScore() %></td>
 			</tr>
			<% 
				}
			}
		}
			%>
		</table>	
	</body>
	
</html>
