package MyCircularDeque

import (
	"fmt"
	"testing"
)

func TestMyCircularDeque(t *testing.T) {

	circularDeque := Constructor(2)
	fmt.Println(circularDeque.InsertFront(7)) // 返回 true
	fmt.Println(circularDeque.DeleteLast())   // 返回 true
	fmt.Println(circularDeque.GetFront())     // 返回 true
	fmt.Println(circularDeque.InsertLast(5))  // 已经满了，返回 false
	fmt.Println(circularDeque.InsertFront(0)) // 已经满了，返回 false
	fmt.Println(circularDeque.GetFront())     // 返回 true
	fmt.Println(circularDeque.GetRear())      // 返回 2
	fmt.Println(circularDeque.GetFront())     // 返回 true
	fmt.Println(circularDeque.GetFront())     // 返回 true
	fmt.Println(circularDeque.GetRear())      // 返回 2
	fmt.Println(circularDeque.InsertLast(0))  // 返回 true

	// 0 5
}
