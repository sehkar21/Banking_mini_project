package com.banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Readconfig {

	Properties pro;
	
	public Readconfig()
	{
	
		File src = new File("S:\\New folder\\projectworkplace\\Banking_mini_project\\configurations\\config.properties");
		
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} 
		catch(Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
	}
	
		public String getApplicationURL() 
		{
			String url = pro.getProperty("baseurl");
			return url;
			
		}
		
		public String GetUsername()
		{
		
			String username = pro.getProperty("username");
			return username;
		
		}
		
		public String GetPassword()
		{
		
		String Password = pro.getProperty("password");
		return Password;
		
		}
		
		public String getChromePath() 
		{
			String chromepath = pro.getProperty("chromepath");
			return chromepath;
		
		}
		
		public String getFirefoxpath()
		{
			String firefoxpath = pro.getProperty("Firefoxpath");
			return firefoxpath;
		}
		
		public String getIEpath()
		{
			String IEpath = pro.getProperty("IEpath");
			return IEpath;
			
			
		}
	}
	
