package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;


public class fechas {
    private static LocalDateTime dateTime2;

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2022, Calendar.JANUARY, 1);

        LocalDate date = LocalDate.of(2022, Month.JANUARY, 1); // Inmutable
        LocalTime time = LocalTime.of(10, 00);

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = LocalDateTime.of(2022, Month.JANUARY, 1, 10, 00);

        LocalDateTime lastWeek = dateTime.minusDays(7);

        // Formato
        String dateFormatted = dateTime.format(DateTimeFormatter.ISO_DATE_TIME);

        System.out.println(dateFormatted);

    }

}
