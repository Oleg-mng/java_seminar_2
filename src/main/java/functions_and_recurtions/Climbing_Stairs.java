package functions_and_recurtions;

// Вариант 1
public class Climbing_Stairs {
    public static int main (String[] args) {
        private static int climbStairs(int n) {
                if ( n == 0)
                    return 1;
                else if (n < 0)
                    return 0;
                else
                    return climbStairs(n - 2)
                            + climbStairs(n - 1);
        }
}


// Вариант 2
//public class Climbing_Stairs {
//    public static void main (String[] args) {
//        System.out.println("Возможные варианты переходов по лестнице");
//        StairsUp("Step 1", 0);
//
//    }
//    public static void StairsUp (String path, int count) {
//        int n = 4; // условие задачи
//        if (count > n) return;
//        System.out.print(path + " ");
//        if (count == n-1) System.out.println();
//        StairsUp("Step 1", count+1);
//        StairsUp("Step 2", count+2);
//    }
//}

// Вариант 3
//class Solution {
//    public int climbStairs(int n) {
//        int res = 0;
//        int count = 0;
//        if (res > n) {
//            return count;
//        }
//        count++;
//        return climbStairs(res+1);
//        count++;
//        return climbStairs(res+2);
//    }
//}


