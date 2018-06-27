package Automação;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExecutarChrome {


    static WebDriver driver;

    public static void main(String[] args) {

        executaChromeDriver();
        acessaPagina(driver);

    }

    public static void executaChromeDriver() {

        System.setProperty("webdriver.chrome.driver", "/home/leonardo/Downloads/meu_robo/chromedriver");

        driver = new ChromeDriver();

    }

     public static  void acessaPagina(WebDriver driver) {

        String url;

        url = "https://reclameaqui.com.br";

        driver.get(url);
    }








        }


