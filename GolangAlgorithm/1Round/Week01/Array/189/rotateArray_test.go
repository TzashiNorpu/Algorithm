package rotateArray

import (
	"fmt"
	"testing"
)

func TestRotateArray(t *testing.T) {
	nums := []int{1, 2, 3}
	//rotate2(nums, 1)
	//reverseSlice(nums, 1, 2)
	rotate3(nums, 2)
	for k, v := range nums {
		fmt.Println(k, "--", v)
	}
}
