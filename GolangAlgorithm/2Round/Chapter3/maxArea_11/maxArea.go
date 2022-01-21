package maxArea_11

func maxArea(height []int) int {
	//1,8,6,2,5,4,8,3,7->49
	l := 0
	r := len(height) - 1
	max := 0
	for l <= r {
		h := height[l]
		if height[r] < h {
			h = height[r]
		}
		area := (r - l) * h
		if area > max {
			max = area
		}
		if height[l] < height[r] {
			l++
		} else {
			r--
		}
	}
	return max
}
