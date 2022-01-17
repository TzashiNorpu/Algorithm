package jump_45

func jump(nums []int) int {
	// 2,3,0,1,4
	// 2
	furthest := nums[0]
	preFurthest := furthest
	length := len(nums)
	if length == 1 {
		return 0
	}
	step := 1
	for i := 1; i < length-1; i++ {
		if i+nums[i] > furthest {
			furthest = i + nums[i]
		}
		if i == preFurthest {
			preFurthest = furthest
			step++
		}
	}
	return step
}
