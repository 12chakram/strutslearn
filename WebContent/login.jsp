<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<jsp:useBean id="helloWorldForm" class="com.struts1.sample.form.HelloWorldForm" scope="session"/>
<html:form action="/helloWorld" enctype="multipart/form-data">
	<body>
		<bean:message key="enter.username"/>
			<html:text property="message" name="helloWorldForm"/>
			<font color="red"><html:errors/></font><br>
			<html:submit value="Submit"/>
	</body>
</html:form>
