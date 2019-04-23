public class Week_2_assignment {
    public static void main(String[] args) {
        String item_1_name = "Item1";
        String item_2_name = "Item2";
        int item_1_price= 309;
        int item_2_price=71;
        int item_1_quantity=1;
        int item_2_quantity=1;
        int total_cost_1 = item_1_price*item_1_quantity;
        int total_cost_2 = item_2_price*item_2_quantity;
        int item_1_coupon = 20;
        int item_2_coupon = 15;
        int final_cost_1 = total_cost_1 - ((total_cost_1*item_1_coupon)/100);
        int final_cost_2 = total_cost_2-((total_cost_2*item_2_coupon)/100);
        System.out.println("Total cost of "+item_1_name +" is "+ total_cost_1);
        System.out.println("Total cost of "+item_2_name +" is "+ total_cost_2);
        System.out.println("Final cost of "+item_1_name +" is "+final_cost_1);
        System.out.println("Final cost of "+item_2_name +" is " + final_cost_2);

        //with double variables
        double item_1_price_d = 309.00;
        double item_2_price_d = 71.00;
        double total_cost_1_d = item_1_price_d*item_1_quantity;
        double total_cost_2_d = item_2_price_d*item_2_quantity;
        double final_cost_1_d = total_cost_1 - ((total_cost_1_d*item_1_coupon)/100);
        double final_cost_2_d = total_cost_2-((total_cost_2_d*item_2_coupon)/100);
        System.out.println("Accurate total cost of "+item_1_name +" is "+ total_cost_1_d);
        System.out.println("Accurate total cost of "+item_2_name +" is "+ total_cost_2_d);
        System.out.println("Accurate final cost of "+item_1_name +" is "+final_cost_1_d);
        System.out.println("Accurate final cost of "+item_2_name +" is "+ final_cost_2_d);

    }
}
