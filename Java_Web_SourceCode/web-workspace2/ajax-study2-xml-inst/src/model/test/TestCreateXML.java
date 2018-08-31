package model.test;

import java.io.FileWriter;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

/**
 * XML : Extensible Markup language
 * 특수한 목적의 언어를 생성하고 로딩하여 
 * 사용하고자 할 때 ( 대표 용도 : 설정문서 , ajax 통신 )
 * @author kosta-inst
 *
 */
public class TestCreateXML {

	public static void main(String[] args) {
		// XML을 생성
		Document myDocument=new Document();
		Element root=new Element("servlet-mapping");
		myDocument.setRootElement(root);
		root.addContent(new Element("servlet-name").addContent("HelloServlet"));
		root.addContent(new Element("url-pattern").addContent("/hello"));
		XMLOutputter xmlOut=new XMLOutputter();
		try {
			FileWriter fw=new FileWriter("C:\\java-kosta\\web.xml");
			xmlOut.output(myDocument, fw);
			System.out.println("xml 생성");
			fw.close();
		} catch (IOException e) {			
			e.printStackTrace();
		}
	}
}










