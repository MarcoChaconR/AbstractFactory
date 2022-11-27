# Abstract Factory
Es un patrón de diseño creacional que nos permite producir familias de objetos relacionados sin especificar sus clases.

El patrón de Abstract Factory proporciona una forma de encapsular un grupo de fábricas individuales que tienen un tema común sin especificar sus clases concretas. 
En el uso normal, el software del cliente crea una implementación concreta de abstract Factory y luego usa la interfaz genérica de la fábrica para crear los objetos concretos que forman parte del tema. 
El cliente no sabe (ni le importa) qué objetos concretos obtiene de cada una de estas fábricas internas, ya que utiliza únicamente las interfaces genéricas de sus productos. 
Este patrón separa los detalles de implementación de un conjunto de objetos de su uso general y se basa en la composición de objetos, ya que la creación de objetos se implementa en métodos expuestos en la interfaz de fábrica.
