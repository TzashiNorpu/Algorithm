package maxSubArray_53

import "testing"

func Test_maxSubArray(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "Test1", args: struct{ nums []int }{nums: []int{-2, 1, -3, 4, -1, 2, 1, -5, 4}}, want: 6},
		{name: "Test2", args: struct{ nums []int }{nums: []int{-2, 1}}, want: 1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxSubArray(tt.args.nums); got != tt.want {
				t.Errorf("maxSubArray() = %v, want %v", got, tt.want)
			}
		})
	}
}
