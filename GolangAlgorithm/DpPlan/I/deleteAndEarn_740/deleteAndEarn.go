package deleteAndEarn_740

func deleteAndEarn(nums []int) int {
	var n = 0
	for _, num := range nums {
		if num > n {
			n = num
		}
	}
	// 2,2,3,3,3,4
	all := make([]int, n+1)
	for _, num := range nums {
		all[num]++
	}
	// 0,0,2,3,1
	dp := make([]int, n+1)
	dp[1] = all[1]
	for i := 2; i < len(all); i++ {
		if dp[i-1] > dp[i-2]+i*all[i] {
			dp[i] = dp[i-1]
		} else {
			dp[i] = dp[i-2] + i*all[i]
		}
	}
	res := 0
	for _, v := range dp {
		if v > res {
			res = v
		}
	}
	return res
}
