def dfs(idx):
    if idx == len(zero):
        for row in sudoku:
            print(*row)
        exit(0)

    x, y = zero[idx]
    for point in range(1, 10):
        if check(x, y, point):
            sudoku[x][y] = point
            dfs(idx + 1)
            sudoku[x][y] = 0


def check(x, y, point):
    for i in range(9):
        if sudoku[x][i] == point or sudoku[i][y] == point:
            return False

    xbox = x // 3 * 3
    ybox = y // 3 * 3
    for xpoint in range(xbox, xbox + 3):
        for ypoint in range(ybox, ybox + 3):
            if sudoku[xpoint][ypoint] == point:
                return False
    return True


import sys

si = sys.stdin.readline

sudoku = [list(map(int, si().split())) for _ in range(9)]
zero = [(x, y) for x in range(9) for y in range(9) if sudoku[x][y] == 0]
dfs(0)