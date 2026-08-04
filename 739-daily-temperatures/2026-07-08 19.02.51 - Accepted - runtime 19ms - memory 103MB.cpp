class Solution {
public:
    vector<int> dailyTemperatures(vector<int>& temp) {
        int i = temp.size()-1;
        stack<int> st;
        st.push(i--);
        vector<int> ans(temp.size(), 0);
        while(i >= 0) {
            while(!st.empty() && temp[st.top()] <= temp[i]) {
                st.pop();
            }
            ans[i] = st.empty() ? 0 : st.top() - i;
            st.push(i--);
        }
        return ans;
    }
};