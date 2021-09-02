package MyCircularDeque

import "testing"

func TestMyCircularDeque(t *testing.T) {
	circularDeque := Constructor(3)
	circularDeque.InsertLast(1)  // 返回 true
	circularDeque.InsertLast(2)  // 返回 true
	circularDeque.InsertFront(3) // 返回 true
	circularDeque.InsertFront(4) // 已经满了，返回 false
	circularDeque.GetRear()      // 返回 2
	circularDeque.IsFull()       // 返回 true
	circularDeque.DeleteLast()   // 返回 true
	circularDeque.InsertFront(4) // 返回 true
	circularDeque.GetFront()     // 返回 4

}
