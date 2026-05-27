# Sistema de Gestión de Personal para Clínica Privada

Este proyecto es un CRUD con 9 funcionalidades, entre ellas está ell registro, control y cálculo de pagos del personal médico y administrativo de la Clínica Salud Total.


==== Conceptos Aplicados ====

HERENCIA
Las clases "medico" y "administrativo" son clases hijas de la clase abstracta Empleaod, heredaatributos generales (cédula, nombre, edad, teléfono, correo)

ENCAPSULAMIENTO
Todos los atributos de las clases son privados y se accede a ellos exclusivamente a través de métodos set y get.

POLIMORIFISMO 
Se utiliza una lista única de tipo ArrayList<Empleado> para almacenar y gestionar dinámicamente tanto a médicos como a administrativos. 
El método calcularPago() se ejecuta de forma dependiendo el tipo de empleado

EXCEPCIONES
Se implementan bloques try-catch para capturar errores en tiempo de ejecución, impidiendo que el programa colapse.

CONVERSIONES
Se hacen transformaciones obligatoria de datos usando Integer.parseInt() y Double.parseDouble() para procesar de forma segura las entradas de texto de la consola hacia variables numéricas.

VALIDACIONES
El sistema restringe el ingreso de campos vacíos, correos sin @, teléfonos sin números, edades invalidas fuera de rango (0 a 150) y valores de pago menores o iguales a cero.