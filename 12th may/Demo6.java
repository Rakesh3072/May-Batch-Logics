
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Monday");
        System.out.println("Tuesday");
        System.out.println("wednesday");
        System.out.println("Thursday");
        System.out.println("Friday");
        System.out.println("saturday");
        System.out.println("sunday");

        System.out.println("Enter no of day:");
        int day = sc.nextInt();

        System.out.println("enter Age:");
        int age=sc.nextInt();

        if(day >=1 && day <=5) {
            System.out.println("Weekday");
            if(age<=13){
                System.out.println("Your ticket price is 100 Rs.");
            } else if(age > 13 && age <=65){
                System.out.println("Your ticket Price is 150 Rs.");
            } else {
                System.out.println("Your ticket Price is 130 Rs.");
            }
        } else{
            System.out.println("Weekend");
            if(age <=13){
                System.out.println("Your ticket price is 120 Rs.");
            } else if ( age > 13 && age <=65) {
                System.out.println("Your ticket price is 180 Rs.");
            } else {
                System.out.println("Your ticket price is 150 Rs.");
            }
        }
    }
}
