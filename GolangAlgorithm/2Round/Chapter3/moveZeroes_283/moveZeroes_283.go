package moveZeroes_283

func moveZeroes(nums []int) {
	// 0,1,0,3,12->1,3,12,0,0
	loc := 0
	for k, v := range nums {
		if v != 0 {
			nums[loc] = v
			if k != loc {
				nums[k] = 0
			}
			loc++
		}
	}
}
