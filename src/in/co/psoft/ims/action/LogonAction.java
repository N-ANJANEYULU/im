package in.co.psoft.ims.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import org.apache.struts.action.ActionMessages;

/**
 * <p>Validate a user logon.</p>
 *
 * @version $Rev: 1 $ $Date: 2005-14-27 $
 */

public final class LogonAction extends Action{

    static String PASSWORD = "password";
    
	   public ActionForward execute(
		        ActionMapping mapping,
		        ActionForm form,
		        HttpServletRequest request,
		        HttpServletResponse response)
		        throws Exception {
		   
		   String username = (String) PropertyUtils.getSimpleProperty(form,
	                "username");
		   String password = (String) PropertyUtils.getSimpleProperty(form,
	                "password");
		   ActionMessages errors = new ActionMessages();
		   
		   if ( username.equals("test") && password.equals("password") ) {
			 //Good username/password.
			 //Set a request attribute to be used by a JSP page.
			 request.setAttribute("fullName", "John Doe");
			 request.setAttribute("logonID", username);
		   } else {
	            errors.add(
	                    ActionMessages.GLOBAL_MESSAGE,
	                    new ActionMessage("errors.logon.invalid"));
		   }
		   if ( errors.isEmpty() ) {
			   return (mapping.findForward("success"));
		   } else {
			   this.saveErrors(request, errors);
			   return (mapping.findForward("failure"));
		   }

	   }
	
}
