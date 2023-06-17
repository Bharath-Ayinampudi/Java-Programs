import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String rev= "".toUpperCase();
        try{
            System.out.println("Welcome to the palindrome project");
            System.out.println("Enter the text you want to check:");
            String in=s.next().toUpperCase();
            // System.out.println("Lenght of the String is :"+in.length());
            if(in!=null){
            for (int i=(in.length()-1);i>=0;i--){
                rev=rev+in.charAt(i);
            }
            if(in.equals(rev)){
                System.out.println("Given String is a palindrome");
            }
            else{
                System.out.println("Given String is not a palindrome");
            }
        
            }

        }catch(Exception e){
            System.err.println("Enter the correct string");
        }
        finally{
            s.close();
        }
    }
}
