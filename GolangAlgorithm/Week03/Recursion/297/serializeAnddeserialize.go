package serializeAnddeserialize

import (
	"Week03/Tree/BinaryTree"
	"strconv"
	"strings"
)

type Codec struct {
}

func Constructor() Codec {
	return Codec{}
}

func (this *Codec) dfsDerialize(root *BinaryTree.TreeNode) string {
	if root == nil {
		return "X"
	}
	return strconv.Itoa(root.Val) + "," + this.dfsDerialize(root.Left) + "," + this.dfsDerialize(root.Right)
}
func (this *Codec) bfsDerialize(root *BinaryTree.TreeNode) string {
	nilStr := "X"
	if root == nil {
		return nilStr
	}
	var res string
	stack := make([]*BinaryTree.TreeNode, 0)
	stack = append(stack, root)
	for len(stack) > 0 {
		size := len(stack)
		for i := 0; i < size; i++ {
			node := stack[i]

			if node.Left != nil {
				stack = append(stack, node.Left)
			}
			if node.Right != nil {
				stack = append(stack, node.Right)
			}

			res += strconv.Itoa(node.Val) + ","
			if node.Left == nil {
				res += nilStr + ","
			}
			if node.Right == nil {
				res += nilStr + ","
			}
		}
		stack = stack[size:]
	}
	return res
}

func (this *Codec) dfsDeserialize(data string) *BinaryTree.TreeNode {
	list := strings.Split(data, ",")
	return buildTree(&list)
}

func buildTree(list *[]string) *BinaryTree.TreeNode {
	rootVal := (*list)[0]
	*list = (*list)[1:]
	if rootVal == "X" {
		return nil
	}
	Val, _ := strconv.Atoi(rootVal)
	root := &BinaryTree.TreeNode{Val: Val}
	root.Left = buildTree(list)
	root.Right = buildTree(list)
	return root
}
