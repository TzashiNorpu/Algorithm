package maxArea

import (
	"fmt"
	"testing"
)

func TestMaxArea(t *testing.T) {
	h := []int{1, 8, 6, 2, 5, 4, 8, 3, 7}
	area := maxArea(h)
	fmt.Println(area)
}
