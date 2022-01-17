package rob_198

import "testing"

func Test_rob(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "test1", args: struct{ nums []int }{nums: []int{1, 2, 3, 1}}, want: int(4)},
		{name: "test2", args: struct{ nums []int }{nums: []int{2, 7, 9, 3, 1}}, want: int(12)},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := rob(tt.args.nums); got != tt.want {
				t.Errorf("rob() = %v, want %v", got, tt.want)
			}
		})
	}
}
