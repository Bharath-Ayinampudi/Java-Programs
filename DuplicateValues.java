import java.util.Scanner;
public class DuplicateValues{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the first String:");
        String s1 = s.nextLine();
        System.out.println("Enter the second String:");
        String s2 = s.nextLine();
        String result="";
        int j = 0;
        String small = s1.length()>s2.length()?s2:s1;
        String large = s1.length()>s2.length()?s1:s2;
        for(int i=0;i<small.length();i++){
            String c = Character.toString(small.charAt(i));
            if(large.contains(c) && !(result.contains(c))){
                result += c;
                j++;
            }
        }
        System.out.println("Total duplicate values:"+result+" numbers:"+j);

        s.close();
    }
}