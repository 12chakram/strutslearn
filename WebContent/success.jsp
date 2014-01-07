<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<jsp:useBean id="loginForm" class="com.struts1.sample.form.LoginForm" scope="session"/>
	<center>
		<div>
			Logged in Successfully<br/>
			<h4>${loginForm.userName}</h4><br/>
			<html:link action="/forwardAction.do" style="float:right;">
				Click here to forward to forward.jsp page
			</html:link><br/>
			<html:link action="/lookupDispatchPage.do" style="float:right;">
				Click here to watch LookupDispathAction example
			</html:link>
			<table>
				<tr>
					<th>Employee Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Cell</th>
				</tr>
				<logic:iterate id="empList" name="loginForm" property="empList" type="com.hibernate.pojo.Employee">
				<tr>
					<td>${empList.employeeId}</td>
					<td>${empList.firstname}</td>
					<td>${empList.lastname}</td>
					<td>${empList.cellphone}</td>
				</tr>
				</logic:iterate>
			</table>
		</div>
	</center>