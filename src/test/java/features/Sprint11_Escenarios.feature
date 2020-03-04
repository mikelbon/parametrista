Feature: Pruebas de Integracion App Parametrista - Sprint 11

# 1. Flujo integral (Ruta critica) QA
  @wipx
  Scenario: Ingreso de Parametros de Piscina con Configuracion 1
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo18@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza la lista de fincas
    When Parametrista selecciona la finca "Camanmor"
    Then Parametrista visualiza la lista de piscinas
    When Parametrista selecciona la piscina "Piscina PRE02"
    And Parametrista selecciona parametro "Oxígeno Mañana" y valor "0.1"
    And Parametrista selecciona parametro "Temperatura Mañana" y valor "18.0"
    And Parametrista selecciona parametro "Oxígeno Tarde" y valor "15.9"
    And Parametrista selecciona parametro "Temperatura Tarde" y valor "20.1"
    And Parametrista selecciona parametro "Oxígeno Noche" y valor ".2"
    And Parametrista selecciona parametro "Temperatura Noche" y valor "32"
    And Parametrista selecciona parametro "Salinidad" y valor "40"
    And Parametrista selecciona parametro "Nivel de agua" y valor "59"
    And Parametrista selecciona parametro "Transparencia" y valor "100"
    And Parametrista selecciona parametro "PH" y valor "11.9"
    And Parametrista selecciona parametro "Alcalinidad" y valor "300"
    And Parametrista visualiza todos los parametros ingresados
    And Parametrista retrocede al formulario anterior para sincronizar
    When Parametrista selecciona la piscina "Piscina PRE02"
    Then Parametrista visualiza que los parametros ingresados anteriormente han sincronizado

  @wipx
  Scenario: Ingreso y Visualizacion de Parametros de Piscina con Configuracion 2
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo2@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza las listas de Piscinas y Reservorios
    When Parametrista selecciona la pestana de Piscinas
    When Parametrista selecciona la piscina "Piscina Sin Agua"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Oxígeno"
    And Parametrista selecciona boton Agregar "Oxígeno"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Temperatura"
    And Parametrista selecciona boton Agregar "Temperatura"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Nivel de agua"
    And Parametrista selecciona boton Agregar "Nivel de agua"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Salinidad"
    And Parametrista selecciona boton Agregar "Salinidad"
    And Parametrista visualiza la lista de valores ingresados para el parametro "PH"
    And Parametrista selecciona boton Agregar "PH"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Transparencia"
    And Parametrista selecciona boton Agregar "Transparencia"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Alcalinidad"
    And Parametrista selecciona boton Agregar "Alcalinidad"
    And Parametrista retrocede al formulario anterior para sincronizar
    When Parametrista selecciona la piscina "Piscina Sin Agua"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Oxígeno"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Temperatura"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Nivel de agua"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Salinidad"
    And Parametrista visualiza la lista de valores ingresados para el parametro "PH"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Transparencia"
    And Parametrista visualiza la lista de valores ingresados para el parametro "Alcalinidad"

  @wipx
  Scenario: Escenario Ruta Critica de Ingreso de Parametros de Piscina con Configuracion 2
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo2@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza las listas de Piscinas y Reservorios
    When Parametrista selecciona la pestana de Piscinas
    When Parametrista selecciona la piscina "Piscina Sin Agua"

    And Parametrista selecciona parametro "Oxígeno Mañana" y valor "0.1"
    And Parametrista selecciona parametro "Temperatura Mañana" y valor "18.0"
    And Parametrista selecciona parametro "Oxígeno Tarde" y valor "15.9"
    And Parametrista selecciona parametro "Temperatura Tarde" y valor "20.1"
    And Parametrista selecciona parametro "Oxígeno Noche" y valor ".2"
    And Parametrista selecciona parametro "Temperatura Noche" y valor "32"
    And Parametrista selecciona parametro "Nivel de agua" y valor "59"
    And Parametrista selecciona parametro "Salinidad" y valor "40"
    And Parametrista selecciona parametro "Transparencia" y valor "100"
    And Parametrista selecciona parametro "PH" y valor "11.9"
    And Parametrista selecciona parametro "Alcalinidad" y valor "300"
    And Parametrista visualiza todos los parametros ingresados
    And Parametrista retrocede al formulario anterior para sincronizar
    When Parametrista selecciona la piscina "Piscina 4B"
    Then Parametrista visualiza que los parametros ingresados anteriormente han sincronizado
#  @wip
#  Scenario: Escenario Ruta Critica de Ingreso de Parametros de Reservorio
#    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
#    Then Parametrista ingresa su correo "demo9@gmail.com"
#    When Parametrista selecciona campo Contraseña
#    Then Parametrista ingresa su clave "123456"
#    And Parametrista selecciona botón Ingresar
#    Then Parametrista visualiza la lista de fincas
#    When Parametrista selecciona la finca "GOLDENSHRIMP"
#    Then Parametrista visualiza las listas de Piscinas y Reservorios
#    When Parametrista selecciona la pestana de Reservorios
#    Then Parametrista visualiza la lista de reservorios de la finca
#    When Parametrista selecciona el reservorio "Reservorio RESERVORIO-05"
#    And Parametrista visualiza los parametros a ingresar en el reservorio
#    And Parametrista selecciona parametro "Oxígeno Mañana" y valor "0.1"
#    And Parametrista selecciona parametro "Temperatura Mañana" y valor "18.0"
#    And Parametrista selecciona parametro "Oxígeno Tarde" y valor "15.9"
#    And Parametrista selecciona parametro "Temperatura Tarde" y valor "20.1"
#    And Parametrista selecciona parametro "Oxígeno Noche" y valor ".2"
#    And Parametrista selecciona parametro "Temperatura Noche" y valor "32"
#    And Parametrista selecciona parametro "Nivel de agua" y valor "59"
#    And Parametrista selecciona parametro "Salinidad" y valor "40"
#    And Parametrista selecciona parametro "Transparencia" y valor "100"
#    And Parametrista selecciona parametro "PH" y valor "11.9"
#    And Parametrista selecciona parametro "Alcalinidad" y valor "300"
#    And Parametrista visualiza todos los parametros ingresados
#    And Parametrista retrocede al formulario anterior para sincronizar
#    When Parametrista selecciona el reservorio "Reservorio RESERVORIO-05"
#    Then Parametrista visualiza que los parametros ingresados anteriormente han sincronizado
#
#    # Web Bodeguero
#    When Bodeguero ingresa a la web con correo "demo6@gmail.com" y clave "123455"
#    Then Bodeguero visualiza la vista por Fecha
#    When Bodeguero selecciona la piscina "Piscina 4"
#    Then Bodeguero deberia visualizar los mismos datos ingresados desde el App en la tabla de Parametros para el dia de hoy