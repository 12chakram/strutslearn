	<%String context = request.getContextPath();%>
	<%String server =  request.getServerName(); %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>  
	 <link rel="stylesheet" type="text/css" href="<%=context %>/css/homepagemain.css" />
	
	<jsp:useBean id="loginForm" class="com.struts1.sample.form.LoginForm" scope="session"/>
	<c:url var="myLearnlogourl" value="${context}/images/mylearning.png" />
	  <div id="grailsLogo" style="height:8%;"><a href="${server}"><img src="${myLearnlogourl}" alt="myLearn"/></a></div>
      <div class="nav">
			<ul>
			         <li><a class="home" href="http://localhost:6060/strutslearn">Home</a></li>
			         <li style="margin-left:50em;">Welcome:<strong style="text-transform:uppercase;"><c:out value="${loginForm.userName}"></c:out></strong></li>
			          <li>
			 			<html:link action="/logout.do" styleClass="to_register" style="margin-left: 2.5em;">Logout</html:link>
			 		</li>
			     </ul>    
		</div>
	 
	