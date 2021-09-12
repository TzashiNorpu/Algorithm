package permute

import (
	"fmt"
	"testing"
)

func TestPermute(t *testing.T) {
	ints := []int{1, 2, 3}
	res := permute(ints)
	fmt.Println(res)
}
