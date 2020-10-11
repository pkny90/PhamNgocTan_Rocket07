package mvndemo.src.main.java.utils.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DatabaseProperties {
	public static final String RESOURCE_URL = "C:\\Users\\black\\Desktop\\Java Class\\Java\\Practice and Assignment\\JavaCore\\src\\mvndemo\\src\\main\\java\\utils\\properties\\" ;
	private Properties properties;
	
	public DatabaseProperties() throws FileNotFoundException, IOException
	{
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_URL + "ConfigsDatabase.properties"));
	}
	
	public String getProperty(String key)
	{
		return properties.getProperty(key);
	}
}
