class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        Integer[] comb = new Integer[k];
        //comb.add(0, 0);
        //comb.add(Integer.valueOf(n, k)) // Необходимо сделать запись в comb,
        ans.add(Arrays.asList(comb));
        if (n == 0) {
            return ans;
        }
        else {
            return combine(n-1, k);
        }
        // else if{
        //    return combine(n-1, k-1);
        // }
    }
}