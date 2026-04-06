class Solution:
    def maxArea(self, heights: List[int]) -> int:
        vol = 0
        for i in range(len(heights)):
            for j in range(i + 1, len(heights)):
                vol = max(vol, min(heights[i], heights[j]) * (j - i))
        return vol