package Browser;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Browser {
	public static WebDriver driver;
	public static Actions act;
	public static ExtentReports extent = new ExtentReports();
	public static ExtentHtmlReporter reporter =  new ExtentHtmlReporter(System.getProperty("user.dir")+"//target//Reports//ExtentReport1.html");
	
	public static String fileProperties(String propertiesData)//browser
	{
		String returnData = null;
		try {
			String filelocation = System.getProperty("user.dir") + "//src//main//resources//ApplicationConfiguration//Configuration.properties";
			File file = new File(filelocation);
			FileInputStream fileinput = new FileInputStream(file);
			Properties prop = new Properties();
			prop.load(fileinput);
			returnData = prop.getProperty(propertiesData); //browser
			}catch(Exception e)
			{
			System.out.println("Properties" + e);
			}
		return returnData;
	}
	
	public static WebDriver setDriver() {
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Open Test");
		logger.log(Status.INFO, "Opening the Browser");
		try {
			String browserChoice = Browser.fileProperties("browser");
			if (browserChoice.equals("chrome")) {
				driver = setChromeDriver();
			} else if (browserChoice.equals("firefox")) {
				driver = setFirefoxDriver();
			} else if (browserChoice == "Edge") {
				driver = setEdgeDriver();
			} else 
			{ 
				System.out.println("Invalid data...");
			}	
			logger.log(Status.PASS, "Brower Opening Passed");
			act = new Actions(driver);
		}catch (Exception e)
		{
			System.out.println("Browser Input " + e);
			logger.log(Status.FAIL, "Browser Opening Failed");
		}
		extent.flush();
		return driver;
	}
	
	public static WebDriver setChromeDriver() {
		try {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}catch(Exception e)
		{
			System.out.println("Chrome");
			System.out.println(e);
		}
		return driver;
	}
	public static WebDriver setFirefoxDriver() {
		try {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}catch(Exception e)
		{
			System.out.println("Firefox");
			System.out.println(e);
		}
		return driver;
	}
	public static WebDriver setEdgeDriver() {
		try {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}catch(Exception e)
		{
		System.out.println("Edge");
		System.out.println(e);
		}
		return driver;
	}

	public static void getUrl(String url) throws Exception {
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("URL Test");
		logger.log(Status.INFO, "Opening the Application");
		try {
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			logger.log(Status.PASS, "Application Opening Passed");
		}catch(Exception e)
		{
			System.out.println("URL Method");
			logger.log(Status.FAIL, "Application Loading Failed");
		}
		extent.flush();
	}
	
	public static void closeBrowser() {
		extent.attachReporter(reporter);
		ExtentTest logger = extent.createTest("Close Test");
		logger.log(Status.INFO, "Closing Browser Passed");
		try {
			driver.quit();
			logger.log(Status.PASS, "Closing Brower Passed");
		}catch(Exception e)
		{
			System.out.println("closing");
			logger.log(Status.FAIL, "Browser Closing Failed");
		}
		extent.flush();
	}		
	
}