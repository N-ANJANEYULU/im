<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html locale="true">
<head>
<title><bean:message key="oderdetails.title"/></title>
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

<h3><bean:message key="orderdetails.heading"/></h3>
<p><bean:message key="orderdetails.message"/></p>

<html:form 
   action="/orderdetailsSubmit" 
   focus="name"
>
         
<table>
  <tr>
    <td><bean:message key="orderdetails.name"/></td>
    <td><html:text property="name" size="16" maxlength="18"/><html:errors property="name"/></td>
  </tr>
  
  <tr>
    <td><bean:message key="orderdetails.id"/></td>
    <td><html:text property="id" size="16" maxlength="18"/><html:errors property="orderdetails id"/></td>
  </tr>
  <tr>
    <td><bean:message key="orderdetails.discount"/></td>
    <td><html:text property="discount" size="16" maxlength="18"/><html:errors property="discount"/></td>
  </tr>
  
  <tr>
    <td><bean:message key="orderdetails.returns"/></td>
    <td><html:text property="returns" size="16" maxlength="18"/><html:errors property="returns"/></td>
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
