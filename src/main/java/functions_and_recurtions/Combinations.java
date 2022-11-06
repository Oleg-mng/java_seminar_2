package functions_and_recurtions;

public class Combinations {
    class Solution {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            Integer[] comb = new Integer[k];
            ans.add(Arrays.asList(comb));
            if (n == 0) {
                return ans;
            }
            else {
                return combine(n-1, k);
            }
        }
    }


