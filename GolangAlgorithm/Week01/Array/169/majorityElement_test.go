package majorityElement

import "testing"

func Test_majorityElement(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		// TODO: Add test cases.
		{name: "test1", args: struct{ nums []int }{nums: []int{1, 1, 2}}, want: 1},
		{name: "test2", args: struct{ nums []int }{nums: []int{1, 2, 3, 4, 3, 4, 3, 3, 3}}, want: 3},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := majorityElement(tt.args.nums); got != tt.want {
				t.Errorf("majorityElement() = %v, want %v", got, tt.want)
			}
		})
	}
}
