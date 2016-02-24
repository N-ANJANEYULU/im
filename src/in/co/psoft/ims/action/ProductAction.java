package in.co.psoft.ims.action;

import java.sql.Connection;
import java.sql.PreparedStatement;

import in.co.psoft.ims.db.ConnectionPool;
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

public final class ProductAction extends Action{

    static String PASSWORD = "password";
    
	   public ActionForward execute(
		        ActionMapping mapping,
		        ActionForm form,
		        HttpServletRequest request,
		        HttpServletResponse response)
		        throws Exception {
		   
		   ProductForm productForm =(ProductForm)form;
		   
		   
		   String name = productForm.getName(); 
		   String id = productForm.getId();
		   String mfdate = productForm.getMfdate();
		   String expdate = productForm.getExpdate();
		   String description = productForm.getDescription();
           
		   Connection con = ConnectionPool.getConnection();
		   
		   PreparedStatement preparedStatement = con.prepareStatement("Insert into PRODUCT (ID,NAME,MF_DATE,EXP_DATE,DESCRIPTION) values (product_Seq.nextval,?,?,?,?)");
		   preparedStatement.setString(1, name);
		   preparedStatement.setString(2, mfdate);
		   preparedStatement.setString(3, expdate);
		   preparedStatement.setString(4, description);
		   	
		   preparedStatement.execute();
		  
		   System.out.println("product .. " + productForm.getDescription());
		   ConnectionPool.freeConnection(con);;
		   ActionMessages errors = new ActionMessages();
		   return mapping.findForward("success");
	   }
		   
	
}
