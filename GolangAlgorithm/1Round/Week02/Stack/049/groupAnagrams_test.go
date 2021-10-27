package groupAnagrams

import (
	"fmt"
	"testing"
)

func TestGroupAnagrams(t *testing.T) {
	strs:=[]string{"eat", "tea", "tan", "ate", "nat", "bat"}
	anagrams := groupAnagrams(strs)
	fmt.Println(anagrams)
}
