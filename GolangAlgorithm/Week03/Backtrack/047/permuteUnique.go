package permuteUnique

import "sort"

func permuteUnique(nums []int) [][]int {
	res := make([][]int, 0)
	length := len(nums)
	if length == 0 {
		return res
	}
	sort.Ints(nums)
	level := 0
	path := make([]int, 0)
	pathUsed := make([]bool, length)
	var dfs func(nums []int, level int, pathUsed []bool, path []int)
	dfs = func(nums []int, level int, pathUsed []bool, path []int) {
		if level == length {
			temp := make([]int, length)
			copy(temp, path)
			res = append(res, temp)
		}
		for i := 0; i < length; i++ {
			// 剪枝条件：当前元素值与上一个元素值相同，且上一个元素已经被撤销【上一个元素是i-1，说明这种情况已经在之前的递归处理过了--上一次的同级递归中】
			if i > 0 && nums[i-1] == nums[i] && pathUsed[i-1] == false {
				continue
			}

			if pathUsed[i] == true {
				continue
			}
			pathUsed[i] = true
			path = append(path, nums[i])
			dfs(nums, level+1, pathUsed, path)
			pathUsed[i] = false
			path = path[:len(path)-1]
		}
	}

	dfs(nums, level, pathUsed, path)
	return res
}
