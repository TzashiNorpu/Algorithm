package maxArea

import "math"

func maxArea(height []int) int {
	maxArea := -1
	for i, j := 0, len(height)-1; i < j; {
		area := int(math.Min(float64(height[i]), float64(height[j]))) * (j - i)
		if height[i] < height[j] {
			i = i + 1
		} else {
			j = j - 1
		}
		if area > maxArea {
			maxArea = area
		}
	}
	return maxArea
}
