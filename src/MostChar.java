import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

public class MostChar {
    public static void main(String[] args){
        int i = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> charmap = new HashMap<>();

        while(i<s.length()){
            charmap.put(s.charAt(i),0);
            i++;
        }
        i = 0;
        while(i<s.length()){
            charmap.put(s.charAt(i),charmap.get(s.charAt(i))+1);
            i++;
        }

        Map.Entry<Character,Integer> maxEntry = null;

        for(Map.Entry<Character,Integer> entry : charmap.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }

        ArrayList<Character> maxchar = new ArrayList<>();

        for(Map.Entry<Character,Integer> entry : charmap.entrySet()) {
            if (entry.getValue().equals(maxEntry.getValue())) {
                maxchar.add(entry.getKey());
            }
        }

//        System.out.println(maxchar.toString());
        for(char c: maxchar){
            s = s.replaceAll(String.valueOf(c),"");
        }

        System.out.println(s);
    }
}
