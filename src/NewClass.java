public class NewClass {

    public static void main (String[] argv)
    {
        double [] y = {2, 3, 4, 5, 7, 6};
 //       boolean isUni = isUnimodal (y);
 //       System.out.println ("isUnimodal=" + isUni);
        boolean isMono = isMonotonic(y);
        System.out.println ("isMonotonic=" + isMono);
    
    }
//    static boolean isUnimodal (double[] y)
//    {
//        int bump = 0;
//        int valley = 0;
//        for (int i=0; i<y.length; i++) {
//            if ((y[i] < y[i+1]) && (y[i] < y[i-1])) {
//                valley++;
//                }
//                if ((y[i] > y[i+1]) && (y[i] > y[i-1])) {
//                    bump++;
//                }
//        }
//        if ((bump != 0) || (valley !=0)) {
//            return true;
//        }
//        return false;
//    }
    static boolean isMonotonic (double[] y)
    {
        if (y.length <= 2) {
            return true;
        }
        boolean increasing = true;
        boolean decreasing = true;
        for (int i=1; i<y.length; i++) {
            if (y[i-1] > y[i]) {
                increasing = false;
            }
            else if (y[i-1] < y[i]) {
                decreasing = false;
            }
            if (!increasing && !decreasing) {
                return false;
            }
        }
        return true;
    }
    
}