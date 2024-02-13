package com.despegar.pages;

import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;


public class PaginaPrincipal extends PageObject {
    public void despegarCom () {
        getDriver().get("https://www.despegar.com.co");
    }

    public void realizarBusqueda () {
        String Permiso = "//div[@class='login-incentive--button login-incentive--button-close shifu-3-btn-ghost']";
        getDriver().findElement(By.xpath(Permiso)).click();
        String categoria = "(//div[@class='button-circle-icon'])[3]";
        getDriver().findElement(By.xpath(categoria)).click();
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,300)","");
        String destino = "//input[@placeholder='Ingresa hacia dónde viajas']";
        getDriver().findElement(By.xpath(destino)).click();
        getDriver().findElement(By.xpath(destino)).sendKeys("Santa Marta");
        String noOfert = "//p[@class='eva-3-link tooltip-web-push--not-now']";
        getDriver().findElement(By.xpath(noOfert)).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        getDriver().findElement(By.xpath(destino)).sendKeys("Santa Marta, Magdalena, Colombia");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }
        js.executeScript("window.scrollBy(0,300)","");
        String fechaIda = "//input[@placeholder='Ida']";
        getDriver().findElement(By.xpath(fechaIda)).click();
        String ElegirIda = "(//div[@class='sbox5-monthgrid-datenumber-number'])[2]";
        getDriver().findElement(By.xpath(ElegirIda)).click();
        String ElegirVuelta = "(//div[@class='sbox5-monthgrid-datenumber-number'])[12]";
        getDriver().findElement(By.xpath(ElegirVuelta)).click();
        String AplicaFechas = "(//em[contains(text(),'Aplicar')])[1]";
        getDriver().findElement(By.xpath(AplicaFechas)).click();
        String Buscar = "(//button/em[@class='btn-text'])[4]";
        getDriver().findElement(By.xpath(Buscar)).click();
    }




}
