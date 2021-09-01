package largestRectangleArea

import (
	"fmt"
	"testing"
)

func TestLargestRectangleArea(t *testing.T) {
	ints := []int{2, 1, 5, 6, 2, 3}
	fmt.Println(largestRectangleArea(ints))
}
