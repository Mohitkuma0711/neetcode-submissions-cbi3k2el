class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        c = 0
        st = set(nums)
        for i in st:
            if i-1 not in st:
                s=1
                crr=i
                while crr + 1 in st:
                    s += 1
                    crr += 1
                c = max(c, s)
        return c