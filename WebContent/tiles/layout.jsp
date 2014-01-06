<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<html>
	<HEAD>
        <TITLE><tiles:getAsString name="title" /></TITLE>
	</HEAD>
	<body>
		<TABLE width="100%" height="100%" border="0"> 
    <TR>
        <TD valign="top" height="10px">
            <tiles:insert name="header" attribute="header" />
        </TD>
    </TR>
    <%-- <TR>
        <TD  valign="middle" align="left">
            <tiles:insert name="menu" attribute="menu" />
        </TD>
    </TR> --%>
    <TR>
        <TD  valign="middle" align="center">
            <tiles:insert name="body" attribute="body" />
        </TD>
    </TR>     
    <TR>
        <TD height="10px">
            <tiles:insert name="footer" attribute="footer" />
        </TD>
    </TR>
</TABLE>
	</body>
</html>