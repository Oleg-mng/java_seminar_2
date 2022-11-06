package functions_and_recurtions;

class Solution {

    public double myPow(double x, int n) {
        double num = x;
        boolean negat = n < 0;
        int pow = negat ? -1:1;
        if (n ==0) {
            return 1;
        }
        while ((!negat && pow < n/2) || (negat && pow > n/2)){
            pow += pow;
            num = num * num;
        }

        return negat ? (1/num) * myPow(x,n-pow) : num * myPow(x,n-pow) ;

    }
}






//public class Pow_x_n {
//    public static void main (double x, int n) {
//        myPow (2, 10);

//    }
////    class Solution {
////        public double myPow(double x, int n) {
////
////        }
//    public double myPow (double x, int n) {
//        double p = n/2;
//        double half = x ** p;
////        Math math;
////        double half = math.pow (x, n/2);
//        System.out.println(half);
//        if (x == 0) return x;
//        if (x == 1) return x;
//        if (n < 2) return half;
//        if ((n/2) %2 = 0) {
//            System.out.println(half*half);
//            myPow(x, n/2);
//        }
//        if ((n/2)%2 != 0) {
//            System.out.println(half*half*x);
//            myPow(x*x, n/2);
//        }
//}
////}
//public class Pow_x_n {
//    public static double pow(double x, int n) {
//        if (n == 1) {
//            return x;
//        }
//        else {
//                return x * pow(x, n - 1);
//            }
//        }
//    }
