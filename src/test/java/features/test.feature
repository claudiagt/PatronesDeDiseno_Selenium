Feature: Categoria Comics

  Como usuario quiero ingresar a la categoria comisc para verificar el numero de chistes cargados

  Scenario: Ingresar a la categoria comics desde la pantalla home
    Given el usuario se encuentra en la pagina home de iamlittletester
    When hace clic sobre el boton de littetestecomisc
    Then se debe redirigir a la pantalla comics
