Feature: Pruebas Funcionales Jefe Tecnico - Sprint 12

  # 1. Flujo integral Muestreo del Jefe Tecnico para piscina sin ningun muestreo previo
  @wip
  Scenario: Login de Usuario Jefe Tecnico
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo18@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza el Home de bienvenida
    When JefeTecnico selecciona la opcion Muestreo
    Then JefeTecnico visualiza el listado de fincas
    When JefeTecnico selecciona la finca "Langostino"
    Then JefeTecnico visualiza la lista de piscinas
    When JefeTecnico selecciona la primera piscina que indique No se ha realizado ningun muestreo
    Then JefeTecnico visualiza la pantalla de muestreo biometrico
    When JefeTecnico presiona el boton Agregar Muestreo Biometrico
    Then JefeTecnico visualiza el formulario de nuevo muestreo biometrico

    When JefeTecnico presiona boton Agregar Muestra
    Then JefeTecnico visualiza la calculadora
    When JefeTecnico ingresa el valor "30" para el "PesoTotal"
    And JefeTecnico ingresa el valor "2" para el "CantidadDeCamarones"
    Then JefeTecnico visualiza una tarjeta con los datos agregados
    When JefeTecnico presiona el boton Ingresar Evento Patologico
    Then JefeTecnico visualiza el listado de Eventos Patologicos
    When JefeTecnico selecciona el evento "Camaron Picado"
    Then JefeTecnico visualiza el evento agregado "Camaron Picado"

    When JefeTecnico presiona boton Agregar Muestra
    Then JefeTecnico visualiza la calculadora
    When JefeTecnico ingresa el valor "500" para el "PesoTotal"
    And JefeTecnico ingresa el valor "20" para el "CantidadDeCamarones"
    Then JefeTecnico visualiza una tarjeta con los datos agregados
    When JefeTecnico presiona el boton Ingresar Evento Patologico
    Then JefeTecnico visualiza el listado de Eventos Patologicos
    When JefeTecnico selecciona el evento "Branquias sucias"
    Then JefeTecnico visualiza el evento agregado "Branquias sucias"

    When JefeTecnico presiona boton Agregar Muestra
    Then JefeTecnico visualiza la calculadora
    When JefeTecnico ingresa el valor "700" para el "PesoTotal"
    And JefeTecnico ingresa el valor "26" para el "CantidadDeCamarones"
    Then JefeTecnico visualiza una tarjeta con los datos agregados
    When JefeTecnico presiona el boton Ingresar Evento Patologico
    Then JefeTecnico visualiza el listado de Eventos Patologicos
    When JefeTecnico selecciona el evento "Muertos Rojos"
    Then JefeTecnico visualiza el evento agregado "Muertos Rojos"

    When JefeTecnico presiona el boton Finalizar muestreo
    Then JefeTecnico visualiza la pantalla de muestreo biometrico con el ultimo muestreo agregado
    When JefeTecnico regresa al listado de piscinas

# 1. Flujo integral Muestreo del Jefe Tecnico para piscina con muestreos anteriores
  @wipx
  Scenario: Login de Usuario Jefe Tecnico
    Given Parametrista ingresa a formulario Login y selecciona campo Usuario
    Then Parametrista ingresa su correo "demo18@gmail.com"
    When Parametrista selecciona campo Contraseña
    Then Parametrista ingresa su clave "123456"
    And Parametrista selecciona botón Ingresar
    Then Parametrista visualiza el Home de bienvenida
    When JefeTecnico selecciona la opcion Muestreo
    Then JefeTecnico visualiza el listado de fincas
    When JefeTecnico selecciona la finca "Langostino"
    Then JefeTecnico visualiza la lista de piscinas
    When JefeTecnico selecciona la piscina "10"
    Then JefeTecnico visualiza la pantalla de muestreo biometrico
    When JefeTecnico presiona el boton Agregar Muestreo Biometrico
    Then JefeTecnico visualiza el formulario de nuevo muestreo biometrico
    When JefeTecnico presiona boton Agregar Muestra
    Then JefeTecnico visualiza la calculadora
    When JefeTecnico ingresa el valor "30" para el "PesoTotal"
    And JefeTecnico ingresa el valor "58" para el "CantidadDeCamarones"
    Then JefeTecnico visualiza una tarjeta con los datos agregados
    When JefeTecnico presiona el boton Ingresar Evento Patologico
    Then JefeTecnico visualiza el listado de Eventos Patologicos
    When JefeTecnico selecciona el evento "Camaron Picado"
    Then JefeTecnico visualiza el evento agregado "Camaron Picado"
    When JefeTecnico presiona el boton Finalizar muestreo
    Then JefeTecnico visualiza la pantalla de muestreo biometrico con el ultimo muestreo agregado


