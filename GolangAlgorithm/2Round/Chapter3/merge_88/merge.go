package merge_88

func merge(nums1 []int, m int, nums2 []int, n int) {
	// nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 ->[1,2,2,3,5,6]
	tmp := make([]int, m)
	copy(tmp, nums1)
	i, j := 0, 0
	for (i + j) < m+n {
		if i == m {
			nums1[i+j] = nums2[j]
			j++
		} else if j == n {
			nums1[i+j] = tmp[i]
			i++
		} else {
			if tmp[i] < nums2[j] {
				nums1[i+j] = tmp[i]
				i++
			} else {
				nums1[i+j] = nums2[j]
				j++
			}
		}
	}
}
