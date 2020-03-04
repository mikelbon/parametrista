Feature: Pruebas de Integracion App Parametrista - Sprint 10

    # 3. Flujo integral (Ruta critica)
  @wipx
  Scenario: Escenario Ruta Critica de Ingreso de Parametros de Reservorio
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo9@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza la lista de fincas
    When Parametrista selecciona la finca "CAMMAMOR"
    Then Parametrista visualiza las listas de Piscinas y Reservorios
    When Parametrista selecciona la pestana de Reservorios
    Then Parametrista visualiza la lista de reservorios de la finca
    When Parametrista selecciona el reservorio "Reservorio RESERVORIO-01"
    And Parametrista visualiza los parametros a ingresar en el reservorio
    And Parametrista selecciona parametro "Oxígeno mañana" y valor "0.1"
    And Parametrista selecciona parametro "Temperatura mañana" y valor "18.0"
    And Parametrista selecciona parametro "Oxígeno tarde" y valor "15.9"
    And Parametrista selecciona parametro "Temperatura tarde" y valor "20.1"
    And Parametrista selecciona parametro "Oxígeno noche" y valor ".2"
    And Parametrista selecciona parametro "Temperatura noche" y valor "32"
    And Parametrista selecciona parametro "Salinidad" y valor "40"
    And Parametrista selecciona parametro "Transparencia" y valor "100"
    And Parametrista selecciona parametro "PH" y valor "11.9"
    And Parametrista selecciona parametro "Alcalinidad" y valor "300"
    #And Parametrista selecciona parametro "Nivel de agua" y valor "59"
    And Parametrista visualiza todos los parametros ingresados
    And Parametrista retrocede al formulario anterior para sincronizar
    When Parametrista selecciona el reservorio "Reservorio RESERVORIO-01"
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



