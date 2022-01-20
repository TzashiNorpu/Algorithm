package getMaxLen_1567

func getMaxLen(nums []int) int {
	posDp := make([]int, len(nums))
	negDp := make([]int, len(nums))
	if nums[0] > 0 {
		posDp[0] = 1
	}
	if nums[0] < 0 {
		negDp[0] = 1
	}
	max := posDp[0]
	for i := 1; i < len(nums); i++ {
		if nums[i] > 0 {
			posDp[i] = posDp[i-1] + 1
			if negDp[i-1] == 0 {
				negDp[i] = 0
			} else {
				negDp[i] = negDp[i-1] + 1
			}
		}
		if nums[i] < 0 {
			negDp[i] = posDp[i-1] + 1
			if negDp[i-1] == 0 {
				posDp[i] = 0
			} else {
				posDp[i] = negDp[i-1] + 1
			}
		}
		if nums[i] == 0 {
			posDp[i] = 0
			negDp[i] = 0
		}
		if posDp[i] > max {
			max = posDp[i]
		}
	}
	return max
}
