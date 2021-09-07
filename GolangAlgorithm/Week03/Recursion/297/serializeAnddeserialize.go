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

func (this *Codec) dfsSerialize(root *BinaryTree.TreeNode) string {
	if root == nil {
		return "X"
	}
	return strconv.Itoa(root.Val) + "," + this.dfsSerialize(root.Left) + "," + this.dfsSerialize(root.Right)
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

func (this *Codec) bfsSerialize(root *BinaryTree.TreeNode) string {
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

			if node != nil {
				stack = append(stack, node.Left)
				stack = append(stack, node.Right)
			}

			if node == nil {
				res += nilStr + ","
			} else {
				res += strconv.Itoa(node.Val) + ","
			}
		}
		stack = stack[size:]
	}
	return strings.TrimRight(res, ",")
}

func (this *Codec) bfsDeserialize(data string) *BinaryTree.TreeNode {
	list := strings.Split(data, ",")
	// i l:2*i+1    r:2*i+2
	val, _ := strconv.Atoi(list[0])
	root := &BinaryTree.TreeNode{Val: val}
	res := root
	for i := 0; i < len(list)-4; i++ {
		val, _ := strconv.Atoi(list[i])
		root.Val = val
		if lVal, err := strconv.Atoi(list[2*i+1]); err != nil {
			root.Left = nil
		} else {
			root.Left = &BinaryTree.TreeNode{Val: lVal}
		}
		if rVal, err := strconv.Atoi(list[2*i+2]); err != nil {
			root.Right = nil
		} else {
			root.Right = &BinaryTree.TreeNode{Val: rVal}
		}

		nxtRootVal, _ := strconv.Atoi(list[i+1])
		root = &BinaryTree.TreeNode{Val: nxtRootVal}
		i = i + 1
	}
	return res
}
