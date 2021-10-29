package updateBoard

func updateBoard(board [][]byte, click []int) [][]byte {
	clickX := click[0]
	clickY := click[1]
	dx := []int{-1, 0, 1, -1, 1, -1, 0, 1}
	dy := []int{-1, -1, -1, 0, 0, 1, 1, 1}
	if board[clickX][clickY] == 'M' {
		board[clickX][clickY] = 'X'
		return board
	}
	var invalid func(x int, y int, board [][]byte) bool
	invalid = func(x int, y int, board [][]byte) bool {
		return x < 0 || x >= len(board) || y < 0 || y >= len(board[0])
	}
	var dfs func(clickX int, clickY int, board [][]byte)
	dfs = func(clickX int, clickY int, board [][]byte) {
		cnt := 0
		for i := 0; i < 8; i++ {
			x := clickX + dx[i]
			y := clickY + dy[i]

			if invalid(x, y, board) {
				continue
			}
			if board[x][y] == 'M' {
				cnt++
			}
		}
		if cnt > 0 {
			board[clickX][clickY] = byte('0' + cnt)
			return
		}
		board[clickX][clickY] = 'B'
		for i := 0; i < 8; i++ {
			x := clickX + dx[i]
			y := clickY + dy[i]

			if !invalid(x, y, board) && board[x][y] == 'E' {
				dfs(x, y, board)
			}
		}
	}
	dfs(clickX, clickY, board)
	return board
}
