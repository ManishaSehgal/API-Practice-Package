package PlayingWithXML_Response;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ConvertingXML_to_JSON {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		
     File f = new File("../XMLHandling/XMLFile.xml");
     DocumentBuilderFactory dmf= DocumentBuilderFactory.newInstance();
     DocumentBuilder dm = dmf.newDocumentBuilder();
     Document doc = dm.parse(f);
     DOMSource domSource = new DOMSource(doc);
         
     //Converting doc into String
    
     TransformerFactory tf= TransformerFactory.newInstance();
     Transformer transformer= tf.newTransformer();
     StringWriter str = new StringWriter();
     transformer.transform(domSource, new StreamResult(str));
     
     //Converting xml to JSONObject
     JSONObject js = XML.toJSONObject(str.toString());
     System.out.println(js.toString());

	}

}
