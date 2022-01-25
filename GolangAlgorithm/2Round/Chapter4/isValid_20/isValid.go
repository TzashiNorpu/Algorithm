package isValid_20

func isValid(s string) bool {
	var stack []rune
	for _, v := range s {
		stack = append(stack, v)
		if len(stack) >= 2 {
			if v == ')' && stack[len(stack)-2] == '(' ||
				v == '}' && stack[len(stack)-2] == '{' ||
				v == ']' && stack[len(stack)-2] == '[' {
				stack = stack[:len(stack)-2]
			}
		}
	}
	return len(stack) == 0
}
