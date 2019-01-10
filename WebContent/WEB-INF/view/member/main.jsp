<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file = "/WEB-INF/view/home/head.jsp" %>
<body>
<table id="wrapper">
	<tr>
		<td colspan="2">
			<%@ include file="/WEB-INF/view/home/header.jsp" %>
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<%@ include file="../home/navi-bar.jsp" %>
		</td>
	</tr>
	<tr  style="height: 300px">
		<td>
			<%@ include file = "side-menu.jsp" %>
		</td>
		<td>
			<%
			String dest = request.getAttribute("dest").toString();
			System.out.println("dest :" + dest);
			switch(dest){
			case "NONE": 
				%>
				<%@ include file="mypage.jsp" %>
				<%
				break;
			case "join-form":
				%>
				<%@ include file="join-form.jsp" %>
				<%
				break;
			case "lo": 
				
				break;
			}
				%>
		</td>
	</tr>
</table>
</body>
</html>