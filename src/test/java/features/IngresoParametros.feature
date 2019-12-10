Feature: Ingreso de parametros

  Scenario Outline: Ingreso de parametros
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo10@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza la lista de piscinas
    When Parametrista selecciona la piscina "Piscina 1"
    And Parametrista selecciona parametro "<parametro>" y valor "<valor>"

    Examples:
      | parametro          | valor |
      | Oxígeno Mañana     | 29    |
      | Temperatura Mañana | 29    |
      | Oxígeno Tarde      | 29    |
      | Temperatura Tarde  | 29    |
      | Oxígeno Noche      | 29    |
      | Temperatura Noche  | 29    |
      | Salinidad          | 29    |
      | Transparencia      | 29    |
      | PH                 | 29    |
      | Alcalinidad        | 29    |
#


 #   And Parametrista ingresa el valor 29
#    And Parametrista ingresa el valor 9
#    And Paramaetrista presiona boton Ingresar
#    And Parametrista selecciona boton volver a parametros