package trap

import "math"

/*
暴力
 */
func trap1(height []int) int {
	res :=0
	for k, v := range height {
		leftMaxH :=0
		rightMaxH :=0
		for i := k; i >=0 ; i-- {
			if height[i]>leftMaxH {
				leftMaxH = height[i]
			}
		}
		for i := k; i < len(height); i++ {
			if height[i]>rightMaxH {
				rightMaxH = height[i]
			}
		}
		res += (int(math.Min(float64(leftMaxH),float64(rightMaxH))) - v)
	}
	return res
}
/*
dynamic
 */
func trap2(height []int) int {
	res :=0
	length := len(height)
	leftMaxH:=make([]int, length)
	rightMaxH:=make([]int, length)
	leftMaxH[0],rightMaxH[length-1] = height[0],height[length-1]
	for i := 1; i < length; i++ {
		if height[i]>leftMaxH[i-1] {
			leftMaxH[i]=height[i]
		}else {
			leftMaxH[i] = leftMaxH[i-1]
		}
	}
	for i := length-2; i >=0; i-- {
		if height[i]>rightMaxH[i+1] {
			rightMaxH[i] = height[i]
		}else {
			rightMaxH[i] = rightMaxH[i+1]
		}
	}

	for i := 0; i < length; i++ {
		res += (int(math.Min(float64(leftMaxH[i]), float64(rightMaxH[i]))) - height[i])
	}
	return res
}


/*
双指针
 */
func trap3(height []int) int {
	res :=0
	length := len(height)
	l,leftMax :=0,height[0]
	r,rightMax:=length-1,height[length-1]
	for  l <r {
		if leftMax<=rightMax {
			res+= leftMax - height[l]
			l = l+1
			if height[l]>leftMax {
				leftMax = height[l]
			}
		}else {
			res+= rightMax - height[r]
			r = r-1
			if height[r] > rightMax {
				rightMax = height[r]
			}
		}
	}
	return res
}



/*
单调栈
*/
func trap4(height []int) int {
	res :=0
	stack := make([]int,0)
	for k, v := range height {
		for len(stack)>0 && v > height[stack[len(stack)-1]]{
			rightIndex := k;
			currIndex := stack[len(stack)-1]
			if len(stack) <2  {
				break
			}
			leftIndex := stack[len(stack)-2]

			if height[rightIndex]>height[leftIndex] {
				h := height[leftIndex] - height[currIndex]
				if h < 0 {
					h=0
				}
				res+= h *(rightIndex-leftIndex-1)
			}else {
				h := height[rightIndex] - height[currIndex]
				if h < 0 {
					h=0
				}
				res+= h *(rightIndex-leftIndex-1)
			}
			stack = stack[:len(stack)-1]
		}
		stack = append(stack, k)
	}
	return res
}