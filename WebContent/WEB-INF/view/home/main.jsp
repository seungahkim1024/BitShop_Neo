<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "head.jsp" %>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
		<%@ include file="header.jsp" %>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td style="width:30%"> 
			<%@ include file="side-menu.jsp" %>
		</td>
		<td>
			<div id="content">
			<%
			String dest = request.getAttribute("dest").toString();
			switch(dest){
			case "welcome": 
			%>
			<%@ include file="welcome.jsp" %>
			<%
			break;
			}
			%></div>
		</td>
	</tr>
	<tr style="height: 100px">
		<td colspan="2">
			<%@ include file="footer.jsp" %>
		</td>
	</tr>
</table>
</body>
</html>