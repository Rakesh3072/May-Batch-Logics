import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.print("Entter a:");
        int a=sc.nextInt();

        System.err.print("Enter b:");
        int b=sc.nextInt();

        System.err.print("Enter c:");
        int c=sc.nextInt();

        if (a>b){
            if(a>b){
                System.out.println("A is Max");
            } else{
                System.out.println("C is Max");
            }
        }else{
            if(a>c){
                System.out.println("b is Max");
            }else{
                System.out.println("c is Max");
            }
        }
    }
}
