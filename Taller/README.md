Desarrollo Taller Práctico

CASO: Diseñar un sistema para: "Gestión de pedidos en una cafetería universitaria
digital" El sistema debe permitir:

    Ver menú
    Realizar pedido
    Pagar
    Notificar preparación
    Entregar pedido

ACTIVIDAD 1 ABSTRACCIÓN:

    Objetivo: Diseñar un software que pueda gestionar los pedidos de forma eficiente
    para una cafetería universitaria, desde la de un menú, el sistema debe permitirme ver
    la trazabilidad, gestionar un control de pagos y mostrarme un estado del pedido.

    Actores: se identifica a los siguientes actores:
        Cliente
        Personal de cocina
        Sistema de pago

    Funcionalidades del sistema
        Visualizar el menú en su última versión
        Crear un pedido
        Seleccionar un producto
        Editar el pedido
        Calcular el total de productos seleccionados.
        Gestión de método de pago
        Notificar a la cocina de la cafetería
        Actualizar el estado del pedido
        Notificar al cliente
        Confirmar entrega

    Limites del sistema

Dentro del sistema de gestión de pedidos en una cafetería universitaria, se puede decir
que el software puede controlar:

    Visualizar un menú
    Creación y gestión de un pedido
    Cálculo del total del pedido
    Registro de un método de pago o pasarela de pagos
    Notificación al cliente
    Notificación a la cocina de la cafetería
    Registro en la base de datos

Fuera del sistema de gestión de pedidos en una cafetería universitaria, se puede decir
que el software no puede controlar:

    Preparación física del producto
    Entrega del producto
    Manejo de un inventario de productos
    Gestión de los proveedores
    Contabilidad general de la cafetería
    Procesamiento interno de la pasarela de banco
! [](/home/sebastian/Descargas/Ejercicio Cafeteria Universitaria.jpg)

ACTIVIDAD 2: MODULARIDAD

! [](/home/sebastian/Descargas/Diagrama de modulos.png)

ACTIVIDAD 3: REFINAMIENTO

El código completo con este trabajo se encuentra en el repositorio de GitHub y el
taller en un README.MD

importjava.util.List;

clase pública Orden {
// Atributos privados para encapsulación
private final int orderID;
private final Listelementos;
rama final privada; rama;
cadena privada estado;

// Constructor
público Orden(int IDOrden, Listaartículos, Rama rama, Cadena estado) {
this.orderID = orderID;
this.items = artículos;
this.branch = rama;
this.status = estado;
}

// Constructor sobrecargado: utiliza un estado predeterminado
public Order(int orderID, Listartículos, rama rama) {
this(orderID, artículos, rama, "PENDIENTE");
}

// Métodos
public double calculateTotalPrice() {
double total = 0.0;
for (Producto item : items) {
total += item.getPrice();
}
return total;
}

public void addItem(Producto artículo) {
this.items.add(item);
}

public void removeItem(Producto artículo) {
this.items.remove(item);
}

public void updateStatus(String nuevoEstado) {
this.status = nuevoEstado;
}

cadena pública getBranchLocation() {
return branch.getName();
}

public String getStatus() {
devolver este.estado;
}
}
ACTIVIDAD 4: APLICACIÓN DE PRINCIPIOS

Flexibilidad: El sistema es flexible ya que aplicaría módulos independientes, esto
permite modificar o ampliar funcionalidades del sistema a futuro sin afectar a otras
partes del sistema.

Pruebas: Este sistema permite realizar pruebas ya que los módulos funcionan de
manera independiente, el frontend se encuentra desacoplado del backend y la lógica
está separada de la interfaz.

Se pueden realizar pruebas unitarias al método calcular_total() del módulo Pedidos sin
necesidad de conectarse a la base de datos ni a la pasarela de pago.

Mock de pasarela de pagos: Se puede simular el pago de un producto sin necesidad
de conectarse al banco y eso demostraría un buen diseño de software.

Qué pasaría si crece a varias sedes: El sistema está diseñado para escalar de
manera eficiente a múltiples sedes universitarias sin necesidad de reescribir el código
base. Gracias a la modularidad, donde la lógica de negocio está separada de la interfaz,
podemos manejar diferentes cafeterías tratando a cada una como una instancia de la
entidad Sede (Branch) .

En lugar de utilizar un diseño estático, la arquitectura permite que cada Pedido
esté vinculado a una sede mediante composición específica . Si la universidad abre
nuevas sedes, solo es necesario registrarlas en la Capa de Datos . El Backend API
procesará las solicitudes de forma independiente, permitiendo que cada sede gestione
su propio menú y pedidos en tiempo real, manteniendo la flexibilidad y facilitando el
mantenimiento centralizado del software.

ACTIVIDAD 5 : ARQUITECTURA

! [](/home/sebastian/Universidad/Diseño de Software/Taller #1 Principios del diseño de software/Arquitectura del sistema de gestion de pagos para Cafeteria unviersitaria.png)


