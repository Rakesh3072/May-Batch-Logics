
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your character:");
        char ch=sc.next().charAt(0);

        if(Character.isUpperCase(ch)){
            System.out.println(ch +"is upper.");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println(ch+"is Lower.");
        }
        else if(Character.isDigit(ch)){
            System.out.println(ch+"is digit.");
        }
        else {
            System.out.println(ch+"is special Character");
        }
    }
}
