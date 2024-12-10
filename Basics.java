package Learning;


import java.net.URL;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Basics {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		UiAutomator2Options options = new UiAutomator2Options();
				options.setPlatformName("android");
		options.setCapability("appium:automationName", "uiautomator2");
		options.setCapability("appium:deviceName", "udid");
		options.setCapability("appium:udid", "a6fuugukwcwseekv");
		options.setCapability("appium:platformVersion", "13 TP1A.220624.014");
		options.setCapability("appium:appPackage", "com.miui.calculator");
		options.setCapability("appium:appActivity", "com.miui.calculator.cal.CalculatorActivity");
		
		AndroidDriver driver = new AndroidDriver(
			    // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
			    new URL("http://127.0.0.1:4723"), options);


	}

}
