#language:es

Característica: Realizar una compra exitosa en la pagina despegar.com de paquetes de viajes

  @Despegar
  Escenario: Compra exitosa de pasajes y alojamiento
    Dado que el usuario ingresa a la URL despegar.com
    Cuando  Realiza busqueda del paquete
    Y selecciona ciudad origen y destino, fechas ida y regreso, numero habitaciones y personas.
    Y confirmacion ciudad destino ida
    Y seleccion el paquete
    Y confirmo alojamiento
    Y confirmo vuelos

    Entonces puede visualizar la confirmacion de la compra