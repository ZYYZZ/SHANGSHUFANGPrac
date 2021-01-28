import java.util.Arrays;
import java.util.Scanner;

public class ElementChange {
    public static void main(String[] args){
        String input;
        String[] s;
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        s =  input.split(",");
        int[] array = new int[10];
        int x;
        for(int i = 0;i<s.length;i++){
            array[i] = Integer.parseInt(s[i]);
        }

        int al = array.length;
        for(int i = 0;i< al/2;i++){
            x = array[i];
            array[i] = array[al-i-1];
            array[al-i-1] = x;
        }

        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]);
            if(i==array.length-1)
                break;
            System.out.print(",");
        }
    }
}
