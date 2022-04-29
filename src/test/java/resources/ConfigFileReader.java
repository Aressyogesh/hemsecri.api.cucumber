package resources;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader   {

	
	public String getReportConfigPath() throws FileNotFoundException, IOException
	{	
		Properties objConfig = new Properties();
		objConfig.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/java/resources/global.properties"));
		String reportConfigurationPath = objConfig.getProperty("reportConfigPath");
		if(reportConfigurationPath!= null) return reportConfigurationPath;
		else throw new RuntimeException("Report Configuration Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}
}
