package rob_213

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
		{name: "Test1", args: struct{ nums []int }{nums: []int{2, 3, 2}}, want: 3},
		{name: "Test2", args: struct{ nums []int }{nums: []int{1, 2, 3, 1}}, want: 4},
		{name: "Test3", args: struct{ nums []int }{nums: []int{1}}, want: 1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := rob(tt.args.nums); got != tt.want {
				t.Errorf("rob() = %v, want %v", got, tt.want)
			}
		})
	}
}
