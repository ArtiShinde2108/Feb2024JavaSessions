package propertiesconcelp;

import java.util.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadProp {
	
	public final static String CONFIG_FILE_PATH = "./src/propertiesconcelp/config.properties";
	static Properties prop;

	public static void main(String[] args) {
		
		try {
			FileInputStream fp = new FileInputStream(CONFIG_FILE_PATH);
			prop = new Properties();
			try {
				prop.load(fp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {	
			e.printStackTrace();
		}
		
		String br = prop.getProperty("browser");
		System.out.println(br);
		
		String appurl = prop.getProperty("url");
		System.out.println(appurl);
		
		prop.setProperty("browser", "Firefox");
		br = prop.getProperty("browser");
		System.out.println(br);
		System.out.println(prop.size());

	}

}
