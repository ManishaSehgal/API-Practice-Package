package PlayingWithXML_Response;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLHandling {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		File f = new File("../XMLHandling/XMLFile.xml");
		DocumentBuilderFactory dmf = DocumentBuilderFactory.newInstance();
		DocumentBuilder dmb = dmf.newDocumentBuilder();
		Document doc = dmb.parse(f);

		NodeList ns = doc.getElementsByTagName("title");

		for (int i = 0; i < ns.getLength(); i++) {
			Node n = ns.item(i);
			System.out.println(n.getTextContent());
		}

	}

}
