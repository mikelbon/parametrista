Feature: Pruebas de Integracion App Parametrista - Web Bodeguero

  # App Parametrista
  @wipx
  Scenario: Ingreso de parametros desde App Parametrista
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo10@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza la lista de piscinas
    When Parametrista selecciona la piscina "Piscina PRE1"
    And Parametrista selecciona parametro "Oxígeno Mañana" y valor "0.1"
    And Parametrista selecciona parametro "Temperatura Mañana" y valor "18.0"
    And Parametrista selecciona parametro "Oxígeno Tarde" y valor "15.9"
    And Parametrista selecciona parametro "Temperatura Tarde" y valor "20.1"
    And Parametrista selecciona parametro "Oxígeno Noche" y valor ".2"
    And Parametrista selecciona parametro "Temperatura Noche" y valor "32"
    And Parametrista selecciona parametro "Salinidad" y valor "40.0"
    And Parametrista selecciona parametro "Transparencia" y valor "100"
    And Parametrista selecciona parametro "PH" y valor "11.9"
    And Parametrista selecciona parametro "Alcalinidad" y valor "300"
    And Parametrista visualiza todos los parametros ingresados
    And Parametrista retrocede al formulario anterior para sincronizar
    When Parametrista selecciona la piscina "Piscina PRE1"
    Then Parametrista visualiza que los parametros ingresados anteriormente han sincronizado

    # Web Bodeguero
    When Bodeguero ingresa a la web con correo "demo7@gmail.com" y clave "123456"
    Then Bodeguero visualiza la vista por Fecha
    When Bodeguero selecciona la piscina "Piscina PRE1"
    Then Bodeguero deberia visualizar los mismos datos ingresados desde el App en la tabla de Parametros para el dia de hoy
