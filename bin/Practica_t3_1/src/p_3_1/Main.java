package p_3_1;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class Main {

    public static void main(String[] args) throws IOException, ParserConfigurationException, XPathExpressionException {
        DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
        fact.setValidating(true);
        fact.setIgnoringElementContentWhitespace(true);

        DocumentBuilder builder = fact.newDocumentBuilder();

        try {
            File file3_3 = new File("/Users/cerrchus/Computer Science/MEDAC/Year2/23310TA_acessoADatos/23310TA_tareas/bin/Practica_t3_1/tema3_3.xml");
            Document doc = builder.parse(file3_3);
            doc.getDocumentElement().normalize();

            System.out.println("XML Content: ");
            System.out.println(doc.getDocumentElement().getTextContent());

            XPath xPath = XPathFactory.newInstance().newXPath();
            String expression = "/class/student";
            NodeList nodelist = (NodeList) xPath.compile(expression).evaluate(doc, XPathConstants.NODESET);

            for (int i = 0; i < nodelist.getLength(); i++) {
                Node nNode = nodelist.item(i);

                System.out.println("\nCurrent Element: " + nNode.getNodeName());
                Element eElement = (Element) nNode;
                System.out.println("Student Roll No.: " + eElement.getAttribute("rollno"));
                System.out.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
            }
        } catch (SAXException e) {
            e.printStackTrace();
        }
    }
}
