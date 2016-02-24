<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html locale="true">
<head>
<title><bean:message key="welcome.title"/></title>
<html:base/>
</head>
<body bgcolor="white">

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
  <font color="red">
    ERROR:  Application resources not loaded -- check servlet container
    logs for error messages.
  </font>
</logic:notPresent>

<h3><bean:message key="welcome.heading"/></h3>
<p><bean:message key="welcome.message"/></p>
<p><html:link action="/Logon"><bean:message key="welcome.logonlink"/></html:link><bean:message key="welcome.logonmessage"/></p>
<p><html:link action="/Help"><bean:message key="welcome.helplink"/></html:link><bean:message key="welcome.helpmessage"/></p>
<p><html:link action="/Login"><bean:message key="welcome.loginlink"/></html:link><bean:message key="welcome.logonmessage"/></p>
<p><html:link action="/category"><bean:message key="category.heading"/></html:link><bean:message key="category.heading"/></p>
<p><html:link action="/product"><bean:message key="product.heading"/></html:link><bean:message key="product.heading"/></p>
<p><html:link action="/orderdetails"><bean:message key="orderdetails.heading"/></html:link><bean:message key="orderdetails.heading"/></p>
<p><html:link action="/order"><bean:message key="order.heading"/></html:link><bean:message key="order.heading"/></p>
<p><html:link action="/purchase"><bean:message key="purchase.heading"/></html:link><bean:message key="purchase.heading"/></p>
<p><html:link action="/purchasedetails"><bean:message key="purchasedetails.heading"/></html:link><bean:message key="purchasedetails.heading"/></p>
<p><html:link action="/users"><bean:message key="users.heading"/></html:link><bean:message key="users.heading"/></p>
</body>
</html:html>
