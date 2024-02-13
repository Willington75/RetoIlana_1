package com.despegar.stepDefinitions;


import com.despegar.pages.PaginaPrincipal;
import io.cucumber.java.es.*;



public class CompraStepDefinition {
    @Dado("que el usuario ingresa a la URL despegar.com")
    public void ingresarAlaPagina () {
        new PaginaPrincipal().despegarCom();
    }

    @Cuando("Realiza busqueda del paquete")
    public void eligeElPaquete () {
        new PaginaPrincipal().realizarBusqueda();
    }


}
