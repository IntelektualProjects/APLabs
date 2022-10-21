import java.util.List;
import java.util.ArrayList;

class CookieOrder{
    private int numBoxes;
    private String variety;

    /** Constructs a new CookieOrder object */
    public CookieOrder(String variety, int numBoxes) {
        this.variety = variety;
        this.numBoxes = numBoxes;
    }

    /** @return the variety of cookie being ordered
     */
    public String getVariety()
    { return this.variety; }
    /** @return the number of boxes being ordered
     */
    public int getNumBoxes()
    { return this.numBoxes; }
    // There may be instance variables, constructors, and methods that are not shown.
}


