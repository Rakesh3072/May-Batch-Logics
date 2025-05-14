import java.util.Scanner;

public class Demo5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your start:");
        int i = sc.nextInt();
        System.out.print("Enter Your end:");
        int n = sc.nextInt();
        

        while (i <= n) {
            if(i % 2 == 0)
                System.out.println("i: "+i);
            
            i++;
        }
    }
}