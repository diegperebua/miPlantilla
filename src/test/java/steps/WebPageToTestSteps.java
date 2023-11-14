package steps;


import org.junit.Assert;

import io.cucumber.java.en.*;
import pages.WebPageToTest;

public class WebPageToTestSteps {



    WebPageToTest webPageToTest = new WebPageToTest();

    @Given("I navigate to the web")
    public void iNavigateToTheWeb() {webPageToTest.inavigatetotheweb();
    }

}
