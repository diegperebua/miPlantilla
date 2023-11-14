package pages;



public class WebPageToTest extends BasePage {

    public WebPageToTest() {super(driver);}


    public void inavigatetotheweb(){
        navigateTo("https://www.webpage.com");
    }
}
