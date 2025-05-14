
import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your character:");
        char ch=sc.next().toLowerCase().charAt(0);

        if(ch == 'a' || ch=='e' || ch=='0' || ch=='u'){
            System.out.println("It is Vowel");

        }else{
            System.out.println("It is not Vowel");
        }
    }
}
