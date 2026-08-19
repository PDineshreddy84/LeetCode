class Solution {
    public int maxNumberOfFamilies(int n, int[][] r) {
        Map<Integer, Set<Integer>> m = new HashMap<>();
        for (int[] row : r) {
            m.computeIfAbsent(row[0], k -> new HashSet<>()).add(row[1]);
        }
        int ans = (n - m.size()) * 2;
        for (Set<Integer> s : m.values()) {
            boolean left=!s.contains(2)&&!s.contains(3)&&!s.contains(4)&&!s.contains(5);
            boolean middle=!s.contains(4)&&!s.contains(5)&&!s.contains(6)&&!s.contains(7);
            boolean right=!s.contains(6)&&!s.contains(7)&&!s.contains(8)&&!s.contains(9);
            if (left && right) {
                ans += 2;
            } 
            else if (left || middle || right) {
                ans += 1;
            }
        }
        return ans;
    }
}