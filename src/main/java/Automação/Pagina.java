package Automação;

import org.openqa.selenium.WebDriver;

public class Pagina {

    public static  void acessaPagina(WebDriver driver) {

        String url;

        url = "https://www.reclameaqui.com.br";

        driver.get(url);
    }
}
