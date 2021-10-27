package climbStairs

import (
	"fmt"
	"testing"
)

func TestClimbStairs(t *testing.T) {
	fmt.Println(climbStairs1(20))
	fmt.Println(climbStairs2(20))
	fmt.Println(climbStairs1_1(20))
	fmt.Println(climbStairs2_1_cache(20))
	fmt.Println(climbStairs3(20))
	fmt.Println(climbStairs4(20))
}
