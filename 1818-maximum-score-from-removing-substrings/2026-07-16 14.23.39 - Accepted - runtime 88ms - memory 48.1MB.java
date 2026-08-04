class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return solve(s.toCharArray(), 'b', 'a', x, y);
        }
        return solve(s.toCharArray(), 'a', 'b', y, x);
    }

    int solve(char arr[], char high, char low, int h, int l) {
        Stack<Character> st = new Stack<>();
        Stack<Character> stt = new Stack<>();
        int sc = 0;
        for (char ch : arr) {
            if (ch == high) {
                if (st.size() > 0 && st.peek() == low) {
                    st.pop();
                    sc += h;
                } else {
                    st.push(ch);
                }
            } else {

                st.push(ch);
            }

        }
        String an = "";

        for (char ch : st) {
            if (ch == low) {
                if (stt.size() > 0 && stt.peek() == high) {
                    stt.pop();
                    sc += l;
                } else {
                    stt.push(ch);
                }
            } else {
                stt.push(ch);
            }
        }
        return sc;
    }
}