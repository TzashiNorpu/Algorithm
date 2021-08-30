package twoSum

func twoSum(nums []int, target int) []int {
	m := make(map[int]int)
	res := make([]int, 2)
	for k, v := range nums {
		if _, ok := m[target-v]; ok {
			res[0] = m[target-v]
			res[1] = k
		} else {
			m[v] = k
		}
	}
	return res
}
