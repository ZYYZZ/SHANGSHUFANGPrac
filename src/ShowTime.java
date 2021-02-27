import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.TreeMap;

public class ShowTime {
    public static void main(String[] args)throws Exception{
        File file=new File("E:\\临时\\demo.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        TreeMap<String,Integer> tm = new TreeMap<>();

        while((line=br.readLine())!=null){
            line.toLowerCase();
            String reg1="\\s+";
            String reg2 ="\\w+";
            String[] str = line.split(reg1);
            for(String s: str){
                if(s.matches(reg2)){
                    if(!tm.containsKey(s)){
                        tm.put(s,1);
                    }else{
                        tm.put(s,tm.get(s)+1);
                    }
                }
            }
        }
        String input;
        Scanner sc = new Scanner(System.in);
        input = sc.next();
        System.out.printf("%s在文件中出现了%d次",input,tm.get(input));
    }
}
