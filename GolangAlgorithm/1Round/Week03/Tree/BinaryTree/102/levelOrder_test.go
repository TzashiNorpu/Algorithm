package levelOrder

import (
	"Week03/Tree/BinaryTree"
	"reflect"
	"testing"
)

func Test_levelOrder(t *testing.T) {
	type args struct {
		root *BinaryTree.TreeNode
	}
	tests := []struct {
		name string
		args args
		want [][]int
	}{
		// TODO: Add test cases.
		{name: "test1", args: args{root: &BinaryTree.TreeNode{Val: 1, Left: &BinaryTree.TreeNode{Val: 2}, Right: &BinaryTree.TreeNode{Val: 3}}}, want: [][]int{{1}, {2, 3}}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := levelOrder(tt.args.root); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("levelOrder() = %v, want %v", got, tt.want)
			}
		})
	}
}
