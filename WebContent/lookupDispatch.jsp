<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
<%@taglib uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<jsp:useBean id="dispatchForm" class="com.struts1.sample.form.DispatchForm" scope="session"/>

<html>
    <head>
       
    </head>
    <body>
        <html:form action="/dispatchActionSample" enctype="multipart/form-data">
            <table>
                <tr>
                    <td>
                        <bean:write name="dispatchForm" property="message" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:submit property="method"><bean:message key="dispatchForm.add"/></html:submit>
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:submit property="method"><bean:message key="dispatchForm.update"/></html:submit>
                    </td>
                </tr>
                <tr>
                    <td>
                        <html:submit property="method"><bean:message key="dispatchForm.delete"/></html:submit>
                    </td>
                </tr>
            </table>
        </html:form>
    </body>
</html>