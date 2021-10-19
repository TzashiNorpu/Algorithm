package letterCombinations

func letterCombinations(digits string) []string {
	m := map[uint8]string{
		'2': "abc",
		'3': "def",
		'4': "ghi",
		'5': "jkl",
		'6': "mno",
		'7': "pqrs",
		'8': "tuv",
		'9': "wxyz",
	}
	res := make([]string, 0)
	length := len(digits)
	if length == 0 {
		return res
	}
	var dfs func(index int, s string)
	dfs = func(index int, s string) {
		if index == length {
			res = append(res, s)
			return
		}
		char := digits[index]
		str := m[char]
		for i := 0; i < len(str); i++ {
			dfs(index+1, s+string(str[i]))
		}
	}

	var trackBack func(index int, s string)
	trackBack = func(index int, s string) {
		if index == length {
			res = append(res, s)
			return
		}
		char := digits[index]
		str := m[char]
		for i := 0; i < len(str); i++ {
			s = s + string(str[i])
			trackBack(index+1, s)
			s = s[:len(s)-1]
		}
	}
	trackBack(0, "")
	return res
}
