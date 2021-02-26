import java.io.File;
import java.util.Scanner;

public class OutFileName {
    public static void main(String[] args){
        String dir_name;
        Scanner sc = new Scanner(System.in);
        dir_name = sc.nextLine();
        File[] files = new File(dir_name).listFiles();
        for(File file_name:files){
            System.out.println(file_name.getAbsolutePath());
        }
    }
}
