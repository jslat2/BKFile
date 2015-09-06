package data;

import java.io.Serializable;

public class Contract implements Serializable {

	private static final long serialVersionUID = 1L;
	private String otherParty = "";
	private String description = "";
	
	public String getOtherParty() {
		return otherParty;
	}
	public void setOtherParty(String otherParty) {
		this.otherParty = otherParty;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
