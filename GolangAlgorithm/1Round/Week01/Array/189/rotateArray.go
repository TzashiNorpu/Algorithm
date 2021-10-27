package rotateArray

func rotate1(nums []int, k int) {
	k = k % len(nums)
	numsCopy := make([]int, len(nums))
	copy(numsCopy, nums)
	// len(nums) - k -> len(nums) --> 0 - k
	for i := len(nums) - k; i < len(nums); i++ {
		nums[i+k-len(nums)] = numsCopy[i]
	}
	// 0 - len(nums) - k -> k -> len(nums)
	for i := 0; i < len(nums)-k; i++ {
		nums[k+i] = numsCopy[i]
	}
}

func rotate2(nums []int, k int) {
	k = k % len(nums)
	numsCopy := make([]int, 0)
	numsCopy = append(numsCopy, nums[len(nums)-k:]...)
	numsCopy = append(numsCopy, nums[:len(nums)-k]...)
	//nums = numsCopy 不能这么修改 给nums了一个新的底层数组引用 外层还是指向原来的引用
	// 通过修改底层数组的方式来修改外层的切片
	for k, v := range numsCopy {
		nums[k] = v
	}
}

func rotate3(nums []int, k int) {
	k = k % len(nums)
	reverseSlice(nums, 0, len(nums)-1)
	reverseSlice(nums, 0, k-1)
	reverseSlice(nums, k, len(nums)-1)
}

func reverseSlice(nums []int, startIndex, endIndex int) {
	length := endIndex - startIndex + 1
	for i := 0; i < length/2; i++ {
		nums[startIndex+i], nums[endIndex-i] = nums[endIndex-i], nums[startIndex+i]
	}
}
