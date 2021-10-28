package minMutation

func minMutation1(start string, end string, bank []string) int {
	stack := make([]string, 0)
	stack = append(stack, start)
	m := make(map[string]int)
	depth := 0
	if bank == nil {
		return -1
	}

	for _, s := range bank {
		m[s] = 0
	}

	if _, ok := m[end]; !ok {
		return -1
	}

	for len(stack) > 0 {
		depth++
		length := len(stack)
		for i := 0; i < length; i++ {
			pop := stack[0]
			stack = stack[1:]
			chars := []byte(pop)
			for j := 0; j < len(chars); j++ {
				oldChar := chars[j]
				for c := 'A'; c <= 'Z'; c++ {
					chars[j] = byte(c)
					s := string(chars)
					if _, ok := m[s]; ok {
						if s == end {
							return depth
						} else {
							stack = append(stack, s)
							delete(m, s)
						}
					}
				}
				chars[j] = oldChar
			}
		}
	}
	return -1
}

func minMutation2(start string, end string, bank []string) int {
	var oneLetterDiff func(s1, s2 string) bool
	oneLetterDiff = func(s1, s2 string) bool {
		diffCnt := 0
		for i := 0; i < len(s1); i++ {
			if s1[i] != s2[i] {
				diffCnt++
				if diffCnt > 1 {
					return false
				}
			}
		}
		return diffCnt == 1
	}
	stack := []string{start}
	visited := make([]bool, len(bank))
	depth := 0
	for len(stack) > 0 {
		length := len(stack)
		for i := 0; i < length; i++ {
			if stack[i] == end {
				return depth
			}
			for j := 0; j < len(bank); j++ {
				if visited[j] == false {
					if oneLetterDiff(bank[j], stack[i]) {
						visited[j] = true
						stack = append(stack, bank[j])
					}
				}
			}
		}
		depth++
		stack = stack[length:]
	}
	return -1
}
