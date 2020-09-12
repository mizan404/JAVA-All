package xml1;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javafx.scene.input.KeyCode.G;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class xmlDemo {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);
            Element staff = doc.createElement("Staff");
            rootElement.appendChild(staff);
            Attr attr = doc.createAttribute("id");
            attr.setValue("1000");
            staff.setAttributeNode(attr);

//            shorten way
//            staff.setAttrabute("id", "1"); 
//              first element
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Mortoza"));
            staff.appendChild(firstname);

            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("Ahmed"));
            staff.appendChild(lastname);

            Element quickname = doc.createElement("quickname");
            quickname.appendChild(doc.createTextNode("Golam"));
            staff.appendChild(quickname);

            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("10000"));
            staff.appendChild(salary);

            Element country = doc.createElement("country");
            country.appendChild(doc.createTextNode("BD"));
            staff.appendChild(country);

            TransformerFactory transformFactory = TransformerFactory.newInstance();
            Transformer transformer = transformFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("G:\\IT Files\\OneDrive\\Secure\\Document\\JAVA\\Advance Java\\Swing\\ClassPractise\\xml1\\src\\example2\\xml3.xml"));
            transformer.transform(source, result);
            System.out.println("File Saved");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException ex) {
            ex.printStackTrace();
        }
    }
}
