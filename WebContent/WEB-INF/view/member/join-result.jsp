<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String pass = request.getParameter("pass");
//--------------------------------------------
String ssn = request.getParameter("ssn");
String[] arr = ssn.split("");
String year = arr[0]+arr[1];
String yearres = "";
	if(!arr[0].equals(0)){
		yearres = "19"+year;
	}else{
		yearres = "20"+year;
	}
String month = arr[2]+arr[3];
String day = arr[4]+arr[5];

//---------------------------------------------
char gender = ssn.charAt(7);
String genderres = "";
switch(gender){
	case '1': case '3': genderres = "남자"; break; 
	case '2': case '4': genderres = "여자"; break;
	case '5': case '6': genderres = "외국인"; break;
	case '0': case '7': case '8': case '9': genderres = "오류"; break;
}
//---------------------------------------------
String hei = request.getParameter("height");
double hei1 = Double.parseDouble(hei) * 0.01;
String wei = request.getParameter("weight");
double wei1 = Double.parseDouble(wei);
double bmi = wei1 / (hei1*hei1);
String bmires = "";
	if(bmi>40){
		bmires = "고도비만";
	}else if(bmi>=35){
		bmires = "중등도비만";
	}else if(bmi>=30){
		bmires = "경도비만";
	}else if(bmi>=25){
		bmires = "과체중";
	} else if(bmi>=18.5){
		bmires = "정상";
	}else{
		bmires = "저체중";
	}
//---------------------------------------------
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>가입한 ID : <%= id %></h3> <br />
	<h3>가입한 이름: <%= name %></h3> <br />
	<h3>가입한 비번 : ******* </h3> <br />
	<h3>생년월일 :  : <%=yearres %> 년 <%=month %> 월 <%=day %> 일생</h3> <br />
	<h3>성 별 : <%= genderres %></h3> <br />
	<h3>BMI : <%= bmires %></h3> <br />
	<a href="login-form.jsp">로그인으로 이동</a> <br />
	<a href="../index.jsp">홈으로 이동</a>
</body>
</html>