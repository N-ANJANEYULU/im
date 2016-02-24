<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html locale="true">
<head>
<title><bean:message key="users.title"/></title>
<html:base/>
</head>
<body bgcolor="white">

<html:errors/>

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
  <font color="red">
    ERROR:  Application resources not loaded -- check servlet container
    logs for error messages.
  </font>
</logic:notPresent>

<h3><bean:message key="users.heading"/></h3>
<p><bean:message key="users.message"/></p>

<html:form 
   action="/usersSubmit" 
   focus="name">
         
<table>
  <tr>
    <td><bean:message key="users.name"/></td>
    <td><html:text property="name" size="16" maxlength="18"/><html:errors property="name"/></td>
  </tr>
  
  <tr>
    <td><bean:message key="users.uname"/></td>
    <td><html:text property="uname" size="16" maxlength="18"/><html:errors property="uname"/></td>
  </tr>
  <tr>
    <td><bean:message key="users.password"/></td>
    <td><html:password property="password" size="16" maxlength="18"/><html:errors property="password"/></td>
  </tr>
  
  
  <tr>
    <td><bean:message key="users.type"/></td>
    <td><html:text property="type" size="16" maxlength="18"/><html:errors property="type"/></td>
  </tr>
  
  <tr>
    <td>&nbsp;</td>
    <td><html:submit property="Submit" value="Submit"/>&nbsp;<html:reset/></td>
  </tr>
</table>  
         
</html:form>


         
</body>
</html:html>
