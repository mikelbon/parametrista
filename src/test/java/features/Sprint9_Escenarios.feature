Feature: Pruebas de Integracion App Parametrista - Sprint 9

  # 1. Login e identificacion de Roles
  @wipx
  Scenario: Login de Usuario Multifinca
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo9@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza la lista de fincas

  @wipx
  Scenario: Login de Usuario UniFinca
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo10@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza la lista de piscinas

  @wipx
  Scenario: Login de Usuario Jefe Tecnico
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo17@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza el Home de bienvenida

    # Login incorrectos
   # No ingresa email
  @wipx
  Scenario: Login Parametrista no ingresa email
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo ""
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza mensaje Por favor, ingrese un usuario

    # Ingresa email invalido
  @wipx
  Scenario: Login Parametrista ingresa email invalido
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo10"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza mensaje Escriba un correo válido

  # Ingresa password incorrecto
  @wipx
  Scenario: Login Parametrista no ingresa password
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo10@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123451"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza mensaje Los datos ingresados no son correctos

# 2. Ingreso de Parametros (Validación de Rangos)
  @wipx
  Scenario: Validacion de Rangos
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo9@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza la lista de fincas
    When Parametrista selecciona la finca "AQUALINTER"
    Then Parametrista visualiza la lista de piscinas
    When Parametrista selecciona la piscina "Piscina 5A"
    And Parametrista selecciona parametro "Oxígeno Mañana" y valor "11"
    And Parametrista selecciona parametro "Temperatura Mañana" y valor "17"
    And Parametrista selecciona parametro "Oxígeno Tarde" y valor "17"
    And Parametrista selecciona parametro "Temperatura Tarde" y valor "19"
    And Parametrista selecciona parametro "Oxígeno Noche" y valor "11"
    And Parametrista selecciona parametro "Temperatura Noche" y valor "17"
    And Parametrista selecciona parametro "Salinidad" y valor "41"
    And Parametrista selecciona parametro "Transparencia" y valor "4"
    And Parametrista selecciona parametro "PH" y valor "2"
    And Parametrista selecciona parametro "Alcalinidad" y valor "59"

    # 3. Flujo integral (Ruta critica)
  @wip
  Scenario: Escenario Ruta Critica
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo2@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    #Then Parametrista visualiza la lista de fincas
    #When Parametrista selecciona la finca "PREDIOS BONAFIDE S.A."
    Then Parametrista visualiza la lista de piscinas
    When Parametrista selecciona la piscina "Piscina 1B"
    And Parametrista selecciona parametro "Oxígeno Mañana" y valor "0.1"
    And Parametrista selecciona parametro "Temperatura Mañana" y valor "18.0"
    And Parametrista selecciona parametro "Oxígeno Tarde" y valor "15.9"
    And Parametrista selecciona parametro "Temperatura Tarde" y valor "20.1"
    And Parametrista selecciona parametro "Oxígeno Noche" y valor ".2"
    And Parametrista selecciona parametro "Temperatura Noche" y valor "32"
    And Parametrista selecciona parametro "Salinidad" y valor "41"
    And Parametrista selecciona parametro "Salinidad" y valor "40"
    And Parametrista selecciona parametro "Transparencia" y valor "100"
    And Parametrista selecciona parametro "PH" y valor "11.9"
    And Parametrista selecciona parametro "Alcalinidad" y valor "300"
    And Parametrista visualiza todos los parametros ingresados
    And Parametrista retrocede al formulario anterior para sincronizar
    When Parametrista selecciona la piscina "Piscina 1B"
    Then Parametrista visualiza que los parametros ingresados anteriormente han sincronizado

    # Web Bodeguero
    #When Bodeguero ingresa a la web con correo "demo6@gmail.com" y clave "123455"
    #Then Bodeguero visualiza la vista por Fecha
    #When Bodeguero selecciona la piscina "Piscina 4"
    #Then Bodeguero deberia visualizar los mismos datos ingresados desde el App en la tabla de Parametros para el dia de hoy



