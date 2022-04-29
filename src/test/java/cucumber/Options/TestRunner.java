package cucumber.Options;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import static io.cucumber.listener.Reporter;

import resources.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/features",
				plugin="json:target/jsonReports/cucumber-report.json",
				glue= {"stepDefination"},
				dryRun = false,
				monochrome = true,
				tags = "@withoutParameter"
				)

public class TestRunner {
	
	@AfterClass
	 public static void writeExtentReport() throws FileNotFoundException, IOException 
	{
		
		 
	 }
}
