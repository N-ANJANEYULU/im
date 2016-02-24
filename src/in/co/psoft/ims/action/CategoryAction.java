package in.co.psoft.ims.action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.psoft.ims.db.ConnectionPool;
import in.co.psoft.ims.form.CategoryForm;
import in.co.psoft.ims.form.LoginForm;

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

public final class CategoryAction extends Action{

    static String PASSWORD = "password";
    
	   public ActionForward execute(
		        ActionMapping mapping,
		        ActionForm form,
		        HttpServletRequest request,
		        HttpServletResponse response)
		        throws Exception {
		   
		   CategoryForm categoryForm =(CategoryForm)form;
		   
		   
		   String name = categoryForm.getName();
		   String description = categoryForm.getDescription();
		   /**
		    * Loading the Driver.. Class.forName
		    * preparing the Connection.. DriverManger.getConnection
		    * prpareing the Statment con.prepareStament()
		    * executing the query .. statmenet.executeQuery
		    * processing the resultset restulSet..
		    * reeasing the connection. Connection
		    * 
		    */
		  
		   Connection con = ConnectionPool.getConnection();
		   
		   PreparedStatement preparedStatement = con.prepareStatement("Insert into CATEGARY (ID,NAME,DESCRIPTION) values (category_Seq.nextval,?,?)");
		   preparedStatement.setString(1, name);
		   preparedStatement.setString(2, description);
		   	
		   preparedStatement.execute();
		  
		   ActionMessages errors = new ActionMessages();
		   return mapping.findForward("success");
	   }
}