# Resumen UD01: Introducción a la Programación y Metodologías Ágiles

Este documento sintetiza los conceptos clave explicados en la unidad formativa **UD01 · Introducción a la programación** [1].

---

## 1. Metodologías Ágiles de Desarrollo

### 1.1. Scrum
Scrum es un marco de trabajo ágil para desarrollar productos complejos mediante ciclos cortos denominados **sprints**, los cuales suelen durar entre 1 y 4 semanas [1]. Al finalizar cada sprint, se debe entregar un incremento del producto funcional que aporte valor [1].

#### Elementos Básicos de Scrum:
* **Product Backlog**: Lista priorizada de todo lo que podría necesitar el producto. Se actualiza continuamente conforme el equipo aprende [1].
* **Sprint**: Periodo de duración fija donde se selecciona y completa un bloque de trabajo [2].
* **Daily Scrum**: Reunión diaria breve para revisar el avance y detectar posibles impedimentos [2].
* **Revisión del Sprint**: Demostración del incremento realizado para obtener feedback y decidir los siguientes pasos [2].
* **Retrospectiva**: Reflexión del equipo sobre cómo mejorar la dinámica de trabajo para el siguiente sprint [2].

#### Responsabilidades Principales (Roles):
* **Product Owner**: Define y ordena las prioridades del producto [2, 3].
* **Scrum Master**: Facilita la aplicación del marco de trabajo y elimina obstáculos [2, 3].
* **Equipo de Desarrolladores**: Construye el producto de forma autoorganizada para alcanzar el objetivo del sprint [2, 3].

---

### 1.2. Kanban
Kanban es un método de gestión de trabajo basado en un **flujo continuo** [3]. Las tareas se representan mediante tarjetas en un tablero organizado por columnas (por ejemplo: *Pendiente*, *Preparado*, *En curso* y *Hecho*) [3].

#### Principios Fundamentales:
1. **Visualizar el flujo**: Permite observar el estado de cada tarea, lo que está bloqueado y lo pendiente [3].
2. **Limitar el trabajo en curso (WIP - Work In Progress)**: Establece un límite máximo de tareas abiertas simultáneamente para evitar sobrecargas [3, 4].
3. **Trabajar por arrastre (Pull)**: Se inicia una nueva tarea solo cuando hay capacidad disponible [4].
4. **Medir y mejorar**: Analiza el tiempo que toma completar una tarea e identifica cuellos de botella [4].

#### Diferencias con Scrum:
Kanban no requiere sprints de duración fija, roles predefinidos ni reuniones obligatorias; las entregas pueden realizarse en cualquier momento [4]. No obstante, ambos enfoques pueden combinarse (por ejemplo, planificando en sprints de Scrum e integrando un tablero Kanban) [4, 5].

---

## 2. Paradigmas de Programación

Un **paradigma** es un modelo para diseñar y estructurar programas que determina la forma de pensar la solución [5]. La diferencia central estriba en explicar a la máquina **cómo** hacer las cosas paso a paso frente a describir **qué** resultado se desea obtener [5, 6].

### 2.1. Paradigma Imperativo
Consiste en describir **cómo** lograr el objetivo mediante una secuencia de instrucciones que modifican el estado del programa [6]. Evoluciona históricamente en tres etapas:

1. **Programación No Estructurada**:
   * Uso de saltos incondicionales (`goto`) a cualquier punto del código [6].
   * Genera el denominado "código espagueti", difícil de seguir y mantener [6].
2. **Programación Estructurada**:
   * Demuestra que todo programa se puede construir únicamente con tres estructuras de control: **Secuencia**, **Selección** y **Repetición** [7].
   * Incorpora el uso de **funciones** para agrupar y reutilizar código [7].
3. **Programación Orientada a Objetos (POO)**:
   * Organiza el programa en objetos que combinan datos y comportamientos [7].
   * Es el enfoque predominante en el desarrollo profesional actual [7].

### 2.2. Paradigma Declarativo
Enfoque en el cual se describe **qué** se quiere obtener, dejando que el propio lenguaje gestione el proceso interno de resolución [5, 8].

---

## 3. Aclaración sobre PSeInt, Diagramas de Flujo y Estructuras Específicas

En el material correspondiente a la unidad **UD01 · Introducción a la programación**:
* Se exponen los fundamentos teóricos de la programación estructurada (estructuras de **secuencia**, **selección** y **repetición**) [7].
* **No se incluyen** explicaciones o ejemplos sobre la herramienta **PSeInt**, **diagramas de flujo** o la sintaxis específica de estructuras en pseudocódigo como `Para`, `Mientras` o `Según`.
