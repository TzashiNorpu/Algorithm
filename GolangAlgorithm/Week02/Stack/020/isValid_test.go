package isValid

import (
	"fmt"
	"testing"
)

func TestIsValid(t *testing.T) {
	s := "(])"
	fmt.Println(isValid(s))
}
