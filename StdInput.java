import java.util.ArrayList;
import java.util.Scanner;
public class StdInput {
    public static void main(String[] args) {
        ArrayList<String> list = readInput();        
        System.out.println(list);
    }
    static ArrayList<String> readInput(){
        ArrayList<String> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            String data = s.nextLine();
            list.add(data);
            // System.out.println(data);
        }
        s.close();
        return list;
    }
}
