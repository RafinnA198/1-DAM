import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.Instant;
import java.time.Period;
import java.time.ZoneId;
import java.time.temporal.*;

void main() {
    // Estructura del localdate junto con now y of
    LocalDate fecha = LocalDate.now();
    IO.println(("Hola muchacho la hora es: " + fecha));
    LocalDate fecha2 = LocalDate.of(2005, Month.APRIL, 1);
    IO.println(("Holaaa la hora es: " + fecha2));

    LocalDate firstDayOfMonth = fecha.withDayOfMonth(1);
    IO.println(("Hola muchacho es: " + firstDayOfMonth));

    LocalTime hora = LocalTime.now();
    IO.println("Hoy es: " + hora);

    LocalTime openingTime = LocalTime.of(8, 30); // 08:30 AM

    // 3. Modificar un elemento con with()
    LocalTime sharpHour = hora.withMinute(0).withSecond(0).withNano(0);


    LocalDateTime hora2 = LocalDateTime.now();
    IO.println("Hoy es: " + hora2);
    LocalTime hora3 = LocalTime.of(12, 30);
    // Esto lo tiene que explicar ahora
   LocalDate fecha3 = fecha.with(TemporalAdjusters.firstDayOfNextMonth());

    ZonedDateTime hora4 = ZonedDateTime.now();
    IO.println("Hoy es: " + hora4);
    ZonedDateTime hora5 = ZonedDateTime.of(2026, 10, 14, 18, 30, 0, 0, ZoneId.of("Europe/Madrid"));
    IO.println("Hora5: " + hora5);

    ZonedDateTime ahora = ZonedDateTime.now();

    // Cambiar solo al año a 2020
    ZonedDateTime anio2020 = ahora.withYear(2020);
    // Cambiar la hora a las 15:00
    ZonedDateTime quince = ahora.withHour(15);

    Instant instant = Instant.now();
    IO.println(instant);
    Instant instant2 = Instant.ofEpochSecond(123);
    IO.println(instant2);
    // Instant.ofEpochSecond:
    // ======================
    // Obtiene una instancia de lo cual usa los segundos de la epoca 1970-01-01
    // y campo de los nanosegundos se establece a cero

    Instant temporal = instant2.with(t -> t.plus(5, ChronoUnit.HOURS));

    /* t -> Es una funcion dinamica
    El metodo with toma el tiempo actual de instant2, se lo inyecta a la variable t,
    ejecuta la suma (plus) y genera un nuevo Instant desplazado en el futuro

    ================================================================================

     El plus no es necesario debido a que hay mas metodos que se pueden llegar a
    utilizar como .minus para indicar el minimo .truncatedTo si deseamos truncar el tiempo.

    La variable t no es necesaria para nada es una variable que nosotros nos inventamos
    podemos llamar a la variable

    ==============================================

    Esta es la unica forma de eliminar la variable por completo
    Aquí NO hay variable 't' ni flecha '->'
    Instant temporal = instant2.with(Instant::now);

     */

    // =============
    // Metodo period
    // =============

    LocalDate today = LocalDate.now();
    Period periodo = Period.of(1,2,3);
    // En este se indica el año, el mes y el dia
    LocalDate futureDate =  today.plus(periodo);
    IO.println(futureDate);

    //
    LocalDate today2 = LocalDate.now();
    LocalDate changedDate = today2.with(ChronoField.DAY_OF_MONTH, 15);

    //
    LocalTime now = LocalTime.now();
    Duration duration = Duration.ofHours(2);
    LocalTime futureTime = now.plus(duration);

    // El metodo with() en duration no existe porque es una cantidad de tiempo abstracta.
    // un bloque de horas/segundos, no una posicion en el calendario que se pueda ajustar.














}