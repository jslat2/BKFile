package analysis;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import data.BkFile;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


public class PaycheckScan {
	public static ArrayList<String> remainingNums = new ArrayList<String>();
	BkFile bk = new BkFile();
	int grossStart = 0;
	String gross= "";
	
		String s = " ";
	
	public void importReturns(String fileName){
		try {
			s = readFile(fileName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//gross
		//	bk.setVar("SOneOne0", findRight(s.indexOf("tips"), s));
		for(int i = 0; i < s.length(); i++){
			if(findRight(i, s).equals("7") && findLeft(i, s).equals("Income") ||  (findRight(i, s).equals("7") && findLeft(i,s).equals("W-2"))){

				grossStart = i;
				break;
			}
		}
		System.out.println(grossStart);
		for(int i = grossStart; i < s.length(); i++){
			if(s.charAt(i) == '7'){
				grossStart = i+1;
				break;
			}
		}
		for(int i = grossStart; i < s.length(); i++){
			if(s.charAt(i) != ' '){
				grossStart = i;
				break;
			}
		}
	
		for(int i = grossStart; i < s.length(); i++){
			if(Character.isDigit(s.charAt(i)) || s.charAt(i)== ','){
				gross += s.charAt(i);
			}
			else{
				break;
			}
			System.out.println(gross);
		
		}
		
	}
	
	public String findTopRightJustified(int x, String s){
		int leftIndex = findLeftIndex(x, s);
		String previousLine = "";
		int previousLineStart = 0;
		int tempWordStart = 0;
		String tempWord = "";
		int nCount = 0;
		boolean exists = false;

		for(int i = x; i > 0; i--){
			if(s.charAt(i) == '\n' && nCount ==1){
				previousLineStart = i+1;
				break;
			}
			else if(s.charAt(i) == '\n'){
				nCount++;
			}
		}

		if(previousLineStart == 0){
			return "nothing found";
		}
	
		for(int i = previousLineStart; i < s.length(); i++){
			if(s.charAt(i) == '\n'){
				break;
			}
			else{
				previousLine += s.charAt(i);
			}
		}
	

		for(int i = 0; i < previousLine.length(); i++){
			if(leftIndex == findLeftIndex(i, previousLine) && previousLine.charAt(i) != ' '){
				exists = true;
				tempWordStart = i;
				break;
			}

		}
		
		if(!exists){
			return "No word found";
		}
		
		for(int i = tempWordStart; i < previousLine.length(); i++){
			if(previousLine.charAt(i) == ' ' || previousLine.charAt(i) == '\n'){
				break;
			}
			else{
				tempWord+= previousLine.charAt(i);
			}
		}
	
		return tempWord;
	}
	
	public String findTopLeftJustified(int x, String s){
		int rightIndex = findRightIndex(x, s);
		String previousLine = "";
		int previousLineStart = 0;
		int tempWordStart = 0;
		String tempWord = "";
		int nCount = 0;
		boolean exists = false;

		for(int i = x; i > 0; i--){
			if(s.charAt(i) == '\n' && nCount ==1){
				previousLineStart = i+1;
				break;
			}
			else if(s.charAt(i) == '\n'){
				nCount++;
			}
		}

		if(previousLineStart == 0){
			return "nothing found";
		}
	
		for(int i = previousLineStart; i < s.length(); i++){
			if(s.charAt(i) == '\n'){
				break;
			}
			else{
				previousLine += s.charAt(i);
			}
		}
	

		for(int i = 0; i < previousLine.length(); i++){
			if(rightIndex == findRightIndex(i, previousLine) && previousLine.charAt(i) != ' '){
				exists = true;
				tempWordStart = i;
				break;
			}

		}
		
		if(!exists){
			return "No word found";
		}
		
		for(int i = tempWordStart; i < previousLine.length(); i++){
			if(previousLine.charAt(i) == ' ' || previousLine.charAt(i) == '\n'){
				break;
			}
			else{
				tempWord+= previousLine.charAt(i);
			}
		}
	
		return tempWord;
	}
	
	public void init(String s){
		
		try {
			for(int i = 0; i < findNumbers(readFile(s)).size(); i++){
				remainingNums.add(findNumbers(readFile(s)).get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public String findFed(String s){
		return(findBottomLeftJustified(s.indexOf("Gross"),s));
	}
	
	public String findBottomLeftJustified(int x, String s){
		int rightIndex = findRightIndex(x, s);
		String nextLine = "";
		int nextLineStart = 0;
		int tempWordStart = 0;
		String tempWord = "";
		boolean exists = false;		

		for(int i = x; i < s.length(); i++){
			if(s.charAt(i) == '\n'){
				nextLineStart = i+1;
				break;
			}
		}

		if(nextLineStart >= s.length()){
			return "nothing found";
		}
		
		for(int i = nextLineStart; i < s.length(); i++){
			if(s.charAt(i) == '\n'){
				break;
			}
			else{
				nextLine += s.charAt(i);
			}
		}

		for(int i = 0; i < nextLine.length(); i++){
			if(rightIndex == findRightIndex(i, nextLine) && nextLine.charAt(i) != ' '){
				exists = true;
				tempWordStart = i;
				break;
			}

		}
		
		if(!exists){
			return "no word found";
		}
		for(int i = tempWordStart; i < nextLine.length(); i++){
			if(nextLine.charAt(i) == ' ' || nextLine.charAt(i) == '\n'){
				break;
			}
			else{
				tempWord+= nextLine.charAt(i);
			}
		}
		
		return tempWord;
		
	}
	
	public String findBottomRightJustified(int x, String s){
		int leftIndex = findLeftIndex(x, s);
		String nextLine = "";
		int nextLineStart = 0;
		int tempWordStart = 0;
		String tempWord = "";
		boolean exists = false;
				

		for(int i = x; i < s.length(); i++){
			if(s.charAt(i) == '\n'){
				nextLineStart = i+1;
				break;
			}
		}

		if(nextLineStart >= s.length()){
			return "nothing found";
		}
		
		for(int i = nextLineStart; i < s.length(); i++){
			if(s.charAt(i) == '\n'){
				break;
			}
			else{
				nextLine += s.charAt(i);
			}
		}

		for(int i = 0; i < nextLine.length(); i++){
			if(leftIndex == findLeftIndex(i, nextLine) && nextLine.charAt(i) != ' '){
				exists = true;
				tempWordStart = i;
				break;
			}

		}
		
		if(!exists){
			return "No word found";
		}
		
		for(int i = tempWordStart; i < nextLine.length(); i++){
			if(nextLine.charAt(i) == ' ' || nextLine.charAt(i) == '\n'){
				break;
			}
			else{
				tempWord+= nextLine.charAt(i);
			}
		}
		
		return tempWord;
	}
	
	public boolean isNumber(String s){
		if(s.charAt(0) == '$'){
			for(int i = 1; i < s.length(); i++){
				if(s.charAt(i) == ',' && i < s.length()-3 && Character.isDigit(s.charAt(i+1)) && Character.isDigit(s.charAt(i+2)) && Character.isDigit(s.charAt(i+3))){
					//do nothing
				}
				else if(s.charAt(i) == '.'){
					//do nothing
				}
				else if(!Character.isDigit(s.charAt(i))){
					return false;
				}
			}
		}
		
		else if(Character.isDigit(s.charAt(0))){
			for(int i = 1; i < s.length(); i++){
				if(s.charAt(i) == ',' && i < s.length()-3 && Character.isDigit(s.charAt(i+1)) && Character.isDigit(s.charAt(i+2)) && Character.isDigit(s.charAt(i+3))){
					//do nothing
				}
				else if(s.charAt(i) == '.'){
					//do nothing
				}
				else if(!Character.isDigit(s.charAt(i))){
					return false;
				}
			}
		}
		
		return true;
		
	}
	
	
	public int findLeftIndex(int x, String s){
		int leftIndex = 0;
		for(int i = x; i < s.length()-1; i++){
			if(s.charAt(i) == '\n'){
				break;
			}
			else if(s.charAt(i) == ' ' && s.charAt(i + 1) != ' '){
				leftIndex++;
			}
		}
		return leftIndex;
	}
	
	public int findRightIndex(int x, String s){
		int rightIndex = 0;
		for(int i = x; i > 0; i--){
			if(s.charAt(i-1) == '\n'){
				break;
			}
			else if(s.charAt(i) == ' ' && s.charAt(i - 1) != ' '){
				rightIndex++;
			}
		}
		return rightIndex;
	}
	
	public String findLeft(int x, String s){
		int wordEnd = 0;
		int wordStart= 0;
		String word = "";
		boolean exists = false;
		int temp = 0;
		
		if(s.charAt(x) != ' '){ 
			for(int i = x; i > 0; i--){
				if(s.charAt(i) == '\n'){
					return "No word found";
				}
				if(s.charAt(i) == ' '){
					temp =i;
					break;
				}
			}
			
			for(int i = temp; i > 0; i--){
				if(s.charAt(i) == '\n'){
					return "No word found";
				}
				else if(s.charAt(i) != ' '){
					wordEnd = i;
					break;
				}
			}
		}
		else{
			for(int i = x; i > 0; i--){
				if(s.charAt(i) == '\n'){
					return "No word found";
				}
				if(s.charAt(i) != ' '){
					wordEnd = i;
					break;
				}
			}
		}
		
		

		for(int i = wordEnd; i>=0; i--){
			if(s.charAt(i) == ' ' || s.charAt(i) == '\n'){
				wordStart = i+1;
				break;
			}
		}

		
		for(int i = wordStart; i <= wordEnd; i++){
			word+=s.charAt(i);
		}
		return word;
	}
	
	public String findRight(int x, String s){
		int wordEnd = 0;
		int wordStart= 0;
		String word = "";
		boolean exists = false;
		int temp = 0;
		
		if(s.charAt(x) != ' '){ 
			for(int i = x; i < s.length(); i++){
				if(s.charAt(i) == '\n'){
					return "No word found";
				}
				if(s.charAt(i) == ' '){
					temp =i;
					break;
				}
			}
			
			for(int i = temp; i < s.length(); i++){
				if(s.charAt(i) == '\n'){
					return "No word found";
				}
				else if(s.charAt(i) != ' '){
					wordStart = i;
					break;
				}
			}
		}
		else{
			for(int i = x; i < s.length(); i++){
				if(s.charAt(i) == '\n'){
					return "No word found";
				}
				if(s.charAt(i) != ' '){
					wordStart = i;
					break;
				}
			}
		}
		
		

		for(int i = wordStart; i < s.length(); i++){
			if(s.charAt(i) == ' ' || s.charAt(i) == '\n'){
				wordEnd = i-1;
				break;
			}
		}

		
		for(int i = wordStart; i <= wordEnd; i++){
			word+=s.charAt(i);
		}
		return word;
	}
	
	public ArrayList<String> findNumbers(String s){

		String t = "";
		ArrayList<String> arr = new ArrayList<>();
		
		for(int i = 0; i < s.length(); i++){
			if(Character.isDigit(s.charAt(i))){
				boolean containsPeriod = false;
				t+=s.charAt(i);
				if(i+1 < s.length()){

					int j = i+1;

					while(j < s.length() && (Character.isDigit(s.charAt(j)) ||   (j+1 < s.length() && s.charAt(j)==',' &&  Character.isDigit(s.charAt(j+1))) || (j+1 < s.length() && s.charAt(j)=='.' &&  Character.isDigit(s.charAt(j+1))))){
						if(s.charAt(j) == '.'){
							containsPeriod = true;
						}
						t+=s.charAt(j);
						j++;
						i=j;
					}
				}
			if(containsPeriod){	
				arr.add(t);
			}
			containsPeriod = false;
			t = "";
			}

		}
		
		if(arr == null){
			arr.add("");
		}
		
		return arr;
	}
	  public void readDocxFile(String fileName) {
	       
	        
	        //
	        // Create an ArrayList to store the data read from excel sheet.
	        //
	        List sheetData = new ArrayList();
	 
	        FileInputStream fis = null;
	        try {
	            //
	            // Create a FileInputStream that will be use to read the 
	            // excel file.
	            //
	            fis = new FileInputStream(fileName);
	 
	            //
	            // Create an excel workbook from the file system.
	            //
	            HSSFWorkbook workbook = new HSSFWorkbook(fis);
	            //
	            // Get the first sheet on the workbook.
	            //
	            HSSFSheet sheet = workbook.getSheetAt(0);
	 
	            //
	            // When we have a sheet object in hand we can iterator on 
	            // each sheet's rows and on each row's cells. We store the 
	            // data read on an ArrayList so that we can printed the 
	            // content of the excel to the console.
	            //
	            Iterator rows = sheet.rowIterator();
	            while (rows.hasNext()) {
	                HSSFRow row = (HSSFRow) rows.next();
	                Iterator cells = row.cellIterator();
	 
	                List data = new ArrayList();
	                while (cells.hasNext()) {
	                    HSSFCell cell = (HSSFCell) cells.next();
	                    data.add(cell);
	                }
	 
	                sheetData.add(data);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (fis != null) {
	                try {
						fis.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	            }
	        }
	 
	        showExcelData(sheetData);
	    }
	 
	    private static void showExcelData(List sheetData) {
	        //
	        // Iterates the data and print it out to the console.
	        //
	        for (int i = 0; i < sheetData.size(); i++) {
	            List list = (List) sheetData.get(i);
	            for (int j = 0; j < list.size(); j++) {
	                HSSFCell cell = (HSSFCell) list.get(j);
	                System.out.print(
	                        cell.getRichStringCellValue().getString());
	                if (j < list.size() - 1) {
	                    System.out.print(", ");
	                }
	            }
	            System.out.println("");
	        }
	    }
	
		
	
	public static String readFile(String path) 
			  throws IOException 
			{
			  byte[] encoded = Files.readAllBytes(Paths.get(path));
			  return new String(encoded, "UTF-8");
			}
}
