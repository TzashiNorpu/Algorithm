package subArrayRanges_2104

func subArrayRanges(nums []int) int64 {
	return maxSum(nums) - minSum(nums)
}

func maxSum(nums []int) int64 {
	var maxSum int64 = 0
	/*stack := make([]int, 0)
	stack = append(stack, -1)
	for i := 0; i <= len(nums); i++ {
		// 递减
		for len(stack) > 1 && (i == len(nums) || nums[i] > nums[stack[len(stack)-1]]) {
			currIndex := stack[len(stack)-1]
			stack = stack[:len(stack)-1]
			leftIndex := stack[len(stack)-1]
			rightIndex := i
			maxSum = maxSum + int64((currIndex-leftIndex)*(rightIndex-currIndex)*nums[currIndex])
		}
		stack = append(stack, i)
	}*/
	var stack [1010]int
	stack[0] = -1
	pos := 0
	for i := 0; i <= len(nums); i++ {
		for pos >= 1 && (i == len(nums) || nums[i] > nums[stack[pos]]) {
			currIndex := stack[pos]
			pos--
			leftIndex := stack[pos]
			rightIndex := i
			maxSum = maxSum + int64((currIndex-leftIndex)*(rightIndex-currIndex)*nums[currIndex])
		}
		pos++
		stack[pos] = i
	}
	return maxSum
}
func minSum(nums []int) int64 {
	var minSum int64 = 0
	/*stack := make([]int, 0)
	stack = append(stack, -1)
	for i := 0; i <= len(nums); i++ {
		// 递增
		for len(stack) > 1 && (i == len(nums) || nums[i] < nums[stack[len(stack)-1]]) {
			currIndex := stack[len(stack)-1]
			stack = stack[:len(stack)-1]
			leftIndex := stack[len(stack)-1]
			rightIndex := i
			minSum = minSum + int64((currIndex-leftIndex)*(rightIndex-currIndex)*nums[currIndex])
		}
		stack = append(stack, i)
	}*/
	var stack [1010]int
	stack[0] = -1
	pos := 0
	for i := 0; i <= len(nums); i++ {
		for pos >= 1 && (i == len(nums) || nums[i] < nums[stack[pos]]) {
			currIndex := stack[pos]
			pos--
			leftIndex := stack[pos]
			rightIndex := i
			minSum = minSum + int64((currIndex-leftIndex)*(rightIndex-currIndex)*nums[currIndex])
		}
		pos++
		stack[pos] = i
	}
	return minSum
}
