package climbStairs_70

func climbStairs(n int) int {
	// 0,1,2,3,5
	if n <= 3 {
		return n
	}
	dp := make([]int, n+1)
	dp[1] = 1
	dp[2] = 2
	dp[3] = 3
	for i := 4; i <= n; i++ {
		dp[i] = dp[i-1] + dp[i-2]
	}
	return dp[n]
}
