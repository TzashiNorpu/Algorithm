package reverseKGroup_025

import (
	"Chapter3"
	"reflect"
	"testing"
)

func Test_reverseKGroup(t *testing.T) {
	type args struct {
		head *Chapter3.ListNode
		k    int
	}
	tests := []struct {
		name string
		args args
		want *Chapter3.ListNode
	}{
		{name: "Test1", args: args{head: &Chapter3.ListNode{Val: 1, Next: &Chapter3.ListNode{Val: 2, Next: &Chapter3.ListNode{Val: 3, Next: &Chapter3.ListNode{Val: 4, Next: &Chapter3.ListNode{Val: 5, Next: nil}}}}}, k: 2},
			want: &Chapter3.ListNode{Val: 2, Next: &Chapter3.ListNode{Val: 1, Next: &Chapter3.ListNode{Val: 4, Next: &Chapter3.ListNode{Val: 3, Next: &Chapter3.ListNode{Val: 5, Next: nil}}}}}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := reverseKGroup(tt.args.head, tt.args.k); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("reverseKGroup() = %v, want %v", got, tt.want)
			}
		})
	}
}
