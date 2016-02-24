<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html locale="true">
<head>
<title><bean:message key="order.title"/></title>
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

<h3><bean:message key="order.heading"/></h3>
<p><bean:message key="order.message"/></p>

<html:form 
   action="/orderSubmit" 
   focus="name"
>
         
<table>
  <tr>
    <td><bean:message key="order.name"/></td>
    <td><html:text property="name" size="16" maxlength="18"/><html:errors property="name"/></td>
  </tr>
  
  <tr>
    <td><bean:message key="order.customerid"/></td>
    <td><html:text property="customerid" size="16" maxlength="18"/><html:errors property="customerid"/></td>
  </tr>
  <tr>
    <td><bean:message key="order.tax"/></td>
    <td><html:text property="tax.on.order" size="16" maxlength="18"/><html:errors property="tax.on.order"/></td>
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
