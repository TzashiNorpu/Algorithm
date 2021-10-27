package permuteUnique

import (
	"fmt"
	"testing"
)

func TestPermuteUnique(t *testing.T) {
	ints := []int{1, 2, 1}
	res := permuteUnique(ints)
	fmt.Println(res)
}
