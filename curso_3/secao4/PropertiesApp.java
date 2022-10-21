package secao4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

public class PropertiesApp {
	
	public static void main(String[] args) throws InvalidPropertiesFormatException, FileNotFoundException, IOException {
		Properties sites = new Properties();
		sites.loadFromXML(new FileInputStream("C:\\Users\\Clebson\\eclipse-workspace\\Bootcampjava_curso3\\src\\secao4\\sites.xml"));
		System.out.println(sites.getProperty("2"));
	}

}
