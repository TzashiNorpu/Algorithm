package numIslands

func numIslands(grid [][]byte) int {
	r := len(grid)
	c := len(grid[0])

	var dfs func(r int, c int, grid [][]byte)
	dfs = func(r int, c int, grid [][]byte) {
		var invalid func(r int, c int, grid [][]byte) bool
		invalid = func(r int, c int, grid [][]byte) bool {
			return r < 0 || r >= len(grid) || c < 0 || c >= len(grid[0])
		}
		if invalid(r, c, grid) {
			return
		}
		if grid[r][c] != '1' {
			return
		}
		grid[r][c] = 'B'
		dfs(r+1, c, grid)
		dfs(r-1, c, grid)
		dfs(r, c+1, grid)
		dfs(r, c-1, grid)
	}
	cnt := 0
	for i := 0; i < r; i++ {
		for j := 0; j < c; j++ {
			if grid[i][j] == '1' {
				dfs(i, j, grid)
				cnt++
			}
		}
	}
	return cnt
}
