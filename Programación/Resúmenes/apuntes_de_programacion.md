### 1. Definición de Variables

Antes de guardar datos, le avisamos a la computadora qué tipo de información vamos a usar. Los importes y descuentos usan `Como Real` porque pueden tener decimales (centavos). El tipo de cliente es `Como Entero` (1, 2 o 3) y la opción de envío urgente es `Como Caracter` (una letra).

### 2. Filtros y Validaciones (Control de Errores)

Para evitar que el programa haga cálculos con datos falsos o erróneos, usamos condiciones anidadas (`Si... Entonces`):

* Primero comprueba si el `importeInicial <= 0`. Si es verdadero, muestra un error y detiene el flujo.
* Si el dinero está bien, avanza y pregunta el tipo de cliente. Valida con `tipoCliente < 1 O tipoCliente > 3` que solo se admitan los números 1, 2 y 3.
* Finalmente, la función `Mayusculas(envioUrgente)` transforma la respuesta del usuario (por si escribe una "s" minúscula) y verifica que sea estrictamente "S" o "N".

### 3. Aplicación de Descuentos

Los descuentos se calculan en base a reglas matemáticas fijas sobre el **importe inicial**:

* **Por tipo de cliente:** Si es `2` (Habitual), multiplica el dinero inicial por `0.10` (que equivale al 10%). Si es `3` (VIP), lo hace por `0.20` (20%).
* **Descuento adicional:** Una condición independiente evalúa si el importe supera los 100 €. Si se cumple, calcula el 5% (`importeInicial * 0.05`). Si no los supera, el descuento se queda en `0`.

### 4. Logística de Envío

El coste del envío se define en dos etapas acumulativas:

* Primero evalúa la distancia o el beneficio por compra: si el cliente gastó más de 50 €, su envío base pasa a costar `0`. Si gastó 50 € o menos, cuesta `5`.
* Después se evalúa el extra por velocidad: Si `envioUrgente = "S"`, se toman los euros acumulados del envío base y se le suman `8` adicionales (`costeEnvio <- costeEnvio + 8`).

### 5. Operación Final y Salida

El programa ejecuta la fórmula matemática definitiva restando los descuentos acumulados y sumando los costes de transporte calculados. Al final, imprime en la pantalla cada una de las variables siguiendo exactamente la estructura limpia que pide la tienda online.
