package merge

func merge(nums1 []int, m int, nums2 []int, n int) {
	copy_nums := make([]int, m)
	copy(copy_nums, nums1)
	// 不能用 copy_nums := nums1[:m]：引用的是同一个底层数组，会被后续的代码修改值，需要新建一个底层数组
	for i, l1, l2 := 0, 0, 0; i < m+n; i++ {
		if l1 == m {
			nums1[i] = nums2[l2]
			l2 = l2 + 1
		} else if l2 == n {
			nums1[i] = copy_nums[l1]
			l1 = l1 + 1
		} else {
			if copy_nums[l1] < nums2[l2] {
				nums1[i] = copy_nums[l1]
				l1 = l1 + 1
			} else {
				nums1[i] = nums2[l2]
				l2 = l2 + 1
			}
		}
	}
}
