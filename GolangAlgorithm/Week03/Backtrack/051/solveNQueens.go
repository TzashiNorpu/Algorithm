package solveNQueens

func solveNQueens(n int) [][]string {
	/*n = 4
	[[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]*/
	res := make([][]string, 0)
	chess := make([][]uint8, n)
	for i := 0; i < len(chess); i++ {
		chess[i] = make([]uint8, n)
	}
	placedCol := make([]bool, n)
	// row + col
	var placedPie []bool = make([]bool, 2*n-1)
	// row - col + n - 1
	var placedNa []bool = make([]bool, 2*n-1)
	var trackBack func(row int)
	trackBack = func(row int) {
		if row == n {
			temp := make([]string, 0)
			for i := 0; i < n; i++ {
				s := ""
				for j := 0; j < n; j++ {
					if chess[i][j] == 0 {
						chess[i][j] = '.'
					}
					s = string(chess[i][j]) + s
				}
				temp = append(temp, s)
			}
			res = append(res, temp)
			return
		}
		for col := 0; col < n; col++ {
			if !placedCol[col] && !placedPie[row+col] && !placedNa[row-col+n-1] {
				placedCol[col] = true
				placedPie[row+col] = true
				placedNa[row-col+n-1] = true
				chess[row][col] = 'Q'
				trackBack(row + 1)
				placedCol[col] = false
				placedPie[row+col] = false
				placedNa[row-col+n-1] = false
				chess[row][col] = '.'
			}
		}
	}
	trackBack(0)
	return res
}
