package minCostClimbingStairs_746

import (
	"math"
)

func minCostClimbingStairs(cost []int) int {
	length := len(cost)
	var dp = make([]int, length)
	dp[0] = cost[0]
	// 10,15,20
	// 10,10,15,15
	dp[1] = cost[1]
	for i := 2; i < length; i++ {
		dp[i] = int(math.Min(float64(dp[i-2]), float64(dp[i-1]))) + cost[i]
	}
	return int(math.Min(float64(dp[length-1]), float64(dp[length-2])))
}
