package removeDuplicates_26

func removeDuplicates(nums []int) int {
	if len(nums) > 0 {
		loc := 0
		for i := loc + 1; i < len(nums); i++ {
			if nums[loc] != nums[i] {
				loc = loc + 1
				nums[loc] = nums[i]
			}
		}
		return loc + 1
	} else {
		return 0
	}
}
