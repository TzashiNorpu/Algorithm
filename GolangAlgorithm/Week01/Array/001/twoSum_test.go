package twoSum

import (
	"fmt"
	"testing"
)

func TestTwoSum(t *testing.T) {
	nums := []int{2, 7, 11, 15}
	target := 9
	sum := twoSum(nums, target)
	for _, v := range sum {
		fmt.Println(v)
	}
}
