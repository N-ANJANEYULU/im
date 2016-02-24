package in.co.psoft.ims.action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.psoft.ims.db.ConnectionPool;
import in.co.psoft.ims.form.OrderForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessages;

/**
 * <p>Validate a user logon.</p>
 *
 * @version $Rev: 1 $ $Date: 2005-14-27 $
 */

public final class OrderAction extends Action{

    static String PASSWORD = "password";
    
	   public ActionForward execute(
		        ActionMapping mapping,
		        ActionForm form,
		        HttpServletRequest request,
		        HttpServletResponse response)
		        throws Exception {
		   
		   OrderForm orderForm =(OrderForm)form;
		   
		   
		    
		   String Id = orderForm.getId();
		   String name = orderForm.getName();
		   String tax = orderForm.getTax();
		   String discount = orderForm.getDiscount(); 
		   String description = orderForm.getDescription();
		   
		   Connection con = ConnectionPool.getConnection();
		   
		   PreparedStatement preparedStatement = con.prepareStatement("Insert into ORDER (ID,CUSID,TP,TAX,DISCOUNT,SAL_DATE) values (Order_Seq.nextval,?,?,?,?,?)");
		
		   preparedStatement.setString(1, name);
		   preparedStatement.setString(2, tax);
		   preparedStatement.setString(3, discount);
		   preparedStatement.setString(4, description);
		   	
		   preparedStatement.execute();
		  
		   
		  
		    ActionMessages errors = new ActionMessages();
		   return mapping.findForward("success");
	   }
		   
	
}
