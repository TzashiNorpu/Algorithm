package levelOrder

import "Week03/Tree/BinaryTree"

func levelOrder(root *BinaryTree.TreeNode) [][]int {
	var res = make([][]int, 0)
	stack := make([]*BinaryTree.TreeNode, 0)
	stack = append(stack, root)
	for len(stack) > 0 {
		length := len(stack)
		var temp = make([]int, 0)
		for i := 0; i < length; i++ {
			pop := stack[0]
			stack = stack[1:]
			if pop.Left != nil {
				stack = append(stack, pop.Left)
			}
			if pop.Right != nil {
				stack = append(stack, pop.Right)
			}
			temp = append(temp, pop.Val)
		}
		res = append(res, temp)
	}
	return res
}
