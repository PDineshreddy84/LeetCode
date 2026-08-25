class Solution {
    public String minWindow(String s, String t) {
        if (t.length() > s.length()) return "";
        int[] need = new int[128];
        int[] window = new int[128];
        for (char ch : t.toCharArray()) {
            need[ch]++;
        }
        int left = 0;
        int required = t.length();
        int minLength = Integer.MAX_VALUE;
        int start = 0;
        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            window[ch]++;
            if (window[ch] <= need[ch]) {
                required--;
            }
            while (required == 0) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    start = left;
                }
                char leftChar = s.charAt(left);
                window[leftChar]--;
                if (window[leftChar] < need[leftChar]) {
                    required++;
                }
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLength);
    }
}