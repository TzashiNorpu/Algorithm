package largestValues

import (
	"Week03/Tree/BinaryTree"
	"reflect"
	"testing"
)

func Test_largestValuesByBFS(t *testing.T) {
	type args struct {
		root *BinaryTree.TreeNode
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		{
			name: "Test1...",
			args: struct{ root *BinaryTree.TreeNode }{root: &BinaryTree.TreeNode{Val: 1,
				Left: &BinaryTree.TreeNode{Val: 3,
					Left:  &BinaryTree.TreeNode{Val: 5},
					Right: &BinaryTree.TreeNode{Val: 3}},
				Right: &BinaryTree.TreeNode{Val: 2, Right: &BinaryTree.TreeNode{Val: 9}}}},
			want: []int{1, 3, 9},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := largestValuesByBFS(tt.args.root); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("largestValuesByBFS() = %v, want %v", got, tt.want)
			}
		})
	}
}

func Test_largestValuesByDFS(t *testing.T) {
	type args struct {
		root *BinaryTree.TreeNode
	}
	tests := []struct {
		name string
		args args
		want []int
	}{
		{
			name: "Test2...",
			args: struct{ root *BinaryTree.TreeNode }{root: &BinaryTree.TreeNode{Val: 1,
				Left: &BinaryTree.TreeNode{Val: 3,
					Left:  &BinaryTree.TreeNode{Val: 5},
					Right: &BinaryTree.TreeNode{Val: 3}},
				Right: &BinaryTree.TreeNode{Val: 2, Right: &BinaryTree.TreeNode{Val: 9}}}},
			want: []int{1, 3, 9},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := largestValuesByDFS(tt.args.root); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("largestValuesByDFS() = %v, want %v", got, tt.want)
			}
		})
	}
}
