class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        // count total zeros and ones
        int zeros = 0, ones = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') zeros++;
            else ones++;
        }
        int minCount = Math.min(zeros, ones);
        if (minCount == 0) return 0; // no possible balanced substring

        // longest balanced substring without any swap
        // prefix balance: +1 for '1', -1 for '0'
        int[] prefix = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + (s.charAt(i) == '1' ? 1 : -1);
        }

        java.util.HashMap<Integer, Integer> firstSeen = new java.util.HashMap<>();
        int longestNoSwap = 0;
        for (int i = 0; i <= n; i++) {
            int bal = prefix[i];
            if (firstSeen.containsKey(bal)) {
                longestNoSwap = Math.max(longestNoSwap, i - firstSeen.get(bal));
            } else {
                firstSeen.put(bal, i);
            }
        }

        // With at most one swap, we can increase a balanced substring length by at most 2,
        // but cannot exceed 2 * minCount (total available pairs).
        int ans = Math.min(2 * minCount, longestNoSwap + 2);
        return ans;
    }
}
