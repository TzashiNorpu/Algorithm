package generateParenthesis

func generateParenthesis1(n int) []string {
	res := make([]string, 0)
	var _generate func(s string, n int, l int, r int)
	_generate = func(s string, n int, l int, r int) {
		if l == n && r == n {
			res = append(res, s)
			return
		}
		if r > l {
			return
		}
		if l < n {
			_generate(s+"(", n, l+1, r)
		}
		if r < l {
			_generate(s+")", n, l, r+1)
		}
	}
	_generate("", n, 0, 0)
	return res
}

func generateParenthesis2(n int) []string {
	res := make([]string, 0)
	var _generate func(s string, n int, l int, r int)
	_generate = func(s string, n int, l int, r int) {
		if len(s) == 2*n {
			res = append(res, s)
			return
		}
		if r > l {
			return
		}
		if l < n {
			_generate(s+"(", n, l+1, r)
		}
		if r < l {
			_generate(s+")", n, l, r+1)
		}
	}
	_generate("", n, 0, 0)
	return res
}
