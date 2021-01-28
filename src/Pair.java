import java.util.Scanner;

public class Pair {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int left,right;

        left = num('(',s);
        right = num(')',s);
        if(left == right){
            System.out.println("您输入的内容，括号完全配对");
        }else{
            System.out.println("您输入的内容，括号不配对");
        }
    }

    public static int num(char c,String s){
        int index = 0,n = 0;
        while(index!=-1) {
            index = s.indexOf(c, index);
            if (index != -1) {
                n++;
                index++;
            }
        }
        return n;
    }
}
