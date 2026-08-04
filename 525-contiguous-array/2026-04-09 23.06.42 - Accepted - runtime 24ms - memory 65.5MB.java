class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0,-1);
        int maxLen = 0;
        for(int i  = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){
                sum++;
            }
            else{
                sum--;
            }
            if(map.containsKey(sum)){
                maxLen = Math.max(maxLen , i - map.get(sum));
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;
    }
}



