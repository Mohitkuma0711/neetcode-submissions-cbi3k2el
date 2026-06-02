class Solution:
    def search(self, nums: List[int], target: int) -> int:
        if target in nums:
            i = nums.index(target)
            return i
        else:
            return (-1)