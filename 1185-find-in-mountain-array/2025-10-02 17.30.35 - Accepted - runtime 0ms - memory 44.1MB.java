/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length=mountainArr.length();
        int peakIndex=findPeakIndex(0,length-1,mountainArr);
        int increasingIndex=binarySearch(0,peakIndex,target,mountainArr,false);
        if(mountainArr.get(increasingIndex)==target){
            return increasingIndex;
        }
        int decreasingIndex=binarySearch(peakIndex+1,length-1,target,mountainArr,true);
        if(mountainArr.get(decreasingIndex)==target){
            return decreasingIndex;
        }
        return -1;
    }
    public int findPeakIndex(int l,int r,MountainArray mountainArr){
        while(l<r){
            int m=l+(r-l)/2;
            if(mountainArr.get(m)<mountainArr.get(m+1)){
                l=m+1;
            }
            else{
                r=m;
            }
        }
            return l;
    }
    public int binarySearch(int l,int r,int target,MountainArray mountainArr,boolean reversed){
        while(l<=r){
            int m=l+(r-l)/2;
            if(reversed){
                if(mountainArr.get(m)==target){
                    return m;
                }
                else if(mountainArr.get(m)>target){
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }
            else{
                if(mountainArr.get(m)==target){
                    return m;
                }
                else if(mountainArr.get(m)<target){
                    l=m+1;
                }
                else{
                    r=m-1;
                }
            }
        }
        return 0;
    }
}