package com.vti.ultis.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class is used for accessing properties file.
 * 
 * @Description: .
 * @author: DangBlack
 * @create_date: May 26, 2020
 * @version: 1.0
 * @modifer: DangBlack
 * @modifer_date: May 26, 2020
 */
public class DatabaseProperties {

	public static final String RESOURCE_FOLDER_URL = "C:\\Users\\black\\Desktop\\Java Class\\Java\\Answer\\TestingSystem_Assignment_11\\TestingSystem_Assignment_11_Exercise_1\\src\\main\\java\\com\\vti\\ultis\\properties\\";

	private Properties properties;

	public DatabaseProperties() throws FileNotFoundException, IOException {
		properties = new Properties();
		properties.load(new FileInputStream(RESOURCE_FOLDER_URL + "ConfigsDatabase.properties"));
	}

	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}