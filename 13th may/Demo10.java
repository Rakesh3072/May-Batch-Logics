import java.util.Scanner;

public class Demo10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Your number:");
         int n = sc.nextInt();
        
         boolean isPrime=true;
        int i = 2;
          while (i < n){
           if(n % i ==0){
            isPrime = false;
           }
           i++;
          }
          if (isPrime){
            System.out.println(n+"is Prime");
          }else{
            System.out.println(n+"is not prime");
          }
        }
    }
