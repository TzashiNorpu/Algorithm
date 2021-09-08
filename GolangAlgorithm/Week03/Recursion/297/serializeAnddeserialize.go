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
	stack := make([]*BinaryTree.TreeNode, 0)
	// li l:i+2    r:i+3
	// ri l:i+3    r:i+4
	// 1,2,3,X,X,4,5,6,7,X, X, X, X, X, X
	// 0 1 2 3 4 5 6 7 8 9 10,11,12,13 14
	var nodeR *BinaryTree.TreeNode
	var nodeL *BinaryTree.TreeNode
	var node *BinaryTree.TreeNode
	// 根节点
	ele := list[0]
	val, _ := strconv.Atoi(ele)
	node = &BinaryTree.TreeNode{Val: val}
	res := node
	stack = append(stack, node)
	list = list[1:]

	for len(stack) > 0 {
		node = stack[0]
		eleL := list[0]
		if eleL != "X" {
			valL, _ := strconv.Atoi(eleL)
			nodeL = &BinaryTree.TreeNode{Val: valL}
		} else {
			nodeL = nil
		}
		eleR := list[1]
		if eleL != "X" {
			valR, _ := strconv.Atoi(eleR)
			nodeR = &BinaryTree.TreeNode{Val: valR}
		} else {
			nodeR = nil
		}

		node.Left = nodeL
		node.Right = nodeR

		list = list[2:]
		stack = stack[1:]
		if nodeL != nil {
			stack = append(stack, nodeL)
		}
		if nodeR != nil {
			stack = append(stack, nodeR)
		}
	}

	return res
}
