package minCostClimbingStairs_746

import "testing"

func Test_minCostClimbingStairs(t *testing.T) {
	type args struct {
		cost []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "test1", args: struct{ cost []int }{cost: []int{10, 15, 20}}, want: int(15)},
		{name: "test1", args: struct{ cost []int }{cost: []int{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}}, want: int(6)},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minCostClimbingStairs(tt.args.cost); got != tt.want {
				t.Errorf("minCostClimbingStairs() = %v, want %v", got, tt.want)
			}
		})
	}
}
