# UD01: Introducción a la Programación

Esta unidad se centra en aprender a pensar lógicamente antes de escribir código. El lenguaje de programación es secundario; lo fundamental es saber plantear soluciones a los problemas.

## 1. Programar es resolver problemas
El ordenador es una máquina literal: hace exactamente lo que le dices, sin interpretar ambigüedades. Por eso, programar consiste en quitar esa ambigüedad. Una buena solución debe ser primero **correcta** (que funcione en todos los casos) y luego **eficiente** (que no malgaste tiempo ni recursos).

Conceptos clave al programar:
* **Abstracción:** Quédate solo con los datos que importan para el problema.
* **Divide y vencerás:** Trocea un problema grande en problemas más pequeños.
* **Encapsulación:** Oculta cómo funciona algo por dentro, mostrando solo qué hace.
* **Modularidad:** Cada pieza de código debe hacer una sola cosa bien definida.

## 2. Algoritmos vs. Programas
* **Algoritmo:** Es la idea o secuencia de pasos (precisa, definida y que tiene un fin) para resolver el problema. Es universal.
* **Programa:** Es ese algoritmo traducido a un lenguaje concreto (Java, Python, etc.) para que la máquina lo ejecute.

Para representar algoritmos antes de programar usamos **pseudocódigo** (lenguaje estructurado en español, como en PSeInt) o **diagramas de flujo** (esquemas visuales con cajas y flechas).

## 3. Fases de la programación
Todo desarrollo pasa por:
1. **Análisis:** Entender el problema (qué entra y qué sale).
2. **Diseño:** Crear el algoritmo (y hacer una traza mental para comprobarlo).
3. **Codificación:** Escribirlo en el lenguaje de programación.
4. **Pruebas:** Intentar romper tu programa con datos límite o absurdos.
5. **Mantenimiento:** Corregir fallos y mejorarlo con el tiempo. Es la fase más larga y costosa.

> **Nota:** Existen metodologías para organizar estas fases, desde las clásicas (Cascada, Espiral) hasta las **Ágiles** (Scrum, Kanban), que trabajan con entregas rápidas y constantes.

## 4. Paradigmas de programación
Es la forma en la que enfocas la solución:
* **Imperativo:** Le dices a la máquina *cómo* hacer las cosas paso a paso (estructurada, orientada a objetos).
* **Declarativo:** Le dices a la máquina *qué* quieres y ella decide cómo (funcional, SQL).

## 5. De tu código al procesador
Los ordenadores solo entienden ceros y unos (código máquina). Los lenguajes de alto nivel se deben traducir:
* **Compilados (C, C++):** Se traduce todo de golpe antes de ejecutar. Salen los errores al principio.
* **Interpretados (Python):** Se traduce línea a línea al momento.
* **Máquina Virtual (Java):** Escribes código `.java` -> se compila a un código intermedio llamado *bytecode* (`.class`) -> la Máquina Virtual de Java (JVM) lo ejecuta al vuelo en cualquier sistema operativo.

---

# Ejercicio 6: Calculadora de Tarifa de Aparcamiento

## 1. Entendiendo el problema (Análisis)
El objetivo es calcular cuánto paga un cliente. Para ello, necesitamos pedirle al usuario tres datos clave:
* Las **horas** que ha estado.
* El **tipo de vehículo** (1 para moto, 2 para coche, 3 para furgoneta).
* Si es **abonado** o no (S o N).

## 2. Reglas del negocio (Condiciones)
* Las horas introducidas siempre deben ser mayores que 0, y el tipo de vehículo debe ser válido. Si no, el programa da error y se cierra.
* La tarifa base depende del vehículo: Moto 1,50€, Coche 2,50€, Furgoneta 3,50€.
* Si el cliente lleva más de 5 horas, se le descuenta el 10%.
* Si es abonado, se le descuenta otro 15%.
* **El precio final nunca puede bajar de 2€**.

## 3. Ejemplo práctico paso a paso
Imagina que llega un **Coche** que ha estado **8 horas** y el cliente **SÍ es abonado**:

1. **Lectura de datos:** Horas = 8, Vehículo = 2, Abonado = S.
2. **Validación:** Datos correctos, el programa avanza.
3. **Cálculo del Precio Inicial:** Tarifa de coche (2,50€) x 8 horas = **20 €**.
4. **Cálculo de Descuentos (sobre los 20€):**
   * *¿Más de 5 horas?* Sí. El 10% de 20€ = **2 €** de descuento.
   * *¿Es abonado?* Sí. El 15% de 20€ = **3 €** de descuento.
5. **Cálculo Final:** 20€ - 2€ - 3€ = **15 €**.
6. **Control de Límite:** ¿15€ es menor que 2€? No, se mantiene en 15€.
7. **Salida:** Muestra: Precio base 20€, descuento horas 2€, descuento abonado 3€ y Total a pagar **15 €**.

## 4. Diagrama de Flujo

El siguiente código generará automáticamente el esquema visual en GitHub:

```mermaid
graph TD
    %% Inicio y lectura
    Start([Inicio]) --> LeerHoras[/Leer horas/]
    LeerHoras --> LeerTipo[/Leer tipoVehiculo 1, 2, 3/]
    LeerTipo --> LeerAbonado[/Leer abonado S/N/]

    %% Decisiones de validación
    LeerAbonado --> ValHoras{¿Horas <= 0?}
    ValHoras -- Sí --> ErrHoras[/Mostrar Error horas/]
    ErrHoras --> Fin([Fin])
    
    ValHoras -- No --> ValTipo{¿Tipo válido?}
    ValTipo -- No --> ErrTipo[/Mostrar Error tipo/]
    ErrTipo --> Fin
    
    %% Cálculos iniciales
    ValTipo -- Sí --> AsigPrecio[Asignar precioHora según tipo]
    AsigPrecio --> CalcBase[precioInicial = horas * precioHora]
    
    %% Comprobación de descuentos
    CalcBase --> DescHoras{¿Horas > 5?}
    DescHoras -- Sí --> AplicaDescH[descuentoHoras = precioInicial * 0.10]
    DescHoras -- No --> DescAbonado
    AplicaDescH --> DescAbonado{¿Es abonado?}
    
    DescAbonado -- Sí --> AplicaDescA[descuentoAbonado = precioInicial * 0.15]
    DescAbonado -- No --> CalcFinal
    AplicaDescA --> CalcFinal[precioFinal = precioInicial - descHoras - descAbonado]
    
    %% Límite de precio
    CalcFinal --> LimiteFinal{¿PrecioFinal < 2?}
    LimiteFinal -- Sí --> SetMin[precioFinal = 2]
    LimiteFinal -- No --> Salida
    SetMin --> Salida[/Mostrar Desglose Total/]
    
    Salida --> Fin
