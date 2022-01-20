package maxProfit_121

func maxProfit(prices []int) int {
	dp := make([]int, len(prices))
	min := prices[0]
	max := 0
	for i := 1; i < len(prices); i++ {
		if prices[i] > min {
			dp[i] = prices[i] - min
		}
		if prices[i] < min {
			min = prices[i]
		}
		if dp[i] > max {
			max = dp[i]
		}
	}
	return max
}
