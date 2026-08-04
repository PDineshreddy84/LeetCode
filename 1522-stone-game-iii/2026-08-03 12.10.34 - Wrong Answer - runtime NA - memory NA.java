class Solution {
    Integer dp[];
    public String stoneGameIII(int[] s) {
        int t = 0;
        for (int i : s)
            t += i;
        dp=new Integer[s.length];
        int a = solve(s, 0, s.length);
        return t - a == a ? "Tie" : ((a > (t - a)) ? "Alice" : "Bob");
    }

    int solve(int stone[], int i, int n) {
        if (i >= n) {
            return 0;
        }
        if(dp[i]!=null)return  dp[i];
        int mx = Integer.MIN_VALUE, sum = 0;
        for (int j = i ; j < 3 + i && j < n; j++) {
            int mn = Integer.MAX_VALUE;
            sum += stone[j];
            for (int z = j + 1; z <= 3 + j && z < n; z++) {
                mn = Math.min(mn, solve(stone, z + 1, n) );
            }
            mx = Math.max(mx, mn + sum);
        }
        return dp[i]=mx;
    }
}