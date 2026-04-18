class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        l = 1
        for r in range(1,len(nums)):
            if nums[r] != nums[r-1]:
                nums[l] = nums[r]
                l += 1
        return l





# Increasing order 1,3,3,5,8
# Remove duplicates 
# Order of the list cannot change
# Don't consider elements beyond k(unique elements)
# Return numer of unique elements => k


