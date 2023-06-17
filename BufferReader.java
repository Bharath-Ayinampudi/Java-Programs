
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(reader);
        String line=s.nextLine();
        while((line=bf.readLine())!=null){
            list.add(line);
        }
        System.out.println(list);
        s.close();
    }
}
