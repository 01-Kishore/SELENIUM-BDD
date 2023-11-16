package KISHORE.AUTOMATION.helper;

import KISHORE.AUTOMATION.utility.CONSTANT;
import KISHORE.AUTOMATION.utility.PropertyFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class CommonHelper {
    private static Logger log = LogManager.getLogManager().getLogger(CommonHelper.class.getName());
    public static WebDriver driver;
    public CommonHelper(){
        PropertyFileReader propertyFileReader = new PropertyFileReader();
        CONSTANT.BROWSER_TYPE = propertyFileReader.getData("browser");
        CONSTANT.URL =  propertyFileReader.getData("URL");
        CONSTANT.PLATFORM =  propertyFileReader.getData("platform");
        CONSTANT.IMPLICIT_WAIT=  Integer.parseInt(propertyFileReader.getData("implicitWait"));
        CONSTANT.EXPLICIT_WAIT =  Integer.parseInt(propertyFileReader.getData("explicitWait"));
        CONSTANT.DEFAULT_WAIT =  Integer.parseInt(propertyFileReader.getData("defaultWait"));
    }
    public CommonHelper(WebDriver driver){
        CommonHelper.driver = driver;
    }
    public static WebElement getElement(By locator) {
            return driver.findElement(locator);
    }
}
