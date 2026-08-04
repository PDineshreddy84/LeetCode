class Solution {
    public int maxNumberOfBalloons(String s) {
        int[] f = new int[5];
        String t = "balon";
        for (int i = 0; i < s.length(); i++)
            for (int j = 0; j < 5; j++)
                if (s.charAt(i) == t.charAt(j))
                    f[j]++;
        f[2] /= 2;
        f[3] /= 2;
        return Arrays.stream(f).min().getAsInt();
    }
}