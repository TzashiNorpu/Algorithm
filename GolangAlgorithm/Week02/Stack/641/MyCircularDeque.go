package MyCircularDeque

type MyCircularDeque struct {
	cap   int
	count int
	data  []int
	head  int
	tail  int
}

/** Initialize your data structure here. Set the size of the deque to be k. */
func Constructor(k int) MyCircularDeque {
	return MyCircularDeque{data: make([]int, k), cap: k, count: 0, head: 0, tail: 0}
}

/** Adds an item at the front of Deque. Return true if the operation is successful. */
func (this *MyCircularDeque) InsertFront(value int) bool {
	if this.IsFull() {
		return false
	} else {
		// front--
		if this.IsEmpty() {
			this.data[this.head] = value
		} else {
			this.head = (this.head - 1 + this.cap) % this.cap
			this.data[this.head] = value
		}
		this.count = this.count + 1
		return true
	}
}

/** Adds an item at the rear of Deque. Return true if the operation is successful. */
func (this *MyCircularDeque) InsertLast(value int) bool {
	if this.IsFull() {
		return false
	} else {
		// front--
		if this.IsEmpty() {
			this.data[this.tail] = value
		} else {
			this.tail = (this.tail + 1) % this.cap
			this.data[this.tail] = value
		}
		this.count = this.count + 1
		return true
	}
}

/** Deletes an item from the front of Deque. Return true if the operation is successful. */
func (this *MyCircularDeque) DeleteFront() bool {
	if this.IsEmpty() {
		return false
	} else {
		this.data[this.head] = 0
		this.head = (this.head - 1 + this.cap) % this.cap
		this.count = this.count - 1
		return true
	}
}

/** Deletes an item from the rear of Deque. Return true if the operation is successful. */
func (this *MyCircularDeque) DeleteLast() bool {
	if this.IsEmpty() {
		return false
	} else {
		this.data[this.head] = 0
		this.tail = (this.tail - 1 + this.cap) % this.cap
		this.count = this.count - 1
		return true
	}
}

/** Get the front item from the deque. */
func (this *MyCircularDeque) GetFront() int {
	if this.IsEmpty() {
		return -1
	} else {
		return this.data[this.head]
	}
}

/** Get the last item from the deque. */
func (this *MyCircularDeque) GetRear() int {
	if this.IsEmpty() {
		return -1
	} else {
		return this.data[this.tail]
	}
}

/** Checks whether the circular deque is empty or not. */
func (this *MyCircularDeque) IsEmpty() bool {
	return this.count == 0
}

/** Checks whether the circular deque is full or not. */
func (this *MyCircularDeque) IsFull() bool {
	return this.cap == this.count
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * obj := Constructor(k);
 * param_1 := obj.InsertFront(value);
 * param_2 := obj.InsertLast(value);
 * param_3 := obj.DeleteFront();
 * param_4 := obj.DeleteLast();
 * param_5 := obj.GetFront();
 * param_6 := obj.GetRear();
 * param_7 := obj.IsEmpty();
 * param_8 := obj.IsFull();
 */
