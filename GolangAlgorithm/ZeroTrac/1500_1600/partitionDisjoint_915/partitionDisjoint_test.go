package partitionDisjoint_915

import "testing"

func Test_partitionDisjoint(t *testing.T) {
	type args struct {
		nums []int
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "Test1", args: struct{ nums []int }{nums: []int{32, 57, 24, 19, 0, 24, 49, 67, 87, 87}}, want: 7},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := partitionDisjoint(tt.args.nums); got != tt.want {
				t.Errorf("partitionDisjoint() = %v, want %v", got, tt.want)
			}
		})
	}
}
