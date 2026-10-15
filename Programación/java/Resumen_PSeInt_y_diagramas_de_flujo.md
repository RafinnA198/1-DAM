# Resumen: PSeInt y diagramas de flujo

Guía de repaso para entender cómo representar un algoritmo antes de programarlo. Incluye el ejemplo del tema de comprobar si un número entre 1 y 100 es par y ejemplos adicionales para practicar las estructuras de PSeInt.

> **Nota sobre el material:** en la copia del PDF hay páginas que aparecen en blanco y no se distinguen explicaciones completas de los bucles de PSeInt. Por eso, el ejemplo del número par se basa en el tema y los ejemplos de `Para`, `Mientras`, `Repetir` y `Segun` se añaden como apoyo didáctico.

## 1. ¿Qué es un algoritmo?

Un **algoritmo** es una serie ordenada y clara de pasos para resolver un problema. Por ejemplo, una receta es un algoritmo: indica qué hacer y en qué orden.

Para que un algoritmo sea útil, debe ser:

- **Preciso:** cada paso indica claramente qué hay que hacer.
- **Definido:** con los mismos datos de entrada se obtiene el mismo resultado.
- **Finito:** termina después de un número limitado de pasos.

El algoritmo es la idea; el **programa** es esa idea escrita con las reglas de un lenguaje que el ordenador puede ejecutar.

## 2. ¿Qué es PSeInt?

**PSeInt** es una herramienta para aprender lógica de programación mediante **pseudocódigo** y diagramas de flujo. El pseudocódigo se parece al lenguaje cotidiano, pero usa instrucciones ordenadas y palabras clave como `Leer`, `Escribir`, `Si` y `Mientras`.

No es Java ni otro lenguaje de producción: sirve para diseñar, probar y comprender algoritmos sin tener que empezar por la sintaxis complicada de un lenguaje real.

### Estructura mínima

```pseudocode
Algoritmo Saludo
    Definir nombre Como Caracter

    Escribir "¿Cómo te llamas?"
    Leer nombre
    Escribir "Hola, ", nombre
FinAlgoritmo
```

- `Algoritmo Saludo` y `FinAlgoritmo` delimitan el programa.
- `Definir` declara una variable y su tipo.
- `Escribir` muestra información.
- `Leer` recibe un dato escrito por la persona.
- La **indentación** (sangría) ayuda a ver qué instrucciones pertenecen a cada bloque.

## 3. Datos, variables y operadores

Una **variable** es un espacio con nombre donde guardamos un dato que puede cambiar.

| Tipo | Guarda | Ejemplos |
|---|---|---|
| `Entero` | Números sin decimales | `4`, `-2` |
| `Real` | Números con decimales | `3.5`, `-0.25` |
| `Caracter` | Texto o símbolos | `"Ana"`, `"A"` |
| `Logico` | Un valor verdadero o falso | `Verdadero`, `Falso` |

```pseudocode
Definir edad Como Entero
Definir precio Como Real
Definir nombre Como Caracter
Definir esMayorDeEdad Como Logico
```

### Operadores habituales

| Uso | Operadores |
|---|---|
| Cálculo | `+`, `-`, `*`, `/`, `^` |
| Resto de una división | `MOD` |
| Comparación | `=`, `<>`, `<`, `>`, `<=`, `>=` |
| Lógica | `Y`, `O`, `NO` |
| Asignación | `<-` |

Ejemplo: `resto <- numero MOD 2` guarda en `resto` el resto de dividir `numero` entre 2. Si el resto es cero, el número es par.

**Ojo:** `<-` asigna un valor; `=` compara dos valores.

## 4. Las tres estructuras básicas

Un algoritmo estructurado se construye combinando:

1. **Secuencia:** instrucciones que se ejecutan una tras otra.
2. **Selección:** escoger qué instrucciones ejecutar según una condición.
3. **Repetición:** repetir instrucciones mientras se cumpla una condición o durante un número de veces.

## 5. Decisiones: `Si` y `Segun`

### `Si` / `SiNo`: decidir según una condición

Se usa cuando hay que elegir entre dos caminos, o comprobar varias condiciones.

```pseudocode
Si temperatura > 30 Entonces
    Escribir "Hace calor"
SiNo
    Escribir "No hace tanto calor"
FinSi
```

La condición se evalúa como verdadera o falsa. Si es verdadera se ejecuta el primer bloque; si es falsa, se ejecuta el bloque `SiNo`.

### `Segun`: elegir entre varias opciones concretas

Es práctico para menús u opciones numeradas. Evita encadenar muchos `Si`.

```pseudocode
Algoritmo MenuSencillo
    Definir opcion Como Entero

    Escribir "1. Saludar"
    Escribir "2. Despedirse"
    Escribir "Elige una opción:"
    Leer opcion

    Segun opcion Hacer
        1:
            Escribir "¡Hola!"
        2:
            Escribir "¡Hasta luego!"
        De Otro Modo:
            Escribir "Opción no válida"
    FinSegun
FinAlgoritmo
```

`De Otro Modo` es el caso alternativo: se ejecuta si no coincide ninguna opción indicada.

**Regla rápida:** `Si` sirve para condiciones (por ejemplo, `edad >= 18`); `Segun` sirve para comparar una expresión con distintas opciones concretas (por ejemplo, `1`, `2` o `3`).

## 6. Bucles: repetir instrucciones

### `Para`: cuando sabes cuántas veces repetir

`Para` controla un contador. En este ejemplo se suman los números del 1 al 5:

```pseudocode
Algoritmo SumarDelUnoAlCinco
    Definir i, suma Como Entero
    suma <- 0

    Para i <- 1 Hasta 5 Con Paso 1 Hacer
        suma <- suma + i
    FinPara

    Escribir "La suma es ", suma
FinAlgoritmo
```

El contador `i` toma los valores `1`, `2`, `3`, `4` y `5`. La suma final es `15`.

- El primer valor es `1`; el último, `5`.
- `Con Paso 1` indica que el contador aumenta de uno en uno.
- Si se omite `Con Paso`, PSeInt usa normalmente el paso 1.

**Úsalo para:** recorrer un rango conocido, como repetir algo 10 veces.

### `Mientras`: repetir mientras una condición sea verdadera

Primero se comprueba la condición. Si ya es falsa, el bloque podría no ejecutarse ninguna vez.

```pseudocode
Algoritmo ValidarNumeroNoNegativo
    Definir numero Como Entero

    Escribir "Introduce un número igual o mayor que cero:"
    Leer numero

    Mientras numero < 0 Hacer
        Escribir "El número no puede ser negativo. Prueba otra vez:"
        Leer numero
    FinMientras

    Escribir "Número aceptado: ", numero
FinAlgoritmo
```

El bucle continúa **mientras** `numero < 0`. Cuando la persona introduce cero o un número positivo, la condición pasa a ser falsa y el programa continúa.

**Úsalo para:** repetir una acción mientras no se cumpla una condición de salida.

### `Repetir ... Hasta Que`: repetir hasta que la condición sea verdadera

La condición se comprueba al final; por eso, el bloque se ejecuta **al menos una vez**.

```pseudocode
Algoritmo PedirOpcionHastaSalir
    Definir opcion Como Entero

    Repetir
        Escribir "Escribe 0 para salir:"
        Leer opcion
    Hasta Que opcion = 0

    Escribir "Programa terminado"
FinAlgoritmo
```

En este bucle, `Hasta Que opcion = 0` expresa cuándo se detiene. No significa “repetir mientras sea cero”, sino “repetir hasta que sea cero”.

**Úsalo para:** mostrar un menú al menos una vez y volver a mostrarlo hasta que se elija salir.

### ¿Qué bucle elijo?

| Situación | Estructura |
|---|---|
| Sé exactamente cuántas repeticiones necesito | `Para` |
| Debo repetir mientras algo sea cierto; puede que no entre nunca | `Mientras` |
| Debo ejecutar el bloque al menos una vez y luego comprobar si termino | `Repetir ... Hasta Que` |

### Error típico: bucle infinito

En un `Mientras`, revisa que algo dentro del bucle pueda cambiar la condición. Si `numero < 0` y nunca se vuelve a leer o modificar `numero`, la condición seguirá siendo verdadera y el bucle no terminará.

## 7. Ejemplo del tema: comprobar si un número es par

El procedimiento es:

1. Pedir un número.
2. Comprobar que está entre 1 y 100.
3. Si está fuera del rango, indicarlo.
4. Si está dentro, calcular `numero MOD 2`.
5. Si el resto es cero, es par; si no, es impar.

```pseudocode
Algoritmo ComprobarPar
    Definir numero Como Entero

    Escribir "Introduce un número entre 1 y 100:"
    Leer numero

    Si numero < 1 O numero > 100 Entonces
        Escribir "Fuera de rango"
    SiNo
        Si numero MOD 2 = 0 Entonces
            Escribir "El número es par"
        SiNo
            Escribir "El número es impar"
        FinSi
    FinSi
FinAlgoritmo
```

Ejemplos: `8 MOD 2 = 0`, por tanto 8 es par; `7 MOD 2 = 1`, por tanto 7 es impar. El primer `Si` valida el rango antes de comprobar si es par o impar.

## 8. Diagramas de flujo

Un **diagrama de flujo** dibuja los pasos de un algoritmo. Se lee siguiendo las flechas desde el inicio hasta el final.

| Forma | Significado | Ejemplo de uso |
|---|---|---|
| Óvalo | Inicio o fin | `Inicio`, `Fin` |
| Rectángulo | Acción o cálculo | `suma <- suma + i` |
| Rombo | Decisión; las salidas suelen ser `Sí` y `No` | `¿numero MOD 2 = 0?` |
| Paralelogramo | Entrada o salida | `Leer numero`, `Escribir resultado` |
| Flecha | Dirección del flujo | Indica qué paso sigue |
| Círculo pequeño | Conector, si el dibujo necesita continuar en otra zona | Evita flechas largas que se cruzan |

### Diagrama textual del ejemplo del número par

```text
                (INICIO)
                    |
          / Leer numero \
                    |
         < ¿numero < 1 O
           numero > 100? >
             /Sí      \No
            v          v
  / Escribir       < ¿numero MOD 2 = 0? >
    "Fuera de           /Sí       \No
    rango" /           v           v
            |   / Escribir   / Escribir
            |     "Par" /     "Impar" /
             \       |          /
              \      |         /
                   (FIN)
```

Los bloques entre `/ ... /` representan entradas o salidas; los bloques `< ... >` representan decisiones. En un diagrama dibujado se usan las formas de la tabla, no necesariamente estos caracteres.

### Cómo dibujar un bucle

Un bucle se reconoce porque una flecha vuelve a un paso anterior:

```text
(Inicio) -> [Preparar datos] -> <¿se sigue cumpliendo la condición?>
                                      |Sí
                                      v
                               [Instrucciones]
                                      |
                                      +------ vuelve a la condición
                                      |
                                     No
                                      v
                                    (Fin)
```

En un `Mientras`, la condición se comprueba antes de ejecutar el bloque. En un `Repetir ... Hasta Que`, el bloque se ejecuta primero y la comprobación va después. En un `Para`, el diagrama también debe mostrar la inicialización, la condición de fin y el avance del contador.

## 9. Pseudocódigo o diagrama: ¿cuál conviene?

- El **pseudocódigo** suele ser más cómodo para describir algoritmos largos y escribir instrucciones concretas.
- El **diagrama de flujo** ayuda a visualizar decisiones, caminos alternativos y repeticiones.
- Ambos pueden representar el mismo algoritmo. No cambia la solución, solo la forma de explicarla.

## 10. Lista de comprobación antes de entregar

- ¿He indicado qué datos se leen y qué resultado se muestra?
- ¿He definido las variables con un tipo adecuado?
- ¿He asignado un valor inicial a los acumuladores, como `suma <- 0`?
- ¿Cada `Si`, `Segun` y bucle tiene su cierre correspondiente?
- ¿La condición del bucle puede llegar a detenerlo?
- ¿He probado un caso normal y también los límites, como 1, 100 y un número fuera del rango?
- ¿El diagrama tiene inicio, fin, flechas y las formas correctas?

**Idea para recordar:** primero piensa los pasos, después represéntalos con pseudocódigo o con un diagrama, y por último comprueba el algoritmo con ejemplos concretos.
