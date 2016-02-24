package in.co.psoft.ims.action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.psoft.ims.db.ConnectionPool;
import in.co.psoft.ims.form.PurchaseDetailsForm;

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

public final class PurchaseDetailsAction extends Action{

    static String PASSWORD = "password";
    
	   public ActionForward execute(
		        ActionMapping mapping,
		        ActionForm form,
		        HttpServletRequest request,
		        HttpServletResponse response)
		        throws Exception {
		   
		   PurchaseDetailsForm purchasedetailsForm =(PurchaseDetailsForm)form;
		   
		   
		   String name = purchasedetailsForm.getName(); 
		   String id = purchasedetailsForm.getId();
		   String purchaseproductcost = purchasedetailsForm.getPurchaseproductcost();
		   String purchaseproductid = purchasedetailsForm.getPurchaseproductid();
		   
           Connection con = ConnectionPool.getConnection();
		   
		   PreparedStatement preparedStatement = con.prepareStatement("Insert into PURCHASEDETAILS (ID,NAME,PURCHASEPRODUCTCOST,PURCHASEPRODUCTID) values (category_Seq.nextval,?,?,?)");
		   preparedStatement.setString(1, name);
		   preparedStatement.setString(2, purchaseproductcost);
		   preparedStatement.setString(3,purchaseproductid );
		   preparedStatement.execute();
		  
		   
		   ActionMessages errors = new ActionMessages();
		   return mapping.findForward("success");
	   }
		   
	
}
