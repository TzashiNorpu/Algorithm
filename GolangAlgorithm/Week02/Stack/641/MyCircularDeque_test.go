package MyCircularDeque

import (
	"fmt"
	"testing"
)

func TestMyCircularDeque(t *testing.T) {

	circularDeque := Constructor(77)
	fmt.Println(circularDeque.InsertFront(89)) // 返回 true
	fmt.Println(circularDeque.GetRear())
	fmt.Println(circularDeque.DeleteLast())   // 返回 true
	fmt.Println(circularDeque.GetRear())
	fmt.Println(circularDeque.InsertFront(19))
	fmt.Println(circularDeque.InsertFront(23))
	fmt.Println(circularDeque.InsertFront(82))
	fmt.Println(circularDeque.IsFull())
	fmt.Println(circularDeque.InsertFront(45))
	fmt.Println(circularDeque.IsFull())
	fmt.Println(circularDeque.GetRear())
	fmt.Println(circularDeque.DeleteLast())
	fmt.Println(circularDeque.GetFront())

/*
["MyCircularDeque","insertFront","getRear","deleteLast","getRear","insertFront","insertFront","insertFront","insertFront","isFull","insertFront","isFull","getRear","deleteLast","getFront","getFront","insertLast","deleteFront","getFront","insertLast","getRear","insertLast","getRear","getFront","getFront","getFront","getRear","getRear","insertFront","getFront","getFront","getFront","getFront","deleteFront","insertFront","getFront","deleteLast","insertLast","insertLast","getRear","getRear","getRear","isEmpty","insertFront","deleteLast","getFront","deleteLast","getRear","getFront","isFull","isFull","deleteFront","getFront","deleteLast","getRear","insertFront","getFront","insertFront","insertFront","getRear","isFull","getFront","getFront","insertFront","insertLast","getRear","getRear","deleteLast","insertFront","getRear","insertLast","getFront","getFront","getFront","getRear","insertFront","isEmpty","getFront","getFront","insertFront","deleteFront","insertFront","deleteLast","getFront","get...
	[[77],          [89],[],[],[],                                 [19],         [23],         [23],         [82],[],               [45],[],[],[],[],[],[74],[],[],[98],[],[99],[],[],[],[],[],[],[8],[],[],[],[],[],[75],[],[],[35],[59],[],[],[],[],[22],[],[],[],[],[],[],[],[],[],[],[],[21],[],[26],[63],[],[],[],[],[87],[76],[],[],[],[26],[],[67],[],[],[],[],[36],[],[],[],[72],[],[87],[],[],[],[],[85],[],[],[91],[],[],[],[],[],[],[],[],[],[34],[44],[]]

*/

}
