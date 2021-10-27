package levelOrder

import (
	"Week03/Tree/NnaryTree"
)

func levelOrder(root *NnaryTree.Node) [][]int {
	res := make([][]int, 0)
	if root == nil {
		return res
	}
	stack := make([]*NnaryTree.Node, 0)
	stack = append(stack, root)
	/*for len(stack) > 0 {
	item := make([]int, 0)
	size := len(stack)
	for i := 0; i < size; i++ {
		pop := stack[i]
		item = append(item, pop.Val)
		for _, node := range pop.Children {
			stack = append(stack, node)
		}
	}
	// 在for循环中pop会导致数组取到的值不对
	stack = append(stack[size:])
	res = append(res, item)*/

	for len(stack) > 0 {
		item := make([]int, 0)
		size := len(stack)
		for i := 0; i < size; i++ {
			pop := stack[0]
			item = append(item, pop.Val)
			stack = append(stack[1:])
			for _, node := range pop.Children {
				stack = append(stack, node)
			}
		}
		res = append(res, item)
	}
	return res
}
