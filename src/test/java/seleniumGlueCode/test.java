package seleniumGlueCode;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    private ChromeDriver driver = Hooks.getDriver();

    @Given("^el usuario se encuentra en la pagina home de iamlittletester$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_iamlittletester() throws Throwable {
        String titleHomePage ="imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
        Assert.assertEquals(titleHomePage,driver.getTitle());



    }

    @When("^hace clic sobre el boton de littetestecomisc$")
    public void hace_clic_sobre_el_boton_de_littetestecomisc() throws Throwable {
        WebElement titleComicsLocator = driver.findElement(By.id("menu-item-2008"));
        titleComicsLocator.click();

    }

    @Then("^se debe redirigir a la pantalla comics$")
    public void se_debe_redirigir_a_la_pantalla_comics() throws Throwable {
      WebElement pageTitleLocator = driver.findElement(By.className("page-title"));
        Assert.assertTrue("No se redirecciono correctamente", pageTitleLocator.isDisplayed());
        Assert.assertEquals("Category: comics", pageTitleLocator.getText());


    }

}
