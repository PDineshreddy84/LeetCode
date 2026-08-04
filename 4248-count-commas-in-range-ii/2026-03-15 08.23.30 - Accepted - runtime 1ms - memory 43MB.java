class Solution {
    public long countCommas(long n) {
        long commas = 0;
        long start = 1000;
        int k = 1;
        while (start <= n) {
            long end = start * 1000 - 1;
            long count = Math.min(n, end) - start + 1;
            commas += count * k;
            start *= 1000;
            k++;
        }
        return commas;
    }
}