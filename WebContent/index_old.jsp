<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<jsp:useBean id="loginForm" class="com.struts1.sample.form.LoginForm" scope="request"/>
<html>
	<html:form action="/helloWorld" enctype="multipart/form-data">
		<body>
			<html:text property="message" name="helloWorldForm"></html:text><html:errors/>
			<html:submit value="Submit"/>
		</body>
	</html:form>
</html>	
