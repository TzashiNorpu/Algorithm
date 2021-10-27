package moveZeroes

import (
	"fmt"
	"testing"
)

func TestMoveZeroes(t *testing.T) {
	var ints []int = []int{1}
	moveZeroes(ints)
	for _, v := range ints {
		fmt.Println(v)
	}
}
