<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="/WEB-INF/tiles-tlds/struts-tiles.tld" prefix="tiles" %>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<jsp:useBean id="loginForm" class="com.struts1.sample.form.LoginForm" scope="session"/>
<html>
		<h2 style="color:red;">${loginForm.errorMsg}</h2>
	<bean:message key="errors.title"/><br/>
	<html:errors/><br/>
	<logic:messagesPresent>
		<ul id="errors">
			<html:messages id="error">
				<logic:present name="error">
					<li><bean:write name="error"/></li>
				</logic:present>
			</html:messages>
		</ul>
	</logic:messagesPresent>


</html>