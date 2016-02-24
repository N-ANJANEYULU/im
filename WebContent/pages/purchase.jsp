<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html locale="true">
<head>
<title><bean:message key="purchase.title"/></title>
<html:base/>
</head>
<body bgcolor="white">

<!--<html:errors /> -->

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
  <font color="red">
    ERROR:  Application resources not loaded -- check servlet container
    logs for error messages.
  </font>
</logic:notPresent>

<h3><bean:message key="purchase.heading"/></h3>
<p><bean:message key="purchase.message"/></p>

<html:form 
   action="/purchaseSubmit" 
   focus="name"
>
         
<table>
  <tr>
    <td><bean:message key="purchase.name"/></td>
    <td><html:text property="name" size="16" maxlength="18"/><html:errors property="name"/></td>
  </tr>
  
  <tr>
    <td><bean:message key="purchase.id"/></td>
    <td><html:text property="purchase.id" size="16" maxlength="18"/><html:errors property="purchase.id"/></td>
  </tr>
  <tr>
    <td><bean:message key="purchase.date"/></td>
    <td><html:text property="purchasedate" size="16" maxlength="18"/><html:errors property="purchasedate"/></td>
  </tr>
  
  <tr>
    <td><bean:message key="purchase.totalcost"/></td>
    <td><html:text property="totalcost" size="16" maxlength="18"/><html:errors property="totalcost"/></td>
  </tr>
  <tr>
    <td><bean:message key="common.desc"/></td>
    <td><html:password property="description" size="16" maxlength="18"/><html:errors property="description"/></td>
  </tr>
  <tr>
    <td>&nbsp;</td>
    <td><html:submit property="Submit" value="Submit"/>&nbsp;<html:reset/></td>
  </tr>
</table>  
         
</html:form>


         
</body>
</html:html>
