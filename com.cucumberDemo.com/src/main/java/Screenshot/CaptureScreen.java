package Screenshot;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Browser.Browser;

public class CaptureScreen extends Browser {
	public static void ScreenShot(int i) throws Exception {
	try {
		TakesScreenshot scrShot =((TakesScreenshot)driver); 
		
		File Src=scrShot.getScreenshotAs(OutputType.FILE);
		
		String filePath = System.getProperty("user.dir")+"//target//Screenshot//Screenshot"+i+".png";
		File Dest=new File(filePath);
		FileUtils.copyFile(Src, Dest);
	}catch (Exception e)
	{
		System.out.println("Screen Captured");
	}

}
	

}
