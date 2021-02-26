import java.util.HashMap;
import java.util.Scanner;

public class LoginByMap {
    public static void main(String[] args){
        HashMap<String,String> users = new HashMap<>();
        users.put("admin","admin@123");
        users.put("guess","123456");
        users.put("my","my_666");
        String inputuser,inputpassword;
        String localpassword = null;
        Scanner sc = new Scanner(System.in);
        inputuser = sc.nextLine();
        inputpassword = sc.nextLine();
        for(String usertemp: users.keySet()){
            if(usertemp.equals(inputuser)){
                localpassword = users.get(usertemp);
            }
        }
        if(localpassword == null){
            System.out.print("您输入的账号或密码不正确");
        }else {
            if(localpassword.equals(inputpassword)){
                System.out.print("登录成功");
            }else{
                System.out.print("您输入的账号或密码不正确");
            }
        }
    }
}
