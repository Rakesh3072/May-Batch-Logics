
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        int a=sc.nextInt();
        System.out.println("enter b:");
        int b=sc.nextInt();
        System.out.println("enter c:");
        int c=sc.nextInt();

        int max =(a>b)? (a>c)?a:c : (b>c)?b:c;
        System.out.println("max element is"+max);
    }
}
