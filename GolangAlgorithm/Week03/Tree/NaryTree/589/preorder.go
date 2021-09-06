package preorder

import "Week03/Tree/NaryTree"

func preorder(root *NaryTree.Node) []int {
	res := make([]int, 0)
	var traverse func(root *NaryTree.Node)
	traverse = func(root *NaryTree.Node) {
		// 根  左 右
		if root == nil {
			return
		}
		res = append(res, root.Val)
		if root.Children != nil {
			for _, node := range root.Children {
				traverse(node)
			}
		}
	}
	traverse(root)
	return res
}
