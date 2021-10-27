package MinStack

import (
	"fmt"
	"testing"
)

func TestMinStack(t *testing.T) {
	stack := Constructor()
	/*["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
	[[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]*/
	stack.Push(2147483646)
	stack.Push(2147483646)
	stack.Push(2147483647)
	fmt.Println(stack.Top())
	stack.Pop()
	fmt.Println(stack.GetMin())
	stack.Pop()
	fmt.Println(stack.GetMin())
	stack.Pop()
	stack.Push(2147483647)
	fmt.Println(stack.Top())
	fmt.Println(stack.GetMin())
	stack.Push(-2147483648)
	fmt.Println(stack.Top())
	fmt.Println(stack.GetMin())
	stack.Pop()
	fmt.Println(stack.GetMin())
}
