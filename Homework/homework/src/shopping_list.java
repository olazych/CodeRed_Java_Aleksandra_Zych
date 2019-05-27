import java.util.Scanner;

public class shopping_list {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String item_1_name;
        String item_2_name;
        double item_1_price;
        double item_2_price;
        int item_1_quantity;
        int item_2_quantity;
        int item_1_coupon;
        int item_2_coupon;


        System.out.println("Enter the name of item: ");
        item_1_name = console.next();

        System.out.println("Enter the price of " + item_1_name);
        item_1_price = console.nextDouble();

        System.out.println("Enter the quantity: ");
        item_1_quantity = console.nextInt();

        double total_cost_1 = item_1_price * item_1_quantity;

        System.out.println("Enter the name of next item: ");
        item_2_name = console.next();

        System.out.println("Enter the price of " + item_2_name);
        item_2_price = console.nextDouble();

        System.out.println("Enter the quantity: ");
        item_2_quantity = console.nextInt();

        double total_cost_2 = item_2_price * item_2_quantity;

        System.out.println("Total cost of " + item_1_name + " is " + total_cost_1);
        System.out.println("Total cost of " + item_2_name + " is " + total_cost_2);

        System.out.println("Enter the coupon for " + item_1_name + " as a %)");
        item_1_coupon = console.nextInt();

        System.out.println("Enter the coupon for " + item_2_name + "(as a %)");
        item_2_coupon = console.nextInt();

        double final_cost_1 = total_cost_1 - ((total_cost_1 * item_1_coupon) / 100);
        double final_cost_2 = total_cost_2 - ((total_cost_2 * item_2_coupon) / 100);

        System.out.println("Final cost of " + item_1_name + " is " + final_cost_1);
        System.out.println("Final cost of " + item_2_name + " is " + final_cost_2);


    }

    private static void printTotalCost(String itemName, double totalCost) {
        System.out.println("Total cost of " + itemName + " is " + totalCost);
    }

    private static void printCouponRate(String itemName, int coupon) {
        System.out.println("coupon rate for " +itemName+ " is "+ coupon);
    }


    private static void printFinalCost (String itemName, double totalCost, int coupon){
        double finalCost = totalCost - ((totalCost * coupon)/100);
        System.out.println("Final cost of " + itemName + " is " + finalCost);
    }

    private static void printCostStatistics(double finalCost1, double finalCost2){
        System.out.println("****** Cost statistics ******");
        System.out.println("Most expensive item costs : " + Math.max(finalCost1, finalCost2));
        System.out.println("Cheapest item costs : " + Math.min(finalCost1, finalCost2));
    }

    private static void printCouponStatistics(int coupon1, double coupon2){
        System.out.println("****** Coupon statistics ******");
        System.out.println( Math.max(coupon1, coupon2) + " percent off is awesome !!") ;
        //TOOD: print message "X percent off is awesome !!" where X is bigger discount coupon.
    }

}
