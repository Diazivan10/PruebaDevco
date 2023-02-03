#Author: idiaz
Feature: Primera Prueba

	@Tag-1
 	Scenario: Digitar palabra texto enriquecido con negrilla
 		Given abre el navegador
 		When Selecciona la opcion texto enriquecido 
 		When Selecciona la opcion negrilla y digita una palabra "PRUEBA"

 		
 		
 @Tag-2
 Scenario: Eliminar un articulo de una lista
 	 		Given abre el navegador
 	 		When Selecciona la opcion lista de tareas
 	 		When Digita la primera letra "HOLA" y lo agrega 
 	 		When Digita la segunda letra "HOLA" y lo agrega 
 	 		When Digita la tercera letra "HOLA" y lo agrega 
 	 		When Digita la cuarta letra "HOLA" y lo agrega 
 	 		When Digita la quinta letra "HOLA" y lo agrega 
 	 		
 	