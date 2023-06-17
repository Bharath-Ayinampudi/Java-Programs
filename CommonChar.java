import java.util.Scanner;
public class CommonChar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("ENter the String 1:");
        String s1 = s.nextLine();

        System.out.println("Enter the String 2:");
        String s2 = s.nextLine();

        String shorter = s1.length()>s2.length()?s2:s1;
        String longer = shorter.equals(s1)?s2:s1;

        String result="";

        for(int i=0;i<shorter.length();i++){
            String c =Character.toString(shorter.charAt(i)) ;
            if(longer.contains(c)) result+=c;;
        }

        System.out.println("Common characters :"+ result);

        s.close();
    }    
}
