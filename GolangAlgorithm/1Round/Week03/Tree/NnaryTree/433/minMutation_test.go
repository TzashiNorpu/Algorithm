package minMutation

import "testing"

func Test_minMutation1(t *testing.T) {
	type args struct {
		start string
		end   string
		bank  []string
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "Test1...", args: struct {
			start string
			end   string
			bank  []string
		}{start: "AACCGGTT", end: "AACCGGTA", bank: []string{"AACCGGTA"}}, want: 1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minMutation1(tt.args.start, tt.args.end, tt.args.bank); got != tt.want {
				t.Errorf("minMutation() = %v, want %v", got, tt.want)
			}
		})
	}
}

func Test_minMutation2(t *testing.T) {
	type args struct {
		start string
		end   string
		bank  []string
	}
	tests := []struct {
		name string
		args args
		want int
	}{
		{name: "Test2...", args: struct {
			start string
			end   string
			bank  []string
		}{start: "AACCGGTT", end: "AACCGGTA", bank: []string{"AACCGGTA"}}, want: 1},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := minMutation2(tt.args.start, tt.args.end, tt.args.bank); got != tt.want {
				t.Errorf("minMutation2() = %v, want %v", got, tt.want)
			}
		})
	}
}
