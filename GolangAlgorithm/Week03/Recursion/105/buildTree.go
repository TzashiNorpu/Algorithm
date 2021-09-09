package buildTree

import "Week03/Tree/BinaryTree"

func buildTree(preorder []int, inorder []int) *BinaryTree.TreeNode {
	//       1
	//   2      5
	// 3   4     7
	// inorder = [3,2,4,1,5,7]
	// preorder= [1,2,3,4,5,7]
	rootVal := preorder[0]
	leftVals := make([]int, 0)
	rightVals := make([]int, 0)
	rootIndex := 0
	for k, v := range inorder {
		if v == rootVal {
			rootIndex = k
			leftVals = inorder[:rootIndex]
			rightVals = inorder[rootIndex+1:]
			break
		}
	}
	return
}
