import sys
si = sys.stdin.readline
M, N = map(int, si().split(' '))
board = [list(si().strip()) for _ in range(M)]

result = 64
for row_start in range(M-7):
    for col_start in range(N-7):
        count = 0
        for row in range(row_start, row_start+8):
            row_check = True if (row-row_start) % 2 == 0 else False
            for col in range(col_start, col_start+8):
                col_check = True if (col-col_start) % 2 == 0 else False
                if (row_check == col_check and board[row][col] == "B") or (row_check != col_check and board[row][col] == "W"):
                    count += 1
        result = min(result, count, 64-count)
print(result)