package utility;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;


public class WriteFile {
	
	
	public static void writeFile(File file, String fileContent) {
		FileOutputStream out = null;
		XWPFDocument document = null;
		XWPFParagraph paragraph1 = null;
		XWPFRun run = null;
		
		document = new XWPFDocument();
		paragraph1 = document.createParagraph();
	    run = paragraph1.createRun();
	    run.setText(fileContent);
	    run.setFontSize(14);
	    run.setFontFamily("Times New Roman");
	    run.addBreak();

		try {
			out = new FileOutputStream(file);
		    document.write(out);
		    out.close();
		    document.close();
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
