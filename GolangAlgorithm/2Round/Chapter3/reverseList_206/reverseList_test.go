package reverseList_206

import (
	"Chapter3"
	"reflect"
	"testing"
)

func Test_reverseList(t *testing.T) {
	type args struct {
		head *Chapter3.ListNode
	}
	tests := []struct {
		name string
		args args
		want *Chapter3.ListNode
	}{
		{name: "Test1",
			args: args{head: &Chapter3.ListNode{1, &Chapter3.ListNode{2, &Chapter3.ListNode{3, nil}}}},
			want: &Chapter3.ListNode{3, &Chapter3.ListNode{2, &Chapter3.ListNode{1, nil}}}},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := reverseListDfs(tt.args.head); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("reverseList() = %v, want %v", got, tt.want)
			}
		})
	}
}

func Test_reverseListDfs(t *testing.T) {
	type args struct {
		head *Chapter3.ListNode
	}
	tests := []struct {
		name string
		args args
		want *Chapter3.ListNode
	}{
		{name: "Test2",
			args: args{head: &Chapter3.ListNode{1, &Chapter3.ListNode{2, &Chapter3.ListNode{3, nil}}}},
			want: &Chapter3.ListNode{3, &Chapter3.ListNode{2, &Chapter3.ListNode{1, nil}}},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := reverseListDfs(tt.args.head); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("reverseListDfs() = %v, want %v", got, tt.want)
			}
		})
	}
}
