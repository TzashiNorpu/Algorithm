package myPow

func myPow(x float64, n int) float64 {
	var _pow func(x float64, n int) float64
	_pow = func(x float64, n int) float64 {
		if n == 0 {
			return 1
		}
		if n == 1 {
			return x
		}
		temp := _pow(x, n/2)
		if n%2 == 0 {
			return temp * temp
		} else {
			return temp * temp * x
		}
	}
	if n < 0 {
		return 1 / _pow(x, n)
	} else {
		return _pow(x, n)
	}
}
