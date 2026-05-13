Es un sistema de gestión de roles empresariales, los roles son: 
* Administrador
* Cajero
* Supervisor

El problema está en que cada rol tiene diferentes competencias y capacidades, por tanto, se utilizan interfaces.

Las interfaces son: 
* Autenticable
* Gestionable
* Reportable

Hay un menú en el main y una variable del tipo de una interfaz que servirá para aplicar polimorfismo, esta variable se inicializa con null para que no apunte a ningún lugar en la memoria.
Utilizo instanceof para preguntarle al objeto que habilidades tiene antes de usarlo.
 