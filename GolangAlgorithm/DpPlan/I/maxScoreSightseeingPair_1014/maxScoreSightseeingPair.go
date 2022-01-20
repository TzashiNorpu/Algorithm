package maxScoreSightseeingPair_1014

func maxScoreSightseeingPair(values []int) int {
	// values[x]+x+values[j]-j
	dp := make([]int, len(values))
	dp[0] = values[0]
	item := values[0]
	res := values[0]
	for i := 1; i < len(values); i++ {
		dp[i] = item + values[i] - i
		if values[i]+i > item {
			item = values[i] + i
		}
		if dp[i] > res {
			res = dp[i]
		}
	}
	return res
}
