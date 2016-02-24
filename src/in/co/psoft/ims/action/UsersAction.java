package in.co.psoft.ims.action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.psoft.ims.db.ConnectionPool;
import in.co.psoft.ims.form.CategoryForm;
import in.co.psoft.ims.form.LoginForm;
import in.co.psoft.ims.form.UsersForm;

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

public final class UsersAction extends Action{

    static String PASSWORD = "password";
    
	   public ActionForward execute(
		        ActionMapping mapping,
		        ActionForm form,
		        HttpServletRequest request,
		        HttpServletResponse response)
		        throws Exception {
		   
		   UsersForm usersForm =(UsersForm)form;
		   
		   
		   String name = usersForm.getName();
		   String password = usersForm.getPassword();
		   String type=usersForm.getType();
			
		  
		   Connection con = ConnectionPool.getConnection();
		   
		   PreparedStatement preparedStatement = con.prepareStatement("insert into Users (ID,name,UNAME,password,type) values (users_Seq.nextval,?,?,?,?)");
		   preparedStatement.setString(1, name);
		   preparedStatement.setString(2, name);
		   preparedStatement.setString(3, password);
		   preparedStatement.setString(4, type);
		   	
		   preparedStatement.execute();
		  
		   ActionMessages errors = new ActionMessages();
		   return mapping.findForward("success");
	   }
}