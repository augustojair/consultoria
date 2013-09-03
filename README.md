Consultoría
===========

Proyecto de Software para la gestión de una consultoría. Programado en Java, a través de un proyecto de NetBeans


Funcionamiento
--------------

Es un simple gestor de clientes y proveedores de una consultoría, sea lo que sea a lo que se dedique.
Tambien, cuenta con un registro de transacciones y un sitio de almacenamiento de Notas para el administrador.
En la pestaña Principal, se manejan las transacciones y las Notas y los Proveedore y Clientes, se manejan en sus respectivas pestañas.

Para crear un Cliente/Proveedor nuevo, se debe presonar el Botón "Crear Nuevo", en su debida pestaña. Luego llenar los datos y Presionar "Guardar".
Para editar un Cliente/Proveedor, se debe seleccionar en la lista y luego presionar "Ver". Luego editar los campos y presionar "Actualizar".

Para crear una nueva transacción, se dirige a la pestaña Principal, y llenas los campos requerido y presionas "Agregar".

Para actualizar las Notas, en la pestaña Notas, se llena el campo y luego "Guardar".

Error
-----

Hay un error que solo se da en el primer uso.
Como el programa debe cargar los datos almacenados y en el primer uso, estos no existen, se puede dar que aparezca un mensaje que diga: "No existe la Tabla (nombre de la tabla) en la base de datos".
Se soluciona cuando se hayan cargado al menos un dato en Transacciones, Clientes y Proveedores. Es solo una advertencia y no causa problemas en el funcionamiento del software.
