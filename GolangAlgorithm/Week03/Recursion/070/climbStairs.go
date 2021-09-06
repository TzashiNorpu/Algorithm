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
	res := make([]int, n+1)
	return climb1_1(n, res)
}

func climb1_1(i int, res []int) int {
	if i < 4 {
		res[i] = i
	}
	if res[i] > 0 {
		return res[i]
	}
	res[i] = climb1_1(i-1, res) + climb1_1(i-2, res)
	return res[i]
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

func climbStairs2_1_cache(n int) int {
	res := make([]int, n+2)
	/*for i, _ := range res {
		res[i] = make([]int, n+2)
	}*/
	return climb2_1(0, n, res)
}

func climb2_1(i int, n int, res []int) int {
	if i > n {
		res[i] = 0
		return 0
	}
	if i == n {
		res[i] = 1
		return 1
	}
	if res[i] > 0 {
		return res[i]
	}
	res[i+1] = climb2_1(i+1, n, res)
	res[i+2] = climb2_1(i+2, n, res)
	return res[i+1] + res[i+2]
}

// dynamic
func climbStairs3(n int) int {
	if n < 4 {
		return n
	}
	res := make([]int, n+1)
	res[0] = 0
	res[1] = 1
	res[2] = 2
	res[3] = 3
	for i := 4; i <= n; i++ {
		res[i] = res[i-1] + res[i-2]
	}
	return res[n]
}

// Fibonacci
func climbStairs4(n int) int {
	if n < 4 {
		return n
	}
	prev_prev := 2
	prev := 3
	curr := prev_prev + prev
	for i := 4; i <= n; i++ {
		curr = prev_prev + prev
		prev_prev = prev
		prev = curr
	}
	return curr
}
