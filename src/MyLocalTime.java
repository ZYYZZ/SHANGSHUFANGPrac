import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyLocalTime {
    public static void main(String[] args){
        LocalDate Date = LocalDate.now();
        System.out.println(Date);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        LocalTime Time = LocalTime.now();
        String FormateTime = dateTimeFormatter.format(Time);
        System.out.println(FormateTime);

        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        LocalDateTime DateTime = LocalDateTime.now();
        String FormateDateTime = dateTimeFormatter.format(DateTime);
        System.out.println(FormateDateTime);
    }
}
