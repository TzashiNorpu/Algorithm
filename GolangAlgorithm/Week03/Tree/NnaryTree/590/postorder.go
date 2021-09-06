package postorder

import "Week03/Tree/NnaryTree"

func postorder(root *NnaryTree.Node) []int {
	res := make([]int, 0)
	var traverse func(root *NnaryTree.Node)
	traverse = func(root *NnaryTree.Node) {
		// 左 右 根
		if root == nil {
			return
		}
		if root.Children != nil {
			for _, node := range root.Children {
				traverse(node)
			}
		}
		res = append(res, root.Val)
	}
	traverse(root)
	return res
}
