package isAnagram

func isAnagram(s string, t string) bool {
	len1 := len(s)
	len2 := len(t)
	if len1!=len2 {
		return false
	}
	count :=make([]int,26)
	for i := 0; i < len1; i++ {
		count[s[i]-'a'] +=1
		count[t[i]-'a'] -=1
	}
	for _, v := range count {
		if v != 0 {
			return false
		}
	}
	return true
}
