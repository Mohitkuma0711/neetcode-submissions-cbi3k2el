class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        c=0
        st = set(nums)
        for i in nums:
            s,crr=0,i
            while crr in st:
                s+=1
                crr+=1
            c=max(c,s)
        return c    
    
        