# Ejercicios Prácticos: Spring Boot y Bases de Datos

Este repositorio presenta dos ejercicios enfocados en aplicar conceptos clave de Spring Boot en conjunción con bases de datos. A continuación, se detallan los dos ejercicios junto con las instrucciones para ejecutarlos.

## Ejercicio 1: Fundamentos de Persistencia

### Descripción
El primer ejercicio se centra en la creación y manipulación de una entidad "Persona" utilizando Spring Boot. A través de este ejercicio, aprenderás los fundamentos de la persistencia de datos en una base de datos.

### Ejecución
Sigue estos pasos para ejecutar el Ejercicio 1:

1. Asegúrate de tener configurada una base de datos compatible con Spring Boot, como MySQL o H2. Si es necesario, modifica la configuración en el archivo `application.properties`.

2. Ejecuta la clase principal `Ejer01Application.java` ubicada en el paquete `com.utn.ejer01`.

3. La aplicación generará automáticamente una tabla para la entidad "Persona" en la base de datos y almacenará los detalles básicos de una persona, como nombre, apellido y edad.

4. Luego, la aplicación recuperará esta información y la mostrará en la consola, permitiéndote comprender cómo se maneja la persistencia de datos.

## Ejercicio 2: Trabajo Avanzado con Datos

### Descripción
El segundo ejercicio es un paso más allá, presentando un nuevo campo, "Domicilio", en la entidad "Persona". Además de los conceptos ya aprendidos, este ejercicio explora cómo trabajar con campos adicionales.

### Ejecución
Sigue estos pasos para ejecutar el Ejercicio 2:

1. Asegúrate de tener configurada una base de datos compatible con Spring Boot, como MySQL o H2. Si es necesario, ajusta la configuración en el archivo `application.properties`.

2. Ejecuta la clase principal `Ejer02Application.java` ubicada en el paquete `com.utn.ejer02`.

3. La aplicación creará automáticamente una tabla para la entidad "Persona" en la base de datos y guardará detalles extendidos, incluyendo "Domicilio", junto con nombre, apellido y edad.

4. Después de almacenar los datos, la aplicación recuperará la información y la presentará en la consola. Podrás observar cómo se gestiona el nuevo campo de "Domicilio".
