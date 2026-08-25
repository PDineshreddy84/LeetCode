class Solution {
    public String minWindow(String s, String t) {
        int n1 = t.length();
        int n2 = s.length();
        if (n1 > n2) return "";
        int[] c1 = new int[128];
        int[] c2 = new int[128];
        for (int i = 0; i < n1; i++) {
            c1[t.charAt(i)]++;
        }
        int l = 0;
        int ml = Integer.MAX_VALUE;
        String res = "";
        for (int r = 0; r < n2; r++) {
            c2[s.charAt(r)]++;
            while (find(c1, c2)) {
                if (r - l + 1 < ml) {
                    ml = r - l + 1;
                    res = s.substring(l, r + 1);
                }
                c2[s.charAt(l)]--;
                l++;
            }
        }
        return res;
    }
    boolean find(int[] c1, int[] c2) {
        for (int i = 0; i < 128; i++) {
            if (c2[i] < c1[i]) {
                return false;
            }
        }
        return true;
    }
}