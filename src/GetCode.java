import java.util.Scanner;

public class GetCode {
    public static void main(String[] args){
        String input;
        int max=999999,min=100000;

        Scanner sc = new Scanner(System.in);
        input = sc.next();
        if(input.equals("GET")){
            int ran2 = (int) (Math.random()*(max-min)+min);
            System.out.println(ran2);
        }
    }
}
