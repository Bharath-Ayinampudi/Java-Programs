import java.util.*;
public class repeatedLetters{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String:");
        String input = s.nextLine();
        Map<Character,Integer> map = new HashMap<>();        
        for(int i=0;i<input.length();i++){
                Character c = input.charAt(i);
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }else{
                    map.put(c, 1);
                }
        }
        for(Map.Entry<Character,Integer> m : map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey()+" is repeated for "+m.getValue()+" times");
            }
        }
        s.close();
    }
}