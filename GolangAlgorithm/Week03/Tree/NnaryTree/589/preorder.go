package preorder

import "Week03/Tree/NnaryTree"

func preorder(root *NnaryTree.Node) []int {
	res := make([]int, 0)
	var traverse func(root *NnaryTree.Node)
	traverse = func(root *NnaryTree.Node) {
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
