<!--Renaming to .html for development of css and js features with JQuery in VS Code-->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<%@include file="jsp/Footer.html"%>
<!-- <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"> -->
<!DOCTYPE html>
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Financial System</title>

<!-- External library scripts must always be placed at top of the DOM in <head>/<body> tag -->
<script type="text/javascript" src="views/cdnscripts/jquery-3.3.1.js"></script>
<link rel="stylesheet" type="text/css"
	href="views/stylesheets/Login.css" />
<link rel="stylesheet" type="text/css"
	href="views/stylesheets/Footer.css" />
<link href="https://fonts.googleapis.com/css?family=Sanchez"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Fira+Sans+Condensed"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Montserrat+Alternates"
	rel="stylesheet">
<script type="text/javascript" src="views/scripts/Login.js"></script>


<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Varela+Round"
	rel="stylesheet">
<link
	href="https://fonts.googleapis.com/css?family=Alex+Brush|Marcellus+SC"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Wendy+One"
	rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Cormorant+SC"
	rel="stylesheet">

<style>
</style>

</head>
<body>
	<!-- Move this section to Header.html, as this section appears across web pages-->
	<section id="loginSection">
		<div id="topSection">
			<div id="tsComp1">
				<span id="companyname">Chandra FinDocs</span> <span id="cmpTag">For
					a Better Documentation</span>
			</div>
			<div></div>
			<div id="loginTemplate"></div>
			<div id="lgn">Sign In</div>
			<div id="newlgn">
				<span id="newLgnText">New User? Register Here</span>
			</div>
			<div id="crdForm">
				<img id="usrIco" src="views/icons/UserCredentials/UserName.png">
				<img id="keyIco" src="views/icons/UserCredentials/Password.png">
				<img id="lgnIco" src="views/icons/UserCredentials/login.png">
				<form:form autocomplete="false" method="POST"
					action="${pageContext.request.contextPath}/req"
					modelAttribute="login">
					<table id="crdtbl">
						<tr>
							<td>
								<!-- <input class="ucExstInp" type="text"
								placeholder="UserName"></input> --> <form:input
									path="userId.userName" cssClass="ucExstInp" maxlength="12" />
							</td>
						</tr>
						<tr>
							<td>
								<!-- <input class="ucExstInp" type="password"
								placeholder="Password"></input> --> <form:password
									path="passWord" cssClass="ucExstInp" maxlength="15" />
							</td>
						</tr>
					</table>
					<input type="submit" name="submit" value="submit" id="sbm" />
				</form:form>
				<span id="fgtPss">Forgot Password?</span>
			</div>
		</div>
	</section>
</body>
<!-- <div id="newUserForm">
		<table id="userForm2">
			<tr>
				<td><label class="ucInput" for="UserName">USER NAME</label></td>
				<td><input class="ucInput" id="UserName" type="text"></input></td>
			</tr>
			<tr>
				<td><label class="ucInput" for="MobileNumber">MOBILE
						NUMBER </label></td>
				<td><input class="ucInput" id="mobileNumber" type="text"></input>
				</td>
			</tr>
			<tr>
				<td><label class="ucInputLable" for="firstName">FIRST
						NAME</label></td>
				<td><input class="ucInput" id="firstName" type="text"></input>
				</td>
				<td><label class="ucInputLable" for="lastName">LAST
						NAME</label></td>
				<td><input class="ucInput" id="lastName" type="text"></input></td>
			</tr>
			<tr>
				<td><label class="ucInput" for="emailId">EMAIL ID</label></td>
				<td><input class="ucInput" id="emailId" type="email"></input></td>
			</tr>
			<tr>
				<td><label class="ucInput" for="age">AGE</label></td>
				<td><input class="ucInput" id="age" type="text"></input></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button"></input></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div> -->
</html>