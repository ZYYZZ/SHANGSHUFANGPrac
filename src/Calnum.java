public class Calnum {
    public static void main(String[] args){
        int n = 0, sum = 0;
        while (true){
            if((n == 40) || (n == 48)){
                n = n+2;
                continue;
            }
            sum = sum + n;
            n = n + 2;
            if(sum >= 25000)
                break;
        }

        System.out.println("0到1000之间(40,48跳过，大于等于25000跳出)偶数的和为:"+sum);
    }
}
