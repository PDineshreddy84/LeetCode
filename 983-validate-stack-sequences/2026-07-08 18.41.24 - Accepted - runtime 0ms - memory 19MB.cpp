class Solution {
public:
    bool validateStackSequences(vector<int>& pus, vector<int>& pop) {
        int i = 0, j = 0, n = pus.size();
        stack<int> st;
        while(j < n) {
            while(i < n && j < n && pus[i] != pop[j]) {
                st.push(pus[i++]);
            }
            j++;
            i++;
            while(j<n && !st.empty() && st.top() == pop[j]) {
                j++;
                st.pop();
            }
        }
        return st.empty();
    }
};