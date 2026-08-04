class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        l=list(set(nums))
        nums.sort(reverse=True)
        for idx,val in enumerate(nums):
            if idx==k-1:
                return val
