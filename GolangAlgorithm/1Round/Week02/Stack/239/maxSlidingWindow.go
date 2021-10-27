package maxSlidingWindow

func maxSlidingWindow(nums []int, k int) []int {
	length := len(nums)
	res := make([]int, length-k+1)
	stack := make([]int, length)
	maxIndex, minIndex := 0, 0
	for index, v := range nums {
		for minIndex > maxIndex && v > nums[stack[minIndex-1]] {
			stack[minIndex-1] = 0
			minIndex = minIndex - 1
		}
		stack[minIndex] = index
		minIndex = minIndex + 1
		if index-stack[maxIndex] >= k {
			stack[maxIndex] = 0
			maxIndex = maxIndex + 1
		}
		if index-k+1 >= 0 {
			res[index-k+1] = nums[stack[maxIndex]]
		}
	}
	return res
}
