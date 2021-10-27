package maxSlidingWindow

import (
	"fmt"
	"testing"
)

func TestMaxSlidingWindow(t *testing.T) {
	ints := []int{4, -2}
	res := maxSlidingWindow(ints, 2)
	for _, v := range res {
		fmt.Println(v)
	}
}
