package majorityElement

func majorityElement(nums []int) int {
	var m1 func() int
	m1 = func() int {
		cnt := 1
		res := nums[0]
		for i := 1; i < len(nums); i++ {
			if nums[i] == res {
				cnt++
			} else {
				cnt--
				if cnt == 0 {
					res = nums[i]
					cnt = 1
				}
			}
		}
		return res
	}
	return m1()

	/*var m2 func() int
	m2 = func() int {
		sort.Ints(nums)
		return nums[len(nums)/2]
	}
	return m2()*/
}
