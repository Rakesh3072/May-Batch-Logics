import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Marks of python:");
         double python=sc.nextDouble();
         System.out.println("enter marks of java:");
         double java=sc.nextDouble();
         System.out.println("enter marks of DSA");
         double dsa=sc.nextDouble();

         if(python >40&& java >=40&& dsa >40){
            double total =python+java+dsa;
            double percentage=(total/3);
            System.out.println("%:"+percentage);
            if(percentage>90&& percentage<=100){
                System.out.println("Distinction Class");
            }else if(percentage>80&& percentage<=90){
                System.out.println("First clsss");
                
            }else if(percentage>70&& percentage<=80){
                System.out.println("second class");
            }
         }
    }
}
