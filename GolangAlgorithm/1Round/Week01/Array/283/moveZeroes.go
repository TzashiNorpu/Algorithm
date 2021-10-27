package moveZeroes

func moveZeroes(nums []int) {
	loc := 0
	for k, v := range nums {
		if v != 0 {
			nums[loc] = v
			if k != loc {
				nums[k] = 0
			}
			loc = loc + 1
		}
	}
}
