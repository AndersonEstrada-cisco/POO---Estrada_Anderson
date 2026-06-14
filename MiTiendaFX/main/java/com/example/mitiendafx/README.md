# MiTiendaFX

El Sistema permite gestionar productos, controlar inventario y administrar usuarios con inicio de sesión por roles.


## Tecnologías

- JavaFX CSS
- Scene Builder 

## Funcionalidades

- Inicio de sesión con selección de rol (Administrador, Vendedor, Cajero)
- Panel lateral de navegación con módulos:
  - Inicio
  - Productos (CRUD completo)
  - Categorías
  - Clientes
  - Ventas
  - Reportes
  - Usuarios
  - Cerrar Sesión

## Estructura del proyecto

```
MiTiendaFX/
├── pom.xml
├── mvnw / mvnw.cmd
├── .gitignore
├── README.md
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── module-info.java
│   │   │   └── com/example/mitiendafx/
│   │   │       ├── HelloApplication.java   (punto de entrada)
│   │   │       ├── HelloController.java     (controlador login)
│   │   │       ├── AdministradorController.java
│   │   │       ├── ProductosController.java
│   │   │       ├── Producto.java            (modelo)
│   │   │       └── Launcher.java
│   │   └── resources/
│   │       └── com/example/mitiendafx/
│   │           ├── styles.css
│   │           ├── hello-view.fxml
│   │           ├── administrador.fxml
│   │           └── productos.fxml
│   └── test/
└── target/
```

# Ejecutar desde IntelliJ IDEA

1. Abrir el project
2. Ejecutar la clase 'HelloApplication'



## Credenciales de prueba

Usuario: admin | Clave: 1234 | Rol: Administrador
Usuario: vendedor | Clave: vendedor | Rol: Vendedor
Usuario: cajero | Clave: cajero | Rol: Cajero
