package config;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import test.TestNgDummy;

public class PropertiesFile {
	static Properties prop=new Properties();
	static String projectpath=System.getProperty("user.dir");
	
	
		
	public static void getproperties(){
		try{


			InputStream input= new FileInputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			prop.load(input);
			String browser=prop.getProperty("browser");
			System.out.println(browser);
			TestNgDummy.browserName=browser;
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void setproperties(){
		try{
			OutputStream output=new FileOutputStream(projectpath+"\\src\\test\\java\\config\\config.properties");
			prop.setProperty("browser", "firefox");
			prop.store(output, null);
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		getproperties();
		setproperties();
		getproperties();
	}}