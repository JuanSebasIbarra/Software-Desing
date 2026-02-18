# Sistema de Gestión de Pedidos  
## Cafetería Universitaria Digital

---

##  Descripción del Proyecto

Sistema diseñado para gestionar pedidos de una cafetería universitaria digital, permitiendo:

- Visualizar menú
- Realizar pedido
- Pagar
- Notificar preparación
-  Confirmar entrega

---

#  ACTIVIDAD 1 — ABSTRACCIÓN

##  Objetivo

Diseñar un software capaz de gestionar pedidos de forma eficiente, garantizando:

- Trazabilidad del pedido
- Control de pagos
- Seguimiento de estado
- Registro en base de datos

---

##  Actores del Sistema

- Cliente
- Personal de cocina
- Sistema de pago

---

##  Funcionalidades

- Visualizar menú actualizado
- Crear pedido
- Seleccionar productos
- Editar pedido
- Calcular total
- Gestionar método de pago
- Notificar cocina
- Actualizar estado
- Notificar cliente
- Confirmar entrega

---

##  Límites del Sistema

###  Dentro del Sistema

- Gestión de pedidos
- Cálculo de totales
- Registro de pagos
- Notificaciones
- Persistencia en base de datos

###  Fuera del Sistema

- Preparación física del producto
- Entrega física
- Inventario
- Proveedores
- Contabilidad
- Procesamiento interno bancario

---

##  Diagrama de Abstracción

![image alt](https://github.com/JuanSebasIbarra/Software-Desing/blob/122c98e664527dff96a884da8439bd68debd4918/Taller/Diagramas/Ejercicio%20Cafeteria%20Universitaria.jpg)

---

#  ACTIVIDAD 2 — MODULARIDAD

El sistema se divide en módulos independientes:

- Módulo Pedidos
- Módulo Pagos
- Módulo Notificaciones
- Módulo Usuarios
- Módulo Sedes

##  Diagrama de Módulos

![Diagrama Modular](img/modularidad.png)

---

#  ACTIVIDAD 3 — REFINAMIENTO (Código)

```java
import java.util.List;

public class Order {

    private final int orderID;
    private List<Product> items;
    private Branch branch;
    private String status;

    public Order(int orderID, List<Product> items, Branch branch, String status) {
        this.orderID = orderID;
        this.items = items;
        this.branch = branch;
        this.status = status;
    }

    public Order(int orderID, List<Product> items, Branch branch) {
        this(orderID, items, branch, "PENDING");
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void addItem(Product item) {
        this.items.add(item);
    }

    public void removeItem(Product item) {
        this.items.remove(item);
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getBranchLocation() {
        return branch.getName();
    }

    public String getStatus() {
        return this.status;
    }
}


```

# ACTIVIDAD 4: APLICACIÓN DE PRINCIPIOS

## Flexibilidad

El sistema es flexible ya que aplicaría módulos independientes, esto permite modificar o ampliar funcionalidades del sistema a futuro sin afectar a otras partes del sistema.

## Pruebas

Este sistema permite realizar pruebas ya que los módulos funcionan de manera independiente, el frontend se encuentra desacoplado del backend y la lógica está separada de la interfaz.

Se pueden realizar pruebas unitarias al método calcular_total() del módulo Pedidos sin necesidad de conectarse a la base de datos ni a la pasarela de pago.

Mock de pasarela de pagos: Se puede simular el pago de un producto sin necesidad de conectarse al banco y eso demostraría un buen diseño de software.

## Qué pasaría si crece a varias sedes

El sistema está diseñado para escalar de manera eficiente a múltiples sedes universitarias sin necesidad de reescribir el código base. Gracias a la modularidad, donde la lógica de negocio está separada de la interfaz, podemos manejar diferentes cafeterías tratando a cada una como una instancia de la entidad Sede (Branch).

En lugar de utilizar un diseño estático, la arquitectura permite que cada Pedido esté vinculado a una sede mediante composición específica. Si la universidad abre nuevas sedes, solo es necesario registrarlas en la Capa de Datos. El Backend API procesará las solicitudes de forma independiente, permitiendo que cada sede gestione su propio menú y pedidos en tiempo real, manteniendo la flexibilidad y facilitando el mantenimiento centralizado del software.

``
# ACTIVIDAD 5: ARQUITECTURA
![image alt](https://github.com/JuanSebasIbarra/Software-Desing/blob/83211ebbcc8821654af6250894871e7e61b4be9a/Taller/Diagramas/Arquitectura%20del%20sistema%20de%20gestion%20de%20pagos%20para%20Cafeteria%20unviersitaria.png)
