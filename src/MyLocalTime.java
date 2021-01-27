import java.time.*;

public class MyLocalTime {
    public static void main(String[] args){
        LocalDate Date = LocalDate.now();
        System.out.println(Date);

        LocalTime Time = LocalTime.now();
        System.out.println(Time);

        LocalDateTime DateTime = LocalDateTime.now();
        System.out.println(DateTime);
    }
}
