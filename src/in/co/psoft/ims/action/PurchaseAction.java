package in.co.psoft.ims.action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.psoft.ims.db.ConnectionPool;
import in.co.psoft.ims.form.PurchaseForm;
import in.co.psoft.ims.form.LoginForm;
import in.co.psoft.ims.form.ProductForm;

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

public final class PurchaseAction extends Action{

    static String PASSWORD = "password";
    
	   public ActionForward execute(
		        ActionMapping mapping,
		        ActionForm form,
		        HttpServletRequest request,
		        HttpServletResponse response)
		        throws Exception {
		   
		   PurchaseForm purchaseForm =(PurchaseForm)form;
		   
		   
		   String name = purchaseForm.getName(); 
		   String id = purchaseForm.getId();
		   String purchasedate = purchaseForm.getPurchasedate();
		   String totalcost = purchaseForm.getTotalcost();
		   String discount = purchaseForm.getDiscount();
		   String description = purchaseForm.getDescription();
		   
           Connection con = ConnectionPool.getConnection();
		   
		   PreparedStatement preparedStatement = con.prepareStatement("Insert into PURCHASE (ID,NAME,PURCHASEDATE,TOTALCOST,DISCOUNT,DESCRIPTION) values (purchase_Seq.nextval,?,?,?,?,?)");
		   preparedStatement.setString(1, name);
		   preparedStatement.setString(2, purchasedate);
		   preparedStatement.setString(3, totalcost);
		   preparedStatement.setString(4, discount);
		   preparedStatement.setString(5, description);
		   
		   
		  
		   	
		   preparedStatement.execute();
		  
		   
		   System.out.println("purchase .. " + purchaseForm.getDescription());
		   
		   ActionMessages errors = new ActionMessages();
		   return mapping.findForward("success");
	   }
		   
	
}
