package permute

func permute(nums []int) [][]int {
	res := make([][]int, 0)
	length := len(nums)
	if length == 0 {
		return res
	}
	level := 0
	path := make([]int, 0)
	used := make([]bool, length)
	var dfs func(nums []int, level int, path []int, used []bool)
	dfs = func(nums []int, level int, path []int, used []bool) {
		if level == length {
			temp := make([]int, length)
			copy(temp, path)
			res = append(res, temp)
			return
		}
		for i := 0; i < length; i++ {
			if used[i] == true {
				continue
			}
			used[i] = true
			path = append(path, nums[i])
			dfs(nums, level+1, path, used)
			used[i] = false
			path = path[:len(path)-1]
		}
	}
	dfs(nums, level, path, used)
	return res
}
