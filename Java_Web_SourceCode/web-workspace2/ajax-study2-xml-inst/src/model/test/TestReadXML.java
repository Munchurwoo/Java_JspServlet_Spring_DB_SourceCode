package model.test;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class TestReadXML {

	public static void main(String[] args) {
		// XML을 입력받아 오는 예제 
		try {
			Document loadDocument=
					new SAXBuilder().build(
							new File("C:\\java-kosta\\web.xml"));
			Element element=loadDocument.getRootElement();
			@SuppressWarnings("unchecked")
			List<Element> list=element.getContent();
			for(int i=0;i<list.size();i++){
				Element e=list.get(i);
				System.out.println("read :"+e.getName()
						+" "+e.getText());
			}
		} catch (JDOMException | IOException e) {			
			e.printStackTrace();
		}
	}
}









