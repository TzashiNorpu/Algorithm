package serializeAnddeserialize

import (
	"Week03/Tree/BinaryTree"
	"strconv"
	"strings"
)

type Codec1 struct {
	buffer strings.Builder
	temp   []string
	nilStr byte
	//queue  Queue
}

func Constructor1() Codec1 {
	return Codec1{
		strings.Builder{},
		nil,
		'X',
	}
}

func (this *Codec1) serialize(root *BinaryTree.TreeNode) string {
	if root == nil {
		this.buffer.WriteByte(this.nilStr)
		this.buffer.WriteByte(',')
		return this.buffer.String()
	} else {
		this.buffer.WriteString(strconv.Itoa(root.Val))
		this.buffer.WriteByte(',')
		this.serialize(root.Left)
		this.serialize(root.Right)
		return this.buffer.String()
	}

}

func (this *Codec1) deserialize(data string) *BinaryTree.TreeNode {
	if len(data) == 0 {
		return nil
	}
	this.temp = strings.Split(data, ",")
	return this.dese()
}

func (this *Codec1) dese() *BinaryTree.TreeNode {
	if this.temp[0] == string(this.nilStr) {
		this.temp = this.temp[1:]
		return nil
	} else {
		node := new(BinaryTree.TreeNode)
		node.Val, _ = strconv.Atoi(this.temp[0])
		this.temp = this.temp[1:]
		node.Left = this.dese()
		node.Right = this.dese()
		return node
	}
}
