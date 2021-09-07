package minDepth

import (
	"Week03/Tree/BinaryTree"
	"math"
)

func dfs(root *BinaryTree.TreeNode) int {
	min := math.MaxInt
	if root == nil {
		return 0
	}
	var traverse func(root *BinaryTree.TreeNode, level int)
	traverse = func(root *BinaryTree.TreeNode, level int) {
		if root == nil {
			return
		}
		if root.Left == nil && root.Right == nil {
			if level < min {
				min = level
			}
			return
		}
		level = level + 1
		traverse(root.Left, level)
		traverse(root.Right, level)
	}
	traverse(root, 1)
	return min
}

func bfs(root *BinaryTree.TreeNode) int {
	min := 0
	stack := make([]*BinaryTree.TreeNode, 0)
	if root == nil {
		return min
	}
	stack = append(stack, root)
	min = min + 1
	for len(stack) > 0 {
		size := len(stack)
		for i := 0; i < size; i++ {
			pop := stack[0]
			// stack = stack[1:] 可替换为 for 外面的 stack = stack[size:]
			if pop.Left == nil && pop.Right == nil {
				return min
			}
			if pop.Left != nil {
				stack = append(stack, pop.Left)
			}
			if pop.Right != nil {
				stack = append(stack, pop.Right)
			}
		}
		min = min + 1
		stack = stack[size:]
	}
	return min
}
