package largestRectangleArea

func largestRectangleArea(heights []int) int {
	maxArea := 0
	sentryH := make([]int, 0)
	sentryH = append(append(append(sentryH, 0), heights...), 0)
	length := len(sentryH)
	stack := make([]int, length)
	pos := 1
	for i := 1; i < length; i++ {
		for sentryH[i] < sentryH[stack[pos-1]] {
			leftIndex := stack[pos-2]
			width := i - leftIndex - 1
			height := sentryH[stack[pos-1]]
			pos = pos - 1
			stack[pos] = 0
			area := width * height
			if area > maxArea {
				maxArea = area
			}
			//fmt.Println(area)

			/*if (i-stack[pos-2]-1)*sentryH[stack[pos-1]] > maxArea {
				maxArea = (i - stack[pos-2] - 1) * sentryH[stack[pos-1]]
			}*/
			pos = pos - 1
			stack[pos] = 0
		}
		stack[pos] = i
		pos = pos + 1
	}
	return maxArea
}
