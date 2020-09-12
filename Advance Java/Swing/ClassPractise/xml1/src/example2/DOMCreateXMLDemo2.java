package example2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class DOMCreateXMLDemo2 {

    public static void main(String[] args)  {
        List<Staff> list = new ArrayList();
        list.add(new Staff(100, "AB", "Rahman", "Mohammad", 1000.0, "BD"));
        list.add(new Staff(101, "AC", "Rahman", "Mohammad", 1000.0, "BD"));
        list.add(new Staff(102, "AD", "Rahman", "Mohammad", 1000.0, "BD"));
        list.add(new Staff(103, "AE", "Rahman", "Mohammad", 1000.0, "BD"));
        list.add(new Staff(104, "AF", "Rahman", "Mohammad", 1000.0, "BD"));
        list.add(new Staff(105, "AG", "Rahman", "Mohammad", 1000.0, "BD"));

        for (int i = 106; i <= 1000; i++) {
            list.add(new Staff(++i, "AB" + i, "Rahman" + i, "Mohammad" + i, ++i + 1000.0, "BD" + i));
        }

        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            // root elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);
            // staff elements
            for (Staff s : list) {
                Element staff = doc.createElement("Staff");
                rootElement.appendChild(staff);
                // set attribute to staff element
                Attr attr = doc.createAttribute("id");
                attr.setValue(String.valueOf(s.getId()));
                staff.setAttributeNode(attr);

                // shorten way
                // staff.setAttribute("id", "1");
                // firstname elements
                Element firstname = doc.createElement("firstname");
                firstname.appendChild(doc.createTextNode(s.getFirstname()));
                staff.appendChild(firstname);

                // lastname elements
                Element lastname = doc.createElement("lastname");
                lastname.appendChild(doc.createTextNode(s.getLastname()));
                staff.appendChild(lastname);

                // nickname elements
                Element nickname = doc.createElement("nickname");
                nickname.appendChild(doc.createTextNode(s.getNickname()));
                staff.appendChild(nickname);

                // salary elements
                Element salary = doc.createElement("salary");
                salary.appendChild(doc.createTextNode(String.valueOf(s.getSalary())));
                staff.appendChild(salary);

                // salary elements
                Element country = doc.createElement("country");
                country.appendChild(doc.createTextNode(s.getCountry()));
                staff.appendChild(country);
            }
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("G:\\IT Files\\OneDrive\\Secure\\Document\\JAVA\\Advance Java\\Swing\\ClassPractise\\xml1\\src\\xml1\\xml.xml"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);
            transformer.transform(source, result);

            System.out.println("File saved!");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        }
    }
}
