package in.co.psoft.ims.action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.psoft.ims.db.ConnectionPool;
import in.co.psoft.ims.form.OrderDetailsForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

/**
 * <p>Validate a user logon.</p>
 
 * @version $Rev: 1 $ $Date: 2005-14-27 $
 */

public final class OrderDetailsAction extends Action{

    static String PASSWORD = "password";
    
	   public ActionForward execute(
		        ActionMapping mapping,
		        ActionForm form,
		        HttpServletRequest request,
		        HttpServletResponse response)
		        throws Exception {
		   
		   OrderDetailsForm orderdetailsForm =(OrderDetailsForm)form;
		   
		   
		    
		   String id = orderdetailsForm.getId(); 
		   String name = orderdetailsForm.getName();
		   String returns = orderdetailsForm.getReturns();
		   String discount = orderdetailsForm.getDiscount(); 
		   String description = orderdetailsForm.getDescription();
		   
           Connection con = ConnectionPool.getConnection();
		   
		   PreparedStatement preparedStatement = con.prepareStatement("Insert into OrderDetails (ID,NAME,RETURNS,DISCOUNT,DESCRIPTION) values (orderdetails_Seq.nextval,?,?,?,?)");
		   
		   preparedStatement.setString(1,name);
		   preparedStatement.setString(2,returns);
		   preparedStatement.setString(3,discount);
		   preparedStatement.setString(4,description);
		   	
		   preparedStatement.execute();
		  
		   
		   System.out.println("orderdetails .. " + orderdetailsForm.getDescription());
		   
		   ActionMessages errors = new ActionMessages();
		   return mapping.findForward("success");
	   }
		   
	
}
