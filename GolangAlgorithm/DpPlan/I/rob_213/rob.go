package rob_213

func rob(nums []int) int {
	var r func(a []int) int
	r = func(nums []int) int {
		length := len(nums)
		var dp = make([]int, length+1)
		dp[1] = nums[0]
		for i := 2; i <= length; i++ {
			if dp[i-2]+nums[i-1] > dp[i-1] {
				dp[i] = dp[i-2] + nums[i-1]
			} else {
				dp[i] = dp[i-1]
			}
		}
		return dp[length]
	}
	length := len(nums)
	if length == 1 {
		return nums[0]
	}
	if length == 2 {
		if nums[0] > nums[1] {
			return nums[0]
		} else {
			return nums[1]
		}
	}
	rob1 := nums[:length-1]
	rob2 := nums[1:]
	a := r(rob1)
	b := r(rob2)
	if a > b {
		return a
	} else {
		return b
	}
}
