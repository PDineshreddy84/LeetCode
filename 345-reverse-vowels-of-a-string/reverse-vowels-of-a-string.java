class Solution {
    public String reverseVowels(String s) {
        String v="AEIOUaeiou";
        int l=0,r=s.length()-1;
        char arr[]=s.toCharArray();
        while(l<r){
            while(l<r && !v.contains(arr[l]+"")){
                l++;
            }
            while(l<r && !v.contains(arr[r]+"")){
                r--;
            }
            char t=arr[l];
            arr[l]=arr[r];
            arr[r]=t;
            l++;
            r--;
        }
        return new String(arr);
    }
}