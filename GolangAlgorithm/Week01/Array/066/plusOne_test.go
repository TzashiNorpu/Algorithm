package plusOne

import (
	"fmt"
	"testing"
)

func TestPlusOne(t *testing.T) {
	ints := []int{9, 9, 9}
	res := plusOne(ints)
	for _, v := range res {
		fmt.Println(v)
	}
}
