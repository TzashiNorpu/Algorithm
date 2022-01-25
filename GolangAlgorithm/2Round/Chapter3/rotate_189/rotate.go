package rotate_189

func rotate(nums []int, k int) {
	// nums = [1,2,3,4,5,6,7], k = 3-> [5,6,7,1,2,3,4]
	length := len(nums)
	k = k % length
	// 空间复杂度 O(1)
	reverse(nums)
	reverse(nums[:k+1])
	reverse(nums[k+1:])
}

func reverse(nums []int) {
	l := 0
	r := len(nums) - 1
	for l < r {
		nums[l], nums[r] = nums[r], nums[l]
		l++
		r--
	}
}
