<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>

<jsp:useBean id="loginForm" class="com.struts1.sample.form.LoginForm" scope="session"/>
	<center>
		<div style="width: 82%;"><bean:message key="enter.username"/><br/>
			Success Page<br/>
			<h4>${loginForm.userName}</h4><br/>
			<html:link action="/forwardAction.do">
				Click here to forward to forward.jsp page
			</html:link>
		</div>
	</center>