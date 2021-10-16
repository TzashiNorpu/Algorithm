package subsets

func subsets(nums []int) [][]int {
	var res [][]int
	length := len(nums)
	temp := make([]int, 0)
	var _recursive func(curr int)
	_recursive = func(curr int) {
		if length == curr {
			tmpCopy := make([]int, len(temp))
			copy(tmpCopy, temp)
			res = append(res, tmpCopy)
			return
		}
		temp = append(temp, nums[curr])
		_recursive(curr + 1)
		temp = temp[:len(temp)-1]
		_recursive(curr + 1)
	}
	_recursive(0)
	return res
}

// 每个位置可选可不选
func subsets_2(nums []int) [][]int {
	var res [][]int
	length := len(nums)
	var recursive func(temp []int, index int)
	recursive = func(temp []int, index int) {
		if length == index {
			res = append(res, temp)
			return
		}
		recursive(append(temp, nums[index]), index+1)
		recursive(temp, index+1)
	}
	var temp = make([]int, 0)
	recursive(temp, 0)
	return res
}
