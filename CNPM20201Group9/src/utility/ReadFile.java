package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


public class ReadFile {
	
	
	public static String readFile(File file) {
		String fileContent = "";
		
		try {
			XWPFDocument document = new XWPFDocument(OPCPackage.open(new FileInputStream(file)));
			List<XWPFParagraph> paragraphList = document.getParagraphs();
		      for (XWPFParagraph paragraph : paragraphList) {
		    	  fileContent += paragraph.getText() + "\n";
		      }
		   document.close();
		} catch (IOException | InvalidFormatException e) {
			e.printStackTrace();
		} 
		
		return fileContent;
	}
}
