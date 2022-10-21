/*
* Shreyas Potnuru
* AP Program Practice 1
* Loop AP Practice (Master Order)
*/

import java.util.ArrayList;
import java.util.List;

public class MasterOrderA{
    private List<CookieOrder> orders;

    public MasterOrderA() { orders = new ArrayList<CookieOrder>(); } // object

    public void addOrder(CookieOrder theOrder) { orders.add(theOrder); } // add CookieOrder object

    /**part (a)
     * @return the sum of the number of boxes of all of the cookie orders
     */
    public int getTotalBoxes(){ // count all the boxes in each CookieOrder object and return
        int count = 0;
        for(CookieOrder c : orders){
            count += c.getNumBoxes();
        }
        return count;
    }

    public static void main(String[] args){ // main test
        boolean test1 = false;
        boolean test2 = false;

        MasterOrderA order = new MasterOrderA();

        if(order.getTotalBoxes() == 0)
            test1 = true;
        else
            System.out.println("Oops! Looks like your code doesn't properly check to see if the master order is empty.\n");


        order.addOrder(new CookieOrder("Raisin", 3));
        order.addOrder(new CookieOrder("Oatmeal", 8));

        if(order.getTotalBoxes() == 11)
            test2 = true;
        else
            System.out.println("Oops! Looks like your code doesn't properly count the number of boxes in the master order.\n");

        if(test1 && test2)
            System.out.println("Looks like your code works well!");
        else
            System.out.println("Make some changes to your code, please.");
    }
}

/* Output:
Looks like your code works well!
 */
