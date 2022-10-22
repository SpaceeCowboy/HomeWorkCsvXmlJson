import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class InteractionXml {

    private static String id;
    private static String age;
    private static String lastName;
    private static String firstName;
    private static String country;
    private static List<Employee> employees = new ArrayList<>();

    public static List<Employee> read(Node node) {
        NodeList nodeList = node.getChildNodes();
        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node_ = nodeList.item(i);
            if (Node.ELEMENT_NODE == node_.getNodeType()) {
                Element element = (Element) node;
                if (element.getTagName().equals("employee")) {
                    continue;
                } else {
                    id = element.getElementsByTagName("id").item(employees.size()).getTextContent();
                    age = element.getElementsByTagName("age").item(employees.size()).getTextContent();
                    lastName = element.getElementsByTagName("lastName").item(employees.size()).getTextContent();
                    firstName = element.getElementsByTagName("firstName").item(employees.size()).getTextContent();
                    country = element.getElementsByTagName("country").item(employees.size()).getTextContent();
                    employees.add(new Employee(Long.parseLong(id), firstName, lastName, country, Integer.parseInt(age)));
                }
            }
            read(node_);
        }
        return employees;
    }

}

