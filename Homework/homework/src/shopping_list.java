import java.util.*;

public class shopping_list {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int number_of_items;
        int coupon;
        List<String> itemsName = new ArrayList<>();
        List<Double> itemsPrice = new ArrayList<>();
        List<Integer> itemsQuantity = new ArrayList<>();
        List<Integer> itemsCoupons = new ArrayList<>();
        List<Double> totalCosts = new ArrayList<>();
        double finalCost = 0;
        String temp;

        System.out.println("Enter the number of items ");
        number_of_items = console.nextInt();

        for( int i=0; i<number_of_items; i++ )
        {
            do {
                System.out.println("Enter the name of item no: " +(i+1));
                temp = console.next();
                if (temp.length() > 10)
                {
                    System.out.println("Name is too long");
                }

            }while (temp.length() > 10);

            itemsName.add(temp);

            System.out.println("Enter the price of " + itemsName.get(i));
            itemsPrice.add(console.nextDouble());

            System.out.println("Enter the quantity of " + itemsName.get(i));
            itemsQuantity.add(console.nextInt());

            System.out.println("Enter the coupon for " + itemsName.get(i) + " as a %");
            itemsCoupons.add(console.nextInt());

        }

        for (int i=0; i< number_of_items; i++)
        {
            totalCosts.add(itemsPrice.get(i) * itemsQuantity.get(i));
        }

        for (int i=0; i< number_of_items; i++)
        {
            finalCost += totalCosts.get(i);
        }

        System.out.println("Enter the coupon as a %");
        coupon = console.nextInt();

        printFinalCost(finalCost,coupon);

/*       ;

        System.out.println("Enter the name of next item: ");
        item_2_name = console.next();
        while (item_2_name.length() >= 11)
        {
            System.out.println("Name is too long");

            System.out.println("Enter the name of next item once again: ");
            item_2_name = console.next();
        }

        System.out.println("Enter the price of " + item_2_name);
        item_2_price = console.nextDouble();

        System.out.println("Enter the quantity: ");
        item_2_quantity = console.nextInt();

        double total_cost_2 = item_2_price * item_2_quantity;

        System.out.println("Enter the coupon for " + item_1_name + " as a %)");
        item_1_coupon = console.nextInt();

        System.out.println("Enter the coupon for " + item_2_name + "(as a %)");
        item_2_coupon = console.nextInt();

        double final_cost_1 = total_cost_1 - ((total_cost_1 * item_1_coupon) / 100);
        double final_cost_2 = total_cost_2 - ((total_cost_2 * item_2_coupon) / 100);

        printTotalCost(item_1_name,total_cost_1);
        printCouponRate(item_1_name,item_1_coupon);
        printFinalCost(item_1_name,total_cost_1,item_1_coupon);
        printTotalCost(item_2_name,total_cost_2);
        printCouponRate(item_2_name,item_2_coupon);
        printFinalCost(item_2_name,total_cost_2,item_2_coupon);*/
//        printCostStatistics(final_cost_1,final_cost_2);
//        printCouponStatistics(item_1_coupon,item_1_coupon);

    }

    private static void printTotalCost(String itemName, double totalCost) {
        System.out.println("Total cost of " + itemName + " is " + totalCost);
    }

    private static void printCouponRate(String itemName, int coupon) {
        System.out.println("coupon rate for " +itemName+ " is "+ coupon);
    }


    private static void printFinalCost (double totalCost, int coupon){
        double finalCost = totalCost - ((totalCost * coupon)/100);
        System.out.println("Final cost is " + finalCost);
    }

  /*  private static void printCostStatistics(double finalCost1, double finalCost2){
        System.out.println("****** Cost statistics ******");
        System.out.println("Most expensive item costs : " + Math.max(finalCost1, finalCost2));
        System.out.println("Cheapest item costs : " + Math.min(finalCost1, finalCost2));
    }

    private static void printCouponStatistics(int coupon1, int coupon2){
        System.out.println("****** Coupon statistics ******");
        System.out.println( Math.max(coupon1, coupon2) + " percent off is awesome !!") ;

    }*/

}
