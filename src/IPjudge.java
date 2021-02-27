import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class IPjudge {
    public static void main(String[] args) throws IOException {
        File file = new File("E:\\临时\\white_list.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        Vector<String> ips = new Vector<>();

        while((line=br.readLine())!=null){
            ips.add(line);
        }

        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();

        System.out.println(ips);

        if(ips.contains(input)){
            System.out.println("该IP地址可以访问网络");
        }else{
            System.out.println("该IP地址不允许访问网络");
        }
    }
}
