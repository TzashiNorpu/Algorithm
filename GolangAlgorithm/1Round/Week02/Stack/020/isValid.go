package isValid

import "container/list"

func isValid(s string) bool {
	l := list.New()
	for _, c := range s {
		if string(c) == "(" || string(c) == "[" || string(c) == "{" {
			l.PushFront(string(c))
		} else {
			if l.Len() < 1 {
				return false
			}
			if (string(c) == ")" && "(" == l.Front().Value) || (string(c) == "]" && "[" == l.Front().Value) || (string(c) == "}" && "{" == l.Front().Value) {
				l.Remove(l.Front())
			} else {
				return false
			}
		}
	}
	return l.Len() == 0
}
