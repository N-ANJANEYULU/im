<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html locale="true">
<head>
<title><bean:message key="purchasedetails.title"/></title>
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

<h3><bean:message key="purchasedetails.heading"/></h3>
<p><bean:message key="purchasedetails.message"/></p>

<html:form 
   action="/purchasedetailsSubmit" 
   focus="name"
>
         
<table>
  <tr>
    <td><bean:message key="purchasedetails.name"/></td>
    <td><html:text property="name" size="16" maxlength="18"/><html:errors property="name"/></td>
  </tr>
  
  <tr>
    <td><bean:message key="purchasedetails.id"/></td>
    <td><html:text property="purchasedetails.id" size="16" maxlength="18"/><html:errors property="purchasedetails.id"/></td>
  </tr>
  <tr>
    <td><bean:message key="purchase.productcost"/></td>
    <td><html:text property="productcost" size="16" maxlength="18"/><html:errors property="productcost"/></td>
  </tr>
  
  <tr>
    <td><bean:message key="purchase.productid"/></td>
    <td><html:text property="productid" size="16" maxlength="18"/><html:errors property="productid"/></td>
  </tr>
  
  <tr>
    <td>&nbsp;</td>
    <td><html:submit property="Submit" value="Submit"/>&nbsp;<html:reset/></td>
  </tr>
</table>  
         
</html:form>


         
</body>
</html:html>
