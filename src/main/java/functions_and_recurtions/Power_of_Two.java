package functions_and_recurtions;

public class Power_of_Two {

    class Solution {
        public boolean isPowerOfTwo(int n) {
            if (n == 1) {
                return true;
            } else if (n % 2 != 0 || n == 0) {
                return false;
            } else {
                return isPowerOfTwo(n / 2);
            }
        }
    }
}





//     while (n > 0) {
//        if (n == 1) {
//            return true;
//        }
//        if (n % 2 == 0) {
//            return true;
//        }
//        else {
//            return false;
//        }
//        isPowerOfTwo(n/2);
//
//    }
//}
//}
