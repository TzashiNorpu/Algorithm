package MinStack

type MinStack struct {
	size, min_index int
	data            []int
}

/** initialize your data structure here. */
func Constructor() MinStack {
	return MinStack{min_index: 0, size: 0, data: make([]int, 0)}
}

func (this *MinStack) Push(val int) {
	this.data = append(this.data, val)
	this.size = this.size + 1
	if val < this.data[this.min_index] {
		this.min_index = this.size - 1
	}
}

func (this *MinStack) Pop() {
	if this.size == 0 {
		panic("元素个数为0")
	}
	this.size = this.size - 1
	this.data = this.data[:this.size]
	if this.min_index == this.size {
		this.min_index = 0
		for i := 0; i < this.size; i++ {
			if this.data[i] < this.data[this.min_index] {
				this.min_index = i
			}
		}
	}
}

func (this *MinStack) Top() int {
	return this.data[this.size-1]
}

func (this *MinStack) GetMin() int {
	return this.data[this.min_index]
}
