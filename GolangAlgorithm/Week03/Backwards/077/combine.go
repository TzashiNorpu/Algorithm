package combine

func combine(n int, k int) [][]int {
	res := make([][]int, 0)
	item := make([]int, 0)
	var dfs func(n int, k int, begin int, item []int)
	dfs = func(n int, k int, begin int, item []int) {
		if len(item) == k {
			temp := make([]int, len(item))
			copy(temp, item)
			res = append(res, temp)
			return
		}
		// for i := begin; i <= n; i++ {
		// 简直
		for i := begin; i <= n-(k-len(item))+1; i++ {
			item = append(item, i)
			dfs(n, k, i+1, item)
			// 回溯
			item = item[:len(item)-1]
		}
	}
	dfs(n, k, 1, item)
	return res
}
