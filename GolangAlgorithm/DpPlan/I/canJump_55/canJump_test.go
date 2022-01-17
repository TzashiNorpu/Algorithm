package canJump_55

import "testing"

func Test_canJump(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{name: "Test1", args: struct{ nums []int }{nums: []int{3, 2, 1, 0, 4}}, want: false},
		{name: "Test2", args: struct{ nums []int }{nums: []int{1}}, want: true},
		{name: "Test3", args: struct{ nums []int }{nums: []int{0}}, want: true},
		{name: "Test4", args: struct{ nums []int }{nums: []int{2, 3, 1, 1, 4}}, want: true},
		{name: "Test5", args: struct{ nums []int }{nums: []int{0, 2, 3}}, want: false},
		{name: "Test5", args: struct{ nums []int }{nums: []int{2, 0, 0}}, want: true},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := canJump(tt.args.nums); got != tt.want {
				t.Errorf("canJump() = %v, want %v", got, tt.want)
			}
		})
	}
}
