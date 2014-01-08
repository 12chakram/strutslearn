<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<HEAD>
        <TITLE><tiles:getAsString name="title" /></TITLE>
        <style type="text/css">
        		img {
				    background:none !important;
				    border-radius: 3px !important;
				    margin-top:-14px !important;
				    width: 7em !important;
				}
        </style>
	</HEAD>
	<body>
	  <tiles:insert name="header" attribute="header" />
	  <tiles:insert name="body" attribute="body" />
	  <tiles:insert name="footer" attribute="footer" />
	</body>
</html>