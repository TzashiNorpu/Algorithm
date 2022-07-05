package partitionDisjoint_915

func partitionDisjoint(nums []int) int {
	partitionIdx := 0
	leftMax := nums[0]
	max := nums[0]
	for i := 0; i < len(nums); i++ {
		max = mathMax(max, nums[i])
		if nums[i] >= leftMax {
			continue
		}
		leftMax = max
		partitionIdx = i
	}
	return partitionIdx + 1
}

func mathMax(a, b int) int {
	if a < b {
		return b
	}
	return a
}
