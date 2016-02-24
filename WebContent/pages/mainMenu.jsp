<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<html:html locale="true">
<head>
<title><bean:message key="mainmenu.title"/></title>
<html:base/>
</head>
<body bgcolor="white">

<p><bean:message key="mainmenu.welcome"/> <bean:write name="fullName" /> ( <bean:write name="logonID" /> )</p>

<logic:notPresent name="org.apache.struts.action.MESSAGE" scope="application">
  <font color="red">
    ERROR:  Application resources not loaded -- check servlet container
    logs for error messages.
  </font>
</logic:notPresent>

<h3><bean:message key="mainmenu.heading"/></h3>
<p><bean:message key="mainmenu.message"/></p>

</body>
</html:html>
