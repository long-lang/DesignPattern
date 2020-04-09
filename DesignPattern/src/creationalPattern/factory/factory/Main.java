package creationalPattern.factory.factory;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {
   public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, ParserConfigurationException, SAXException, IOException {
	Factory foctory = (Factory) XMLUtil.getBean();
	Role role = foctory.createRole();
	role.createHero();
}
}
