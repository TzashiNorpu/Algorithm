package findLadders

import (
	"reflect"
	"testing"
)

func Test_findLadders(t *testing.T) {
	type args struct {
		beginWord string
		endWord   string
		wordList  []string
	}
	tests := []struct {
		name string
		args args
		want [][]string
	}{
		{
			name: "Test1...",
			args: struct {
				beginWord string
				endWord   string
				wordList  []string
			}{beginWord: "hit", endWord: "cog", wordList: []string{"hot", "dot", "dog", "lot", "log", "cog"}},
			want: [][]string{{"hit", "hot", "dot", "dog", "cog"}, {"hit", "hot", "lot", "log", "cog"}},
		},
		/*	"hit"
			"cog"
		["hot","dot","dog","lot","log"]*/
		{
			name: "Test2...",
			args: struct {
				beginWord string
				endWord   string
				wordList  []string
			}{beginWord: "hit", endWord: "cog", wordList: []string{"hot", "dot", "dog", "lot", "log"}},
			want: [][]string{},
		},
	}
	for _, tt := range tests {
		t.Run(tt.name, func(t *testing.T) {
			if got := findLadders(tt.args.beginWord, tt.args.endWord, tt.args.wordList); !reflect.DeepEqual(got, tt.want) {
				t.Errorf("findLadders() = %v, want %v", got, tt.want)
			}
		})
	}
}
