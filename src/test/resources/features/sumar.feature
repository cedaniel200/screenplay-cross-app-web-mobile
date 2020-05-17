# encoding: utf-8

Feature: Sumar
  Yo como usuario quiero poder sumer dos numeros para concoer su resultado

  Scenario: Suma de dos números aleatoreos
  Suma de dos números aleatoreos obteniedos de una página web usando la calculadora de un dispositivo móvil
    Given Cesar obtiene dos numeros aleatoreos
    When Cesar suma dos numeros
    Then Cesar deberia ver que su resultado es correcto