package prop;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigTest {

	public static void main(String[] args) throws IOException {
		String propFile = "src/main/java/config.properties";
		Properties prop = new Properties();
		
		//property file stream에 담기
		FileInputStream fis = new FileInputStream(propFile);
		
		//property file 로딩
		prop.load(new BufferedInputStream(fis));

		//항목을 읽어서 console에 출력
		System.out.println(prop.getProperty("db_ip"));
		System.out.println(prop.getProperty("db_port"));
		System.out.println(prop.getProperty("test"));
	}

}
