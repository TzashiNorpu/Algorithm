package isAnagram

import (
	"fmt"
	"testing"
)

func TestIsAnagram(t *testing.T) {
	res := isAnagram("abc", "ab")
	fmt.Println(res)
}
