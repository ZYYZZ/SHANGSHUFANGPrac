import java.util.HashMap;

public class OnlyChar {
    public static void main(String[] args){
        int[] num = {2,8,6,2,7,3,9,2,8,6,7,9,1};
        int i = 0;
        HashMap<Integer,Integer> tempnum = new HashMap<>();
        for (int n:num){
            tempnum.put(n,0);
        }
        for (int n:num) {
            tempnum.put(n,tempnum.get(n)+1);
        }
        System.out.print("只出现一次的数字是");
        int[] n = new int[10];
        for(int temp:tempnum.keySet()){
            if(tempnum.get(temp) == 1){
                n[i] = temp;
                i++;
            }
        }
        if(i!=0){
            System.out.print(n[0]);
        }
        if(i>=1){
            for(int j = 1;j<i;j++){
                System.out.print('和');
                System.out.print(n[j]);
            }
        }
    }
}
