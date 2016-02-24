<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html:html locale="true">
<head>
<title><bean:message key="logon.title"/></title>
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

<h3><bean:message key="logon.heading"/></h3>
<p><bean:message key="logon.message"/></p>

<html:form 
   action="/LoginSubmit" 
   focus="username"
>
         
<table>
  <tr>
    <td><bean:message key="logon.username"/></td>
    <td><html:text property="username" size="16" maxlength="18"/></td>
  </tr>
  <tr>
    <td><bean:message key="logon.password"/></td>
    <td><html:password property="password" size="16" maxlength="18"
                    redisplay="false"/></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><html:submit property="Submit" value="Submit"/>&nbsp;<html:reset/></td>
  </tr>
</table>  
         
</html:form>


         
</body>
</html:html>
