package maxScoreSightseeingPair_1014

import "testing"

func Test_maxScoreSightseeingPair(t *testing.T) {
	type args struct {
		values []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "Test1", args: struct{ values []int }{values: []int{8, 1, 5, 2, 6}}, want: 11},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := maxScoreSightseeingPair(tt.args.values); got != tt.want {
				t.Errorf("maxScoreSightseeingPair() = %v, want %v", got, tt.want)
			}
		})
	}
}
