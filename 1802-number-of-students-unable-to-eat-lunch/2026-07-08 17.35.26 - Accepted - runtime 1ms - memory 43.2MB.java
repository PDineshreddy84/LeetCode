class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length,s1=0,s0=0;
        Stack<Integer>st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            st.push(sandwiches[i]);
            if(students[i]==0){
                s0++;
            }
            else{
                s1++;
            }
        }
        while(st.size()>0){
            if(st.peek()==0 && s0>0){
                s0--;
                st.pop();
            }
            else if(st.peek()==1 && s1>0){
                s1--;
                st.pop();
            }
            else{
                break;
            }
        }
        return st.size();
    }
}