package twoSum_1

func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	// [2,7,8] 9
	// (7,0) (2,1)
	for i, num := range nums {
		if other, ok := m[num]; ok {
			return []int{other, i}
		} else {
			m[target-num] = i
		}
	}
	return []int{}
}
