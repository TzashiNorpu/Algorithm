package plusOne_63

func plusOne(digits []int) []int {
	res := make([]int, len(digits))
	carry := 1
	for i := len(digits) - 1; i >= 0; i-- {
		res[i] = (digits[i] + carry) % 10
		carry = (digits[i] + carry) / 10
	}
	if carry == 1 {
		res = append([]int{1}, res...)
	}
	return res
}
