package climbStairs

/*
recursive
*/
func climbStairs1(n int) int {
	if n < 4 {
		return n
	}
	return climbStairs1(n-1) + climbStairs1(n-2)
}

/*
recursive cache
*/
func climbStairs1_1(n int) int {
	if n < 4 {
		return n
	}
	return climbStairs1(n-1) + climbStairs1(n-2)
}

func climbStairs2(n int) int {
	return climbStairs2_1(0, n)
}

func climbStairs2_1(i int, n int) int {
	if i > n {
		return 0
	}
	if i == n {
		return 1
	}
	return climbStairs2_1(i+1, n) + climbStairs2_1(i+2, n)
}
