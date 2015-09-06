package data;

import java.io.Serializable;
import java.util.ArrayList;

public class Paycheck implements Serializable{

	private static final long serialVersionUID = 1L;
	public String empName = "";
	public String empAddress = "";
	public boolean currentlyEmployed = false;
	public String empLength = "";
	public String occupation = "";
	public String date = "";
	public String amount = "";
	public int paycheckNo = 0;
	public String gross = "";
	public ArrayList<String> deductions = new ArrayList<>();
	public ArrayList<String> deductionAmounts = new ArrayList<>();
	

	
	
	public void setGross(String s){
		gross = s;
	}
	
	public String getGross(){
		return gross;
	}
	
	public int getPaycheckNo(){
		return paycheckNo;
	}
	
	public void setPaycheckNo(int x){
		paycheckNo = x;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public boolean isCurrentlyEmployed() {
		return currentlyEmployed;
	}
	public void setCurrentlyEmployed(boolean currentlyEmployed) {
		this.currentlyEmployed = currentlyEmployed;
	}
	public String getEmpLength() {
		return empLength;
	}
	public void setEmpLength(String empLength) {
		this.empLength = empLength;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	
}
