import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=0,e=0,i=0,o=0,u=0;
        try{
            System.out.println("Welcome to vowels program");
        System.out.println("Enter the String:");
        String str=s.next().toLowerCase();
        for(int j=0;j<str.length();j++){
            switch(str.charAt(j)){
                case 'a':{a++;break;}
                case 'e':{e++;break;}
                case 'i':{i++;break;}
                case 'o':{o++;break;}
                case 'u':{u++;break;}
            }
        }
        int tot=a+e+i+o+u;
        System.out.println("Total number of vowels in the String is :"+tot);
        if(tot>0){
            System.out.println("Number of repetions\na:"+a+"\ne:"+e+"\ni:"+i+"\no:"+o+"\nu:"+u);
        }
        }catch(Exception ex){
            System.err.println("Enter correct String");
        }
        finally{
            s.close();
        }
    }
}
