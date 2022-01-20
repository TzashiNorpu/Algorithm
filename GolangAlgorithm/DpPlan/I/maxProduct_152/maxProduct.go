package maxProduct_152

func maxProduct(nums []int) int {
	// 2,-2,-3,-1,4
	max := 0
	min := 0
	res := nums[0]
	posDp := make([]int, len(nums))
	if nums[0] > 0 {
		posDp[0] = nums[0]
	}
	negDp := make([]int, len(nums))
	if nums[0] < 0 {
		negDp[0] = nums[0]
	}
	for i := 1; i < len(nums); i++ {
		v1 := posDp[i-1] * nums[i]
		v2 := negDp[i-1] * nums[i]
		v3 := nums[i]
		max = v1
		min = v1
		if max < v2 {
			max = v2
		}
		if max < v3 {
			max = v3
		}
		if min > v2 {
			min = v2
		}
		if min > v3 {
			min = v3
		}
		posDp[i] = max
		negDp[i] = min
		if max > res {
			res = max
		}
	}
	return res
}
