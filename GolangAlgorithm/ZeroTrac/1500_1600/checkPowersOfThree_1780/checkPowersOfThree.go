package checkPowersOfThree_1780

import "math"

func checkPowersOfThree(n int) bool {
	mask := (1 << 15) - 1
	for i := 1; i < mask; i++ {
		sum := 0
		for j := 14; j >= 0; j-- {
			sum += ((i >> j) & 1) * int(math.Pow(3, float64(j)))
			if sum > n {
				break
			}
			if sum == n {
				return true
			}
		}
	}
	return false
}
