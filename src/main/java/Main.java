import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {

        //csv to json
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        List<Employee> employees = InteractionCsv.parseScv(columnMapping, "data.csv");
        ListToJson.ToJson(employees, "data.json");

        //xml to json
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc = builder.parse(new File("data.xml"));
        Node root = doc.getDocumentElement();
        List<Employee> list = InteractionXml.read(root);
        ListToJson.ToJson(list, "data.json");

    }


}

