package friendnumberspeed;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author acel
 */
public class FriendNumberSpeed {
    private static int total=0;
    private static int totalFactor;
    private static int getFactoring;
    private static int getFactoringReverse;
    private static int index=10000;

    public static void main(String[] args) {
        long executeTime = System.currentTimeMillis();
        friendCalculate();     
        executeTime = System.currentTimeMillis() - executeTime;
        System.out.println("Execute Time  : " + executeTime);
    }

    private static int factoring(int factoringNumber){
        totalFactor=0;
        for (int i = 1;i<factoringNumber ;i++ ) {
            if (factoringNumber%i==0) {
                totalFactor=totalFactor+i;
            }
        }
        return totalFactor;
    }
    
    private static void friendCalculate(){
    	for(int i =0 ; i<index;i++) {
            getFactoring=factoring(i);
            getFactoringReverse=factoring(getFactoring);
            
            if ((getFactoring != getFactoringReverse) && i==getFactoringReverse) {
                total+=getFactoringReverse;
            }
        }
        System.out.println("Friend Number Total: " + total);
    }
    
}
