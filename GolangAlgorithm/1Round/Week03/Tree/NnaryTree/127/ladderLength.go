package ladderLength

func ladderLength(beginWord string, endWord string, wordList []string) int {
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
	visited := make([]bool, len(wordList))
	stack := []string{}
	stack = append(stack, beginWord)
	depth := 0
	if wordList == nil {
		return depth
	}
	for len(stack) > 0 {
		length := len(stack)
		depth++
		for i := 0; i < length; i++ {
			for j := 0; j < len(wordList); j++ {
				if stack[i] == endWord {
					return depth
				}
				if visited[j] == false {
					if oneLetterDiff(wordList[j], stack[i]) {
						visited[j] = true
						stack = append(stack, wordList[j])
					}
				}
			}
		}
		stack = stack[length:]
	}
	return 0
}
