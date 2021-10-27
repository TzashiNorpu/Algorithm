package groupAnagrams

func groupAnagrams(strs []string) [][]string {
	res:=make([][]string,0)
	m := map[string]([]string){}
	for _, v := range strs {
		s := transfer(v)
		m[s]=append(m[s], v)
	}
	for _, li := range m {
		res=append(res, li)
	}
	return res
}

func transfer(v string) string {
	chars:=make([]byte,26)
	for _, char := range v {
		chars[char-'a'] +=1
	}
	return string(chars)
}

