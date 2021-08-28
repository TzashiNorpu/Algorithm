package removeDuplicate

func removeDuplicates(nums []int) int {
	if len(nums) > 0 {
		loc := 0
		for _, v := range nums {
			if nums[loc] != v {
				loc = loc + 1
				nums[loc] = v
			}
		}
		return loc + 1
	} else {
		return 0
	}
}
