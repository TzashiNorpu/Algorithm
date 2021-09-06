package postorder

import "Week03/Tree/NaryTree"

func postorder(root *NaryTree.Node) []int {
	res := make([]int, 0)
	var traverse func(root *NaryTree.Node)
	traverse = func(root *NaryTree.Node) {
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
