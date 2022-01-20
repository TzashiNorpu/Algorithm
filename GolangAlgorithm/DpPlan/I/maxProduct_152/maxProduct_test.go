package maxProduct_152

import "testing"

func Test_maxProduct(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "Test1", args: struct{ nums []int }{nums: []int{2, 3, -2, 4}}, want: 6},
		{name: "Test2", args: struct{ nums []int }{nums: []int{-2, 0, -1}}, want: 0},
		{name: "Test3", args: struct{ nums []int }{nums: []int{-2}}, want: -2},
		{name: "Test4", args: struct{ nums []int }{nums: []int{7, -2, -4}}, want: 56},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxProduct(tt.args.nums); got != tt.want {
				t.Errorf("maxProduct() = %v, want %v", got, tt.want)
			}
		})
	}
}
