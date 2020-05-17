# Screenplay using SerenityBDD -- Cross App (Web - Mobile)

# [Español]
Proyecto de automatización con SerenityBDD, screenplay y cucumber. Este proyecto muestra de forma sencilla como podemos
realizar una prueba en la cual debemos alternar entre una aplicación Web y una aplicación móvil.

## Detalles generales de la implementación

Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de páginas (userinterface).
La estructura completa del proyecto es la siguiente:

````
+ exceptions
    Clases que controlan las posibles excepciones técnicas y de negocios que se presentan durante la ejecución de pruebas
+ model
    Clases relacionadas con el modelo de dominio y sus respectivos builder cuando es necesario
+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio
+ interactions
    Clases que representan las interacciones directas con la interfaz de usuario
+ userinterface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario
+ questions
    Objetos usados para consultar acerca del estado de la aplicación
+ util
    Clases de utilidad
+ runners
    Clases que permiten correr los tests
+ step definitions
    Clases que mapean las líneas Gherkin a código java
+ features
    La representación de las historias en archivos cucumber
````

## Requerimientos

Para correr el proyecto se necesita Java JDK 1.8 y Gradle preferiblemente con la versión 5.2.1

## Para correr el proyecto

Use el siguiente comando

    gradle clean test aggregate

 ## Si tiene alguna pregunta, puede escribirme a cdanielmg200@gmail.com


# [English]

Automation project with serenity BDD, screenplay and cucumber. This project shows in a simple way how we can carry out a 
test in which we must alternate between a Web application and a mobile application.

## General details of the implementation

The tests use tasks, interactions, questions, elements of pages (userinterface).
The complete structure of the project is the following:

````
+ exceptions
     Classes that control the possible technical and business exceptions that arise during the execution of tests
+ model
     Classes related to the domain model and their respective builders when necessary
+ tasks
     Classes that represent tasks performed by the actor at the business process level
+ interactions
     Classes that represent direct interactions with the user interface
+ userinterface
     Page Objects and Page Elements. Map the objects of the user interface
+ questions
     Objects used to check the status of the application
+ util
     Utility classes
+ runners
     Classes that allow to run the tests
+ step definitions
     Classes that map the Gherkin lines to java code
+ features
     The representation of the stories in cucumber archives
````
## Requirements

To run the project you need Java JDK 1.8 and Gradle preferably with version 5.2.1

## To run the project

Use the following command
    
    gradle clean test aggregate

## If you have any questions you can write me at cdanielmg200@gmail.com
