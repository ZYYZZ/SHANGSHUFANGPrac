import java.lang.reflect.Array;
import java.util.Arrays;

public class ElementChange2 {
    public static void main(String[] args){
        int[] n = {3,1,9,8,0,4,6,7};
        swap(n);
        System.out.println(Arrays.toString(n));
    }

    public static int[] swap(int[] n){
        int index_max = 0,index_min = 0,x;
        for (int i = 1;i<n.length-1;i++) {
            if(n[i] > n[index_max]){
                index_max = i;
            }
            if(n[i] < n[index_min]){
                index_min = i;
            }
        }
        x = n[0];
        n[0] = n[index_max];
        n[index_max] = x;

        x = n[n.length-1];
        n[n.length-1] = n[index_min];
        n[index_min] = x;
        return n;
    }
}
