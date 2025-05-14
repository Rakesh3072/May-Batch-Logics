import java.util.Scanner;

public class Demo6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your start:");
        int i = sc.nextInt();
        System.out.print("Enter Your end:");
        int n = sc.nextInt();
        
        int sum = 0;
        while (i <= n){
            sum += i;
            i++;
        }
           System.out.println("sum:"+sum);
    }
}