package maxSubarraySumCircular_918

func maxSubarraySumCircular(nums []int) int {
	max := nums[0]
	maxTill := nums[0]
	min := nums[0]
	minTill := nums[0]
	sum := nums[0]
	// -3,-2,-1
	// 1,2,3
	// 5,-3,5
	for i := 1; i < len(nums); i++ {
		sum += nums[i]
		if maxTill+nums[i] > nums[i] {
			maxTill = maxTill + nums[i]
		} else {
			maxTill = nums[i]
		}
		if maxTill > max {
			max = maxTill
		}
		if minTill+nums[i] < nums[i] {
			minTill = minTill + nums[i]
		} else {
			minTill = nums[i]
		}
		if minTill < min {
			min = minTill
		}
	}
	if min == sum {
		return max
	} else {
		if sum-min > max {
			return sum - min
		} else {
			return max
		}
	}
}
