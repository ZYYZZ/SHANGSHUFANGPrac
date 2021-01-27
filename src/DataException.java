import java.util.Scanner;

public class DataException {
    public static void main(String[] args){
        String input;
        String[] s;
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        s =  input.split(",");
        double a = Double.parseDouble(s[0]);
        double b = Double.parseDouble(s[1]);
        try{
            if(b == 0){
                throw new Exception();
            }
            System.out.println(a/b);
        }catch(Exception e){
            System.out.println("除数不能为零");
        }
    }
}
