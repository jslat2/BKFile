package data;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

import analysis.PaycheckScan;
import gui.B22Box;
import gui.B22CoBox;
import gui.CreditorBox;
import gui.Interface;
import gui.ScheduleB;
import gui.ScheduleD;
import gui.VoluntaryPetition;

public class BkFile implements Runnable{
	
	

	public static String jointName = "";
	public static boolean running = false;
	private Thread thread;
	public static String filePath = "C:/Users/Gaming/Desktop/hello.txt";
	public static Map<String, String> vars = new HashMap<String, String>();
	public static Interface gui = new Interface();
	static VoluntaryPetition vp = new VoluntaryPetition();
	TxtEdit txt = new TxtEdit();

	
	public void setLastName(String s){
		if(vars.containsKey("lastName")){
			vars.remove("lastName");
		}
		vars.put("lastName", s);
	}
	

	public void setVar(String key, String newVal){
		if(vars.containsKey(key)){
			vars.remove(key);
		}
		vars.put(key, newVal);	
	}
	
	public void setRunning(boolean x){
		running = x;
	}
	
	public String getField(Map hash, String s){
		if(hash.get(s) != null){
			return hash.get(s).toString();
		}
		else{
			return "";
		}
	}
	
	public String getField(String s){
		if(vars.get(s) != null){
			return vars.get(s).toString();
		}
		else{
			return "";
		}
	}
	
	public void start() {
		running = true;
		thread = new Thread(this, "BkEditor");
		thread.start();
	}
	
	public void run(){

		PaycheckScan p = new PaycheckScan();
		System.out.println(p.isNumber("500"));

		p.readDocxFile("C:/Users/Gaming/Desktop/kkk.xls");
		
		/*
Pdf pdf = new Pdf();

try {
	pdf.printFields("C:/Users/Gaming/Desktop/1.pdf");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
}
*/
/*
		txt.loadHash(vars);
		try {
			txt.loadPaychecks("C:/Users/Gaming/Desktop/paychecks.txt");
			txt.loadCoPaychecks("C:/Users/Gaming/Desktop/coPaychecks.txt");
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		B22Box b = new B22Box();
		b.loadFromHash();
		B22CoBox c = new B22CoBox();
		c.loadFromHash();

		try {
			txt.loadArray("C:/Users/Gaming/Desktop/a.txt");
			txt.loadDArray("C:/Users/Gaming/Desktop/b.txt");
			txt.loadGArray("C:/Users/Gaming/Desktop/c.txt");

			txt.loadOtherAmountsArray("C:/Users/Gaming/Desktop/otherAmounts.txt");
			txt.loadOtherSourcesArray("C:/Users/Gaming/Desktop/otherSources.txt");
			txt.loadAlimonyAmountsArray("C:/Users/Gaming/Desktop/alimonyAmounts.txt");
			txt.loadAlimonyDatesArray("C:/Users/Gaming/Desktop/alimonyDates.txt");
			txt.loadRegularPaymentsDatesArray("C:/Users/Gaming/Desktop/regularPaymentsDates.txt");
			txt.loadRegularPaymentsSourcesArray("C:/Users/Gaming/Desktop/regularPaymentsSources.txt");
			txt.loadRegularPaymentsAmountsArray("C:/Users/Gaming/Desktop/regularPaymentsAmounts.txt");
			txt.loadBusinessNames("C:/Users/Gaming/Desktop/businessNames.txt");
			txt.loadBusinessAmounts("C:/Users/Gaming/Desktop/businessAmounts.txt");
			txt.loadBusinessDates("C:/Users/Gaming/Desktop/businessDates.txt");
			txt.loadRealDates("C:/Users/Gaming/Desktop/realDates.txt");
			txt.loadRealAmounts("C:/Users/Gaming/Desktop/realAmounts.txt");
			txt.loadInterestAmounts("C:/Users/Gaming/Desktop/interestAmounts.txt");
			txt.loadInterestDates("C:/Users/Gaming/Desktop/interestDates.txt");
			txt.loadUnemploymentAmounts("C:/Users/Gaming/Desktop/unemploymentAmounts.txt");
			txt.loadUnemploymentDates("C:/Users/Gaming/Desktop/unemploymentDates.txt");
			txt.loadPensionAmounts("C:/Users/Gaming/Desktop/pensionAmounts.txt");
			txt.loadPensionDates("C:/Users/Gaming/Desktop/pensionDates.txt");
			txt.loadPaychecks("C:/Users/Gaming/Desktop/paychecks.txt");
			txt.loadCoOtherAmountsArray("C:/Users/Gaming/Desktop/coOtherAmounts.txt");
			txt.loadCoOtherSourcesArray("C:/Users/Gaming/Desktop/coOtherSources.txt");
			txt.loadCoAlimonyAmountsArray("C:/Users/Gaming/Desktop/coAlimonyAmounts.txt");
			txt.loadCoAlimonyDatesArray("C:/Users/Gaming/Desktop/coAlimonyDates.txt");
			txt.loadCoRegularPaymentsDatesArray("C:/Users/Gaming/Desktop/coRegularPaymentsDates.txt");
			txt.loadCoRegularPaymentsSourcesArray("C:/Users/Gaming/Desktop/coRegularPaymentsSources.txt");
			txt.loadCoRegularPaymentsAmountsArray("C:/Users/Gaming/Desktop/coRegularPaymentsAmounts.txt");
			txt.loadCoBusinessNames("C:/Users/Gaming/Desktop/coBusinessNames.txt");
			txt.loadCoBusinessAmounts("C:/Users/Gaming/Desktop/coBusinessAmounts.txt");
			txt.loadCoBusinessDates("C:/Users/Gaming/Desktop/coBusinessDates.txt");
			txt.loadCoRealDates("C:/Users/Gaming/Desktop/coRealDates.txt");
			txt.loadCoRealAmounts("C:/Users/Gaming/Desktop/coRealAmounts.txt");
			txt.loadCoInterestAmounts("C:/Users/Gaming/Desktop/coInterestAmounts.txt");
			txt.loadCoInterestDates("C:/Users/Gaming/Desktop/coInterestDates.txt");
			txt.loadCoUnemploymentAmounts("C:/Users/Gaming/Desktop/coUnemploymentAmounts.txt");
			txt.loadCoUnemploymentDates("C:/Users/Gaming/Desktop/coUnemploymentDates.txt");
			txt.loadCoPensionAmounts("C:/Users/Gaming/Desktop/coPensionAmounts.txt");
			txt.loadCoPensionDates("C:/Users/Gaming/Desktop/coPensionDates.txt");
			txt.loadCoPaychecks("C:/Users/Gaming/Desktop/coPaychecks.txt");

		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
		
		gui.setVisible(true);
	}

	
	
	public void save(String filePath){
	}
	
	public static void main(String[] args) throws Exception{
		BkFile bk = new BkFile();
		bk.start();
//		Pdf pdf = new Pdf();
//		pdf.printFields("C:/users/gaming/desktop/try1.pdf");

	}
}
