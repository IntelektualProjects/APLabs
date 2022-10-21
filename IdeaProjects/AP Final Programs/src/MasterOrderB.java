/*
 * Shreyas Potnuru
 * AP Program Practice 1
 * Loop AP Practice (Master Order)
 */

import java.util.ArrayList;
import java.util.List;

public class MasterOrderB{
    private List<CookieOrder> orders;

    public MasterOrderB() { orders = new ArrayList<CookieOrder>(); } // constructor

    public void addOrder(CookieOrder theOrder) { orders.add(theOrder); } // Adds CookieOrder object to List

    public int getTotalBoxes(){ // copy from part a
        int count = 0;
        for(CookieOrder c : orders){
            count += c.getNumBoxes();
        }
        return count;
    }

    public int removeVariety(String cookieVar){ // removes variety of cookie specified from list and returns amount of boxes removed
        int removed = 0;
        for(int i = 0; i < orders.size(); i++){
            if(orders.get(i).getVariety().equals(cookieVar)){
                removed += orders.get(i).getNumBoxes(); // count boxes removed
                orders.remove(i); // removed from List
            }
        }
        return removed;
    }

    public static void main(String[] args){ // main testing
        boolean test1 = false;
        boolean test2 = false;

        MasterOrderB order = new MasterOrderB();
        order.addOrder(new CookieOrder("Raisin", 3));
        order.addOrder(new CookieOrder("Oatmeal", 8));
        order.addOrder(new CookieOrder("Sugar", 2));

        if(order.removeVariety("Raisin") == 3 && order.removeVariety("Sugar") == 2)
            test1 = true;
        else
            System.out.println("Oops! Looks like your code doesn't return the correct value for cookie order varieties that exist.\n");

        if(order.removeVariety("Chocolate Chip") == 0)
            test2 = true;
        else
            System.out.println("Oops! Looks like your code doesn't return the correct value for cookie orders that don't exist in the master order.\n");

        if(test1 && test2)
            System.out.println("Looks like your code works well!");
        else
            System.out.println("Make some changes to your code, please.");
    }
}
/* Output:
Looks like your code works well!
 */
