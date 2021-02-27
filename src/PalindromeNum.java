import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args){
        String input;
        StringBuilder re_input = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();

        for(int i = input.length()-1;i >= 0;i--){
            re_input.append(input.charAt(i));
        }

        if (re_input.toString().equals(input)){
            System.out.println("该字符串是一个回文数");
        }else{
            System.out.println("该字符串不是一个回文数");
        }
    }
}
