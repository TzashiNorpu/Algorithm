package maxDepth

import "Week03/Tree/BinaryTree"

func dfs(root *BinaryTree.TreeNode) int {
	max := 0
	var traverse func(root *BinaryTree.TreeNode, depth int)
	traverse = func(root *BinaryTree.TreeNode, depth int) {
		if root == nil {
			if depth > max {
				max = depth
			}
			return
		}
		traverse(root.Left, depth+1)
		traverse(root.Right, depth+1)
	}
	traverse(root, 0)
	return max
}

func bfs(root *BinaryTree.TreeNode) int {
	max := 0
	if root == nil {
		return max
	}
	stack := make([]*BinaryTree.TreeNode, 0)
	stack = append(stack, root)
	for len(stack) > 0 {
		size := len(stack)
		max = max + 1
		for i := 0; i < size; i++ {
			pop := stack[0]
			stack = stack[1:]
			if pop.Left != nil {
				stack = append(stack, pop.Left)
			}
			if pop.Right != nil {
				stack = append(stack, pop.Right)
			}
		}
	}
	return max
}
