package MyCircularDeque

import (
	"fmt"
	"testing"
)

func TestMyCircularDeque(t *testing.T) {
	/*circularDeque := Constructor(3)
	fmt.Println(circularDeque.InsertLast(1))  // 返回 true
	fmt.Println(circularDeque.InsertLast(2))      // 返回 true
	fmt.Println(circularDeque.InsertFront(3))     // 返回 true
	fmt.Println(circularDeque.InsertFront(4))     // 已经满了，返回 false
	fmt.Println(circularDeque.GetRear())          // 返回 2
	fmt.Println(circularDeque.IsFull())           // 返回 true
	fmt.Println(circularDeque.DeleteLast())       // 返回 true
	fmt.Println(circularDeque.InsertFront(4))     // 返回 true
	fmt.Println(circularDeque.GetFront())         // 返回 4*/

	circularDeque := Constructor(7)
	fmt.Println(circularDeque.InsertFront(1))  // 返回 true
	fmt.Println(circularDeque.InsertLast(0))      // 返回 true
	fmt.Println(circularDeque.GetFront())     // 返回 true
	fmt.Println(circularDeque.InsertLast(8))     // 已经满了，返回 false
	fmt.Println(circularDeque.GetRear())          // 返回 2
	fmt.Println(circularDeque.GetFront())           // 返回 true
	fmt.Println(circularDeque.InsertLast(2))       // 返回 true
	fmt.Println(circularDeque.InsertLast(0))       // 返回 true
	fmt.Println(circularDeque.InsertLast(4))     // 返回 true
	fmt.Println(circularDeque.DeleteLast())     // 返回 true
	fmt.Println(circularDeque.GetFront())         // 返回 4
}
