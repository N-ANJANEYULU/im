package in.co.psoft.ims.form;

import org.apache.struts.validator.ValidatorForm;

/**
 * <p>Validate a user logon.</p>
 *
 * @version $Rev: 1 $ $Date: 2005-14-27
 */

public final class PurchaseDetailsForm extends ValidatorForm{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String id;
	private String purchaseproductcost;
	private String purchaseproductid ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPurchaseproductcost() {
		return purchaseproductcost;
	}
	public void setPurchaseproductcost(String purchaseproductcost) {
		this.purchaseproductcost = purchaseproductcost;
	}
	public String getPurchaseproductid() {
		return purchaseproductid;
	}
	public void setPurchaseproductid(String purchaseproductid) {
		this.purchaseproductid = purchaseproductid;
	}
	
}