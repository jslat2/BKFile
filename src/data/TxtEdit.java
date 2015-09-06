package data;

import gui.B22Box;
import gui.B22CoBox;
import gui.ScheduleB;
import gui.ScheduleD;
import gui.ScheduleG;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;


public class TxtEdit{
	
	
	public static void loadCoPaychecks(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.paychecks = (ArrayList<Paycheck>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoPensionAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.pensionAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoPensionDates(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.pensionDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoUnemploymentAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.unemploymentAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoUnemploymentDates(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.unemploymentDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoInterestAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.interestAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoInterestDates(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.interestDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoRealAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.realAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoRealDates(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.realDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoBusinessNames(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.businessNames = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoBusinessAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.businessAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoBusinessDates(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.businessDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoRegularPaymentsDatesArray(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.regularPaymentsDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoRegularPaymentsSourcesArray(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.regularPaymentsSources = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoRegularPaymentsAmountsArray(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.regularPaymentsAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoAlimonyAmountsArray(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.alimonyAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoAlimonyDatesArray(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.alimonyDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}

	public static void loadCoOtherSourcesArray(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.otherSources = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadCoOtherAmountsArray(String fileName) throws IOException, ClassNotFoundException{
		B22CoBox s = new B22CoBox();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.otherAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void loadPaychecks(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.paychecks = (ArrayList<Paycheck>) ois.readObject();
		ois.close();
	}
	
	public static void loadPensionAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.pensionAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadPensionDates(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.pensionDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadUnemploymentAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.unemploymentAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadUnemploymentDates(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.unemploymentDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadInterestAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.interestAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadInterestDates(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.interestDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadRealAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.realAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadRealDates(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.realDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadBusinessNames(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.businessNames = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadBusinessAmounts(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.businessAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadBusinessDates(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.businessDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadRegularPaymentsDatesArray(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.regularPaymentsDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadRegularPaymentsSourcesArray(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.regularPaymentsSources = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadRegularPaymentsAmountsArray(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.regularPaymentsAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadAlimonyAmountsArray(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.alimonyAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadAlimonyDatesArray(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.alimonyDates = (ArrayList<String>) ois.readObject();
		ois.close();
	}

	public static void loadOtherSourcesArray(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.otherSources = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	
	public static void loadOtherAmountsArray(String fileName) throws IOException, ClassNotFoundException{
		B22Box s = new B22Box();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		s.otherAmounts = (ArrayList<String>) ois.readObject();
		ois.close();
	}
	



	

	public static void loadArray(String fileName) throws IOException, ClassNotFoundException{
		ScheduleB b = new ScheduleB();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		b.prop = (ArrayList<Property>) ois.readObject();
		ois.close();
	
	}

	public void saveArray(String fileName, ArrayList<Property> arr) throws FileNotFoundException {
		FileOutputStream fout= new FileOutputStream (fileName);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeObject(arr);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void loadDArray(String fileName) throws IOException, ClassNotFoundException{
		ScheduleD d = new ScheduleD();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		d.debt = (ArrayList<Debt>) ois.readObject();
		ois.close();
	
	}

	public void saveDArray(String fileName, ArrayList<Debt> arr) throws FileNotFoundException {
		FileOutputStream fout= new FileOutputStream (fileName);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeObject(arr);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void savePaycheckArray(String fileName, ArrayList<Paycheck> arr) throws FileNotFoundException {
		FileOutputStream fout= new FileOutputStream (fileName);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeObject(arr);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void loadGArray(String fileName) throws IOException, ClassNotFoundException{
		ScheduleG g = new ScheduleG();
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		g.contracts = (ArrayList<Contract>) ois.readObject();
		ois.close();
	
	}

	public void saveGArray(String fileName, ArrayList<Contract> arr) throws FileNotFoundException {
		FileOutputStream fout= new FileOutputStream (fileName);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeObject(arr);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	


	public void saveSaArray(String fileName, ArrayList<Integer> arr) throws FileNotFoundException {
		FileOutputStream fout= new FileOutputStream (fileName);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeObject(arr);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	



	
	public void saveSsArray(String fileName, ArrayList<String> arr) throws FileNotFoundException {
		FileOutputStream fout= new FileOutputStream (fileName);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeObject(arr);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	public static void loadIntegerArray(String fileName, ArrayList<Integer> arr) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		arr = (ArrayList<Integer>) ois.readObject();
		ois.close();
	
	}

	public void saveIntegerArray(String fileName, ArrayList<Integer> arr) throws FileNotFoundException {
		FileOutputStream fout= new FileOutputStream (fileName);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeObject(arr);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public static void loadStringArray(String fileName, ArrayList<String> arr) throws IOException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		arr = (ArrayList<String>) ois.readObject();
		ois.close();
	
	}

	public void saveStringArray(String fileName, ArrayList<String> arr) throws FileNotFoundException {
		FileOutputStream fout= new FileOutputStream (fileName);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(fout);
			oos.writeObject(arr);
			fout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public void saveHash(Map<String, String> hash){

		Properties properties = new Properties();

		for (Map.Entry<String,String> entry : hash.entrySet()) {
		    properties.put(entry.getKey(), entry.getValue());
		}

		try {
			properties.store(new FileOutputStream("C:/Users/Gaming/Desktop/hello.txt"), null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	public void loadHash(Map<String, String> hash){
	
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("C:/Users/Gaming/Desktop/hello.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String key : properties.stringPropertyNames()) {
			   hash.put(key, properties.get(key).toString());
		}
	}
	
	
	public void delete(String filePath){
		PrintWriter writer;
		try {
			writer = new PrintWriter(filePath);
			writer.print("");
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void addTxt(String s, String filePath){
		Writer output;
		try {
			output = new BufferedWriter(new FileWriter(filePath, true));
			output.append(s);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int findText(String s, Path filePath){
		Scanner scanner;
		try {
			scanner = new Scanner(filePath);
			int lineNum = 0;
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				lineNum++;
				if(line.contains(s)) { 
					return lineNum;
				}
			}
			scanner.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		return -1;

	}
	
}
		
