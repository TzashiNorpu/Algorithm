package plusOne

func plusOne(digits []int) []int {
	length := len(digits)
	temp := 0
	for i := length - 1; i >= 0; i-- {
		if i == length-1 {
			temp = 1
		}
		new := (digits[i] + temp) % 10
		temp = (digits[i] + temp) / 10
		digits[i] = new
		if temp == 0 {
			return digits
		}
	}
	if temp == 1 {
		return append([]int{1}, digits...)
	}
	return digits
}
