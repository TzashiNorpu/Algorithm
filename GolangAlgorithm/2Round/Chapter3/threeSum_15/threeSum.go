package threeSum_15

import "sort"

func threeSum(nums []int) [][]int {
	// [-1,0,1,2,-1,-4] -> [-4,-1,-1,0,1,2] -> [[-1,-1,2],[-1,0,1]]
	sort.Ints(nums)
	res := make([][]int, 0)
	for i := 0; i < len(nums)-2; i++ {
		if nums[i] > 0 {
			break
		}
		if i > 0 && nums[i] == nums[i-1] {
			continue
		}
		l := i + 1
		r := len(nums) - 1

		for l < r {
			if nums[i]+nums[l]+nums[r] > 0 {
				r--
			} else if nums[i]+nums[l]+nums[r] < 0 {
				l++
			} else {
				res = append(res, []int{nums[i], nums[l], nums[r]})
				for l < r && nums[l] == nums[l+1] {
					l = l + 1
				}
				for l < r && nums[r] == nums[r-1] {
					r = r - 1
				}
				l = l + 1
				r = r - 1
			}
		}
	}
	return res
}
