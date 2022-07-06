package checkPowersOfThree_1780

import "testing"

func Test_checkPowersOfThree(t *testing.T) {
	type args struct {
		n int
	}
	tests := []struct {
		name string
		args args
		want bool
	}{
		{name: "test1", args: struct{ n int }{n: 12}, want: true},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := checkPowersOfThree(tt.args.n); got != tt.want {
				t.Errorf("checkPowersOfThree() = %v, want %v", got, tt.want)
			}
		})
	}
}
