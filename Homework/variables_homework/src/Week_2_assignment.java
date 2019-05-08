import java.util.Scanner;
public class Week_2_assignment {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String item_1_name;
        String item_2_name ;
        double item_1_price;
        double item_2_price;
        int item_1_quantity;
        int item_2_quantity;
        int item_1_coupon ;
        int item_2_coupon ;


        System.out.println("Enter the name of item: ");
        item_1_name = console.next();
        System.out.println("Enter the price of "+ item_1_name);
        item_1_price = console.nextDouble();
        System.out.println("Enter the quantity: ");
        item_1_quantity = console.nextInt();
        double total_cost_1 = item_1_price*item_1_quantity;
        System.out.println("Enter the name of next item: ");
        item_2_name = console.next();
        System.out.println("Enter the price of "+ item_2_name);
        item_2_price = console.nextDouble();
        System.out.println("Enter the quantity: ");
        item_2_quantity = console.nextInt();
        double total_cost_2 = item_2_price*item_2_quantity;
        System.out.println("Total cost of "+item_1_name +" is "+ total_cost_1);
        System.out.println("Total cost of "+item_2_name +" is "+ total_cost_2);

        System.out.println("Enter the coupon for (as a %)" + item_1_name);
        item_1_coupon = console.nextInt();
        System.out.println("Enter the coupon for (as a %)" + item_2_name);
        item_2_coupon = console.nextInt();



        double final_cost_1 = total_cost_1 - ((total_cost_1*item_1_coupon)/100);
        double final_cost_2 = total_cost_2-((total_cost_2*item_2_coupon)/100);

        System.out.println("Final cost of "+item_1_name +" is "+final_cost_1);
        System.out.println("Final cost of "+item_2_name +" is " + final_cost_2);


    }
}
