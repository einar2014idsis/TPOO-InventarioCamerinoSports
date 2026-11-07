# Inventario Camerino Sports | Aplicación de escritorio

Sistema de inventario y ventas para una tienda deportiva, desarrollado en Java con interfaz Swing y persistencia MySQL. Este repositorio es un **fork**; conserva la atribución del proyecto original y especifica tus aportes al compartirlo.

## Funcionalidades

- Inicio de sesión y gestión de usuarios.
- Pantallas y búsquedas de categorías, clientes, proveedores e ingresos.
- Registro y consulta de ventas y sus detalles.
- Reporte de ventas con JasperReports.

## Tecnologías y estructura

Java, Swing, JDBC, MySQL, Maven y JasperReports. `src/main/java/Vista/` contiene formularios y pantallas; `Control/` agrupa operaciones de acceso a datos; `Modelado/` contiene modelos y conexión; `Reportes/` incluye el diseño del reporte. `RecursosImportantes/` contiene bibliotecas y el script `_CamerinoSportsDB_Final_.sql`.

## Configuración y ejecución

1. Instala un JDK, Maven y MySQL; importa el script SQL de `RecursosImportantes/` en una instancia de desarrollo.
2. Revisa la conexión en `src/main/java/Modelado/Conexion.java`: apunta a MySQL local y a la base `inventariocamerinosports`. Ajusta credenciales en tu copia local y evita publicar contraseñas reales.
3. Abre el proyecto Maven en un IDE compatible con Swing, resuelve las bibliotecas y ejecuta la clase de entrada configurada en el proyecto. También se incluye un JAR en `target/`, cuyo funcionamiento depende de las bibliotecas y la base de datos disponibles.

Las credenciales de conexión están definidas en código y deben externalizarse antes de distribuir la aplicación. Revisa las licencias de las bibliotecas incluidas.
