class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        l=list(set(nums))
        nums.sort(reverse=True)
        for i in nums:
            if(i==k-1):
                return nums[i]
