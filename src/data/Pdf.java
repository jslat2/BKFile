package data;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDDocumentCatalog;
import org.apache.pdfbox.pdmodel.interactive.form.*;
import java.io.File;
import java.util.*;

public class Pdf {

	    public static void listFields(PDDocument doc) throws Exception {
	        PDDocumentCatalog catalog = doc.getDocumentCatalog();
	        PDAcroForm form = catalog.getAcroForm();
	        List<PDField> fields = form.getFields();

	        for(PDField field: fields) {
	        	
	            field.setValue("hel65465848");
	            Object value = field.getValue();
	            String name = field.getFullyQualifiedName() + "adsf";

	            System.out.print(name);
	            System.out.print(" = ");
	            System.out.print(value);
	            System.out.println();
	        }
	       
	    }

	    public static void printFields(String filePath) throws Exception{
	        File file = new File(filePath);
	        PDDocument doc = PDDocument.load(file);
	        listFields(doc);
	        doc.save(file);
	    }

	}	
	
	
	/*
	public void manipulatePdf(String src, String xml, File dest, boolean readOnly)
		throws IOException, DocumentException, ParserConfigurationException, SAXException{
			PdfReader reader = new PdfReader(src);
			PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(dest));
			AcroFields form = stamper.getAcroFields();
			XfaForm xfa = form.getXfa();
			xfa.fillXfaForm(new FileInputStream(xml));
			stamper.close();
	}
	
	
	public void convertToPdf(String fileOne, String fileTwo){
		String[] files = new String[2];
		files[0] = fileOne;
		files[1] = fileTwo;

    
		try {

			BufferedReader input = new BufferedReader (new FileReader(files[0]));

			Document out = new Document(PageSize.LETTER, 40, 40, 40, 40);

			PdfWriter.getInstance(out, new FileOutputStream (files[1]));

			out.open();
			out.addSubject(files[0]);
			out.addTitle(files[0]);
			
			String line = "";
			
			while(null != (line = input.readLine())) {
				Paragraph p = new Paragraph(line);
				p.setAlignment(Element.ALIGN_JUSTIFIED);
				out.add(p);
			}

			out.close();
			input.close();
			System.exit(0);
		}
		catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	*/
//}
