package canJump_55

func canJump(nums []int) bool {
	length := len(nums)
	furthest := nums[0]
	for i := 1; i < length; i++ {
		if furthest < i {
			return false
		}
		if i+nums[i] > furthest {
			furthest = i + nums[i]
		}
	}
	return true
}
