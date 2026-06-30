class Solution:
    def findMin(self, nums: List[int]) -> int:
        s = 0
        e = len(nums) - 1

        while s <= e:
            m = (s + e) // 2
            num_m = nums[m]
            num_e = nums[e]
            num_s = nums[s]

            if num_m > num_e:
                s = m + 1
            elif num_m < num_e:
                e = m
            else:
                return num_m
        
        return num_m