import java.util.Scanner;
public class Demo{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price:");
        double costPrice = sc.nextDouble();
        System.out.print("Enter selling price:");
        double sellingprice = sc.nextDouble();

        double profitOrloss = sellingprice - costPrice;

        if(profitOrloss >0) {
            System.out.println("Profit:"+ profitOrloss);
            System.out.println("Profit%:"+(profitOrloss/costPrice)*100);            

        } else{
            System.out.println("Loss "+(-profitOrloss)+"Rs.");
            System.out.println("Loss");
        }

    }
}