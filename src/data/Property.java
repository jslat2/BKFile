package data;

import java.io.Serializable;

public class Property implements Serializable {

	private static final long serialVersionUID = 1L;
	private String description = "";
	private String owner = "";
	private String value = "";
	private String exemption = "";
	private String exemptionAmount = "";
	private String category = "";
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getExemption() {
		return exemption;
	}
	public void setExemption(String exemption) {
		this.exemption = exemption;
	}
	public String getExemptionAmount() {
		return exemptionAmount;
	}
	public void setExemptionAmount(String exemptionAmount) {
		this.exemptionAmount = exemptionAmount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
