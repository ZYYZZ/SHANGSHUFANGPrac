import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatePrint {
    public static void main(String[] args){
        Calendar rightNow = Calendar.getInstance();
        rightNow.set(2020,Calendar.DECEMBER,10,10,30,0);
        SimpleDateFormat dateformat=new SimpleDateFormat("(yyyy-MM-dd HH:mm:ss)");
        Date d1=new Date(rightNow.getTimeInMillis());
        System.out.println(dateformat.format(d1));
    }
}
