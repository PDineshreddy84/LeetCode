class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        l=list(set(nums))
        nums.sort(reverse=True)
        return nums[k-1]
