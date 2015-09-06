package data;

import java.io.Serializable;

public class Debt implements Serializable {


	private static final long serialVersionUID = 1L;
	private String credInfo = "";
	private String claimInfo= "";
	private String claimAmount = "";
	private String type = "";
	private String prop = "";
	private String codebtorName = "";
	private String codebtorAddress = "";
	private String contingent = "";
	private String unliquidated = "";
	private String disputed = "";
	private String priorityType = "";
	private String liableParty = "";
	private String securingProperty = "";
	private String codebtorTwoName = "";
	private String codebtorTwoAddress = "";
	
	public String trimCredInfo(){
		String s = "";
		int count = 0;
		while(count < credInfo.length() && !(credInfo.charAt(count) == '\r')){

			s += credInfo.charAt(count);
			count++;
		}

		return s;
	}
	
	public boolean isDisputed(){
		if(disputed.equals("true")){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	public String getCodebtorTwoName(){
		return codebtorTwoName;
	}
	
	public String getCodebtorTwoAddress(){
		return codebtorTwoAddress;
	}
	
	public void setCodebtorTwoName(String s){
		codebtorTwoName = s;
	}
	
	public void setCodebtorTwoAddress(String s){
		codebtorTwoAddress = s;
	}
	
	public String getSecuringProperty(){
		return securingProperty;
	}
	
	public void setSecuringProperty(String s){
		securingProperty = s;
	}
	
	public String getLiableParty(){
		return liableParty;
	}
	
	public void setLiableParty(String s){
		liableParty = s;
	}
	public String getCredInfo() {
		return credInfo;
	}
	public void setCredInfo(String credInfo) {
		this.credInfo = credInfo;
	}
	public String getClaimInfo() {
		return claimInfo;
	}
	public void setClaimInfo(String claimInfo) {
		this.claimInfo = claimInfo;
	}
	public String getClaimAmount() {
		return claimAmount;
	}
	public void setClaimAmount(String claimAmount) {
		this.claimAmount = claimAmount;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProp() {
		return prop;
	}
	public void setProp(String prop) {
		this.prop = prop;
	}
	public String getCodebtorName() {
		return codebtorName;
	}
	public void setCodebtorName(String s) {
		codebtorName = s;
	}
	public String getCodebtorAddress() {
		return codebtorAddress;
	}
	public void setCodebtorAddress(String s) {
		codebtorAddress = s;
	}
	public String getContingent() {
		return contingent;
	}
	public void setContingent(String s) {
		contingent = s;
	}
	public String getUnliquidated() {
		return unliquidated;
	}
	public void setUnliquidated(String s) {
		unliquidated = s;
	}
	public String getDisputed() {
		return disputed;
	}
	public void setDisputed(String s) {

		disputed = s;
	}
	public String getPriorityType() {
		return priorityType;
	}
	public void setPriorityType(String s) {
		priorityType = s;
	}
	
	
}
