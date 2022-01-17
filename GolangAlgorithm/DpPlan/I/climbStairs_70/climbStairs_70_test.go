package climbStairs_70

import "testing"

func Test_climbStairs(t *testing.T) {
	type args struct {
		n int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "test1", args: struct{ n int }{n: 1}, want: 1},
		{name: "test1", args: struct{ n int }{n: 2}, want: 2},
		{name: "test1", args: struct{ n int }{n: 4}, want: 5},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := climbStairs(tt.args.n); got != tt.want {
				t.Errorf("climbStairs() = %v, want %v", got, tt.want)
			}
		})
	}
}
