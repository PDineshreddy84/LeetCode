class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        Arrays.sort(people);
        int l=0,r=n-1,b=0;
        while(l<=r){
            if(people[l]+people[r]<=limit){
                b++;
                l++;
                r--;
            }
            else{
                r--;
                b++;
            }
        }
        return b;
    }
}