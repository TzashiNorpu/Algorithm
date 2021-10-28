package findLadders

func findLadders(beginWord string, endWord string, wordList []string) [][]string {
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

	step := map[string]int{}
	path := map[string][]string{}
	stack := []string{}
	depth := 0
	step[beginWord] = depth
	stack = append(stack, beginWord)
	visited := make([]bool, len(wordList))
	found := false
	for len(stack) > 0 {
		depth++
		size := len(stack)
		for i := 0; i < size; i++ {
			for j := 0; j < len(wordList); j++ {
				if oneLetterDiff(stack[i], wordList[j]) {
					if v, ok := step[wordList[j]]; ok && depth == v {
						path[wordList[j]] = append(path[wordList[j]], stack[i])
					}
					if visited[j] == false {
						if wordList[j] == endWord {
							found = true
						}
						step[wordList[j]] = depth
						path[wordList[j]] = append(path[wordList[j]], stack[i])
						visited[j] = true
						stack = append(stack, wordList[j])
					}
				}
			}
		}
		stack = stack[size:]
		if found {
			break
		}
	}
	var res [][]string
	var dfs func(beginWord string, endWord string, path map[string][]string, temp []string)
	dfs = func(beginWord string, endWord string, path map[string][]string, temp []string) {
		if beginWord == endWord {
			res = append(res, temp)
			return
		}
		for _, v := range path[endWord] {
			temp = append([]string{v}, temp...)
			dfs(beginWord, v, path, temp)
			temp = temp[1:]
		}
	}

	if found {
		dfs(beginWord, endWord, path, append([]string{}, endWord))
	}
	return res
}
