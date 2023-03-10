package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Drivers {
	
	
	public static void abrirNavegador (boolean headless) {
	String ambiente =  "https://www.habibs.com.br/";
	
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOptions = new ChromeOptions ();
	if (! headless) {
		chromeOptions.addArguments( "--headless");
	}
	chromeOptions.addArguments("--star-maximized" );
	
	driver = new ChromeDriver(chromeOptions);
	driver.get (ambiente);
	driver.manage().window().maximize();

}
}