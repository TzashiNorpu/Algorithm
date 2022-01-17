package jump_45

import "testing"

func Test_jump(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "test1", args: struct{ nums []int }{nums: []int{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3}}, want: 2},
		{name: "test2", args: struct{ nums []int }{nums: []int{2, 3, 1, 1, 4}}, want: 2},
		{name: "test3", args: struct{ nums []int }{nums: []int{0}}, want: 0},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := jump(tt.args.nums); got != tt.want {
				t.Errorf("jump() = %v, want %v", got, tt.want)
			}
		})
	}
}
