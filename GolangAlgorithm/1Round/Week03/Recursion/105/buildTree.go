package buildTree

import "Week03/Tree/BinaryTree"

func buildTree(preorder []int, inorder []int) *BinaryTree.TreeNode {
	//       1
	//   2      5
	// 3   4     7

	// preorder= [1,2,3,4,5,7]
	// inorder = [3,2,4,1,5,7]

	// preorder: 根节点|----------------左子树-----------------|-------------------右子树-------------------|
	//         preLeft|preLeft+1       preLeft+pIndex-inLeft|preLeft+pIndex-inLeft+1            preRight|

	// inorder: |----------------左子树-----------------|根节点|------------------右子树-------------------|
	//    inLeft|                             pIndex-1|pindex|pIndex+1                          inRight|
	preLen := len(preorder)
	inLen := len(inorder)
	m := map[int]int{}
	for k, v := range inorder {
		m[v] = k
	}
	return build(preorder, 0, preLen-1, inorder, 0, inLen-1, m)
}

// init:0 5  0 5
// root node 1:(0+1=1) (3-0+0=3) pre:[1,3] (0) (3-1=2)  in:[0-2]
// root node 2:(1+1=2) (1-0+1=2) pre:[2,2] (0) (1-1=0)  in:[0,0]
func build(preorder []int, preLeft int, preRight int, inorder []int, inLeft int, inRight int, m map[int]int) *BinaryTree.TreeNode {
	if preLeft > preRight || inLeft > inRight {
		return nil
	}
	rootVal := preorder[preLeft]
	root := &BinaryTree.TreeNode{Val: rootVal}
	pIndex := m[rootVal]
	root.Left = build(preorder, preLeft+1, pIndex-inLeft+preLeft, inorder, inLeft, pIndex-1, m)
	root.Right = build(preorder, pIndex-inLeft+preLeft+1, preRight, inorder, pIndex+1, inRight, m)
	return root
}
