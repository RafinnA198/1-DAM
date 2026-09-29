## 1. Algoritmo


Un algoritmo es una serie ordenada de pasos para resolver un problema.


En PSeInt, un algoritmo tiene esta estructura:


Pseudocode






```
Algoritmo Nombre_del_algoritmo

    // Instrucciones del programa

FinAlgoritmo

```






## 2. Comentarios


Los comentarios sirven para explicar el código. PSeInt no los ejecuta.


Se escriben con dos barras:


Pseudocode






```
// Este texto es un comentario

```





También puedes usarlos para separar apartados:


Pseudocode






```
// Apartado 1: entrada de datos

```






## 3. Variables


Una variable es un espacio donde se guarda un dato.


Pseudocode






```
Definir edad Como Entero
Definir precio Como Real
Definir nombre Como Caracter
Definir correcto Como Logico

```





### Tipos principales

































| Tipo | Uso | Ejemplo |
| --- | --- | --- |
| `Entero` | Números sin decimales | `18` |
| `Real` | Números con decimales | `24.50` |
| `Caracter` | Texto | `"Gasolina"` |
| `Logico` | Verdadero o falso | `Verdadero` |




## 4. Asignación


La asignación sirve para guardar un valor en una variable:


Pseudocode






```
edad = 20
precio = 15.50
nombre = "Ana"
correcto = Verdadero

```





No hay que confundirla con una comparación. En una asignación guardamos un valor:


Pseudocode






```
numero = 5

```






## 5. Entrada y salida de datos


### `Escribir`


Muestra información en pantalla:


Pseudocode






```
Escribir "Introduce tu edad:"

```





También puede mostrar el contenido de una variable:


Pseudocode






```
Escribir "Tu edad es: ", edad

```





### `Leer`


Permite que el usuario introduzca un dato:


Pseudocode






```
Leer edad

```





Normalmente se muestra una pregunta antes de leer:


Pseudocode






```
Escribir "¿Cuántos años tienes?"
Leer edad

```






## 6. Condicional `Si`


Permite ejecutar instrucciones cuando se cumple una condición:


Pseudocode






```
Si edad >= 18 Entonces
    Escribir "Eres mayor de edad."
FinSi

```





### Condicional `SiNo`


Permite indicar qué hacer si la condición no se cumple:


Pseudocode






```
Si edad >= 18 Entonces
    Escribir "Eres mayor de edad."
SiNo
    Escribir "Eres menor de edad."
FinSi

```






## 7. Operadores de comparación




































| Operador | Significado |
| --- | --- |
| `=` | Igual a |
| `<>` | Distinto de |
| `<` | Menor que |
| `>` | Mayor que |
| `<=` | Menor o igual que |
| `>=` | Mayor o igual que |



Ejemplo:


Pseudocode






```
Si precio > 50 Entonces
    Escribir "Gasto elevado."
FinSi

```






## 8. Operadores lógicos


### `Y`


Las dos condiciones deben cumplirse:


Pseudocode






```
Si edad >= 18 Y edad <= 120 Entonces
    Escribir "Edad válida."
FinSi

```





### `O`


Al menos una de las condiciones debe cumplirse:


Pseudocode






```
Si dia = 6 O dia = 7 Entonces
    Escribir "Es fin de semana."
FinSi

```





### `NO`


Niega una condición:


Pseudocode






```
Si NO es_valido Entonces
    Escribir "Dato incorrecto."
FinSi

```






## 9. Bucle `Para`


Se utiliza cuando sabemos cuántas veces queremos repetir unas instrucciones.


Pseudocode






```
Para contador = 1 Hasta 5 Con Paso 1 Hacer
    Escribir contador
FinPara

```





La variable `contador` controla las repeticiones y normalmente es numérica.


Por ejemplo, para registrar tres gastos:


Pseudocode






```
Para contador = 1 Hasta 3 Hacer
    Escribir "Introduce el gasto ", contador
FinPara

```






## 10. Bucle `Mientras`


Se utiliza cuando la repetición depende de una condición, y no sabemos necesariamente de antemano cuántas veces se repetirá.


Pseudocode






```
Mientras numero < 10 Hacer
    Escribir numero
    numero = numero + 1
FinMientras

```





Hay que modificar dentro del bucle alguna variable relacionada con la condición. Si no, el bucle podría no terminar nunca.



## 11. Estructura `Segun`


Se utiliza para elegir entre varias opciones concretas, por ejemplo, en un menú:


Pseudocode






```
Segun opcion Hacer
    1:
        Escribir "Primera opción."
    2:
        Escribir "Segunda opción."
    3:
        Escribir "Tercera opción."
    De Otro Modo:
        Escribir "Opción no válida."
FinSegun

```





Es útil cuando hay varias opciones asociadas a una misma variable.



## 12. Contadores


Un contador lleva la cuenta de cuántas veces ocurre algo. Se inicializa —normalmente a cero— y se incrementa cuando sucede el evento:


Pseudocode






```
aprobados = 0

Si nota >= 5 Entonces
    aprobados = aprobados + 1
FinSi

```






## 13. Acumuladores


Un acumulador guarda una suma que va creciendo. Se inicializa antes de sumar y se actualiza dentro del proceso:


Pseudocode






```
total = 0
total = total + precio

```





Por ejemplo, para sumar tres precios:


Pseudocode






```
total = 0

Para contador = 1 Hasta 3 Hacer
    Leer precio
    total = total + precio
FinPara

```






## 14. Diferencia entre contador y acumulador























| Concepto | Función | Ejemplo |
| --- | --- | --- |
| Contador | Cuenta elementos o sucesos | `gastos_elevados = gastos_elevados + 1` |
| Acumulador | Suma valores | `total = total + importe` |




## 15. Operadores aritméticos
































| Operador | Operación |
| --- | --- |
| `+` | Suma |
| `-` | Resta |
| `*` | Multiplicación |
| `/` | División |
| `^` | Potencia |



Ejemplos:


Pseudocode






```
precio_final = precio - descuento
area = base * altura

```






## 16. Estructura recomendada de un programa


Una forma ordenada de escribir un algoritmo es:



1. Declarar las variables.

2. Pedir los datos.

3. Validar los datos.

4. Realizar los cálculos.

5. Mostrar los resultados.



Ejemplo:


Pseudocode






```
Algoritmo Ejemplo

    // 1. Declaración de variables
    Definir numero, resultado Como Entero

    // 2. Entrada de datos
    Escribir "Introduce un número:"
    Leer numero

    // 3. Validación
    Si numero < 0 Entonces
        Escribir "El número no puede ser negativo."
    SiNo

        // 4. Cálculo
        resultado = numero * 2

        // 5. Salida
        Escribir "Resultado: ", resultado

    FinSi

FinAlgoritmo
```
