N = int(input())
data = [[' '] * (N*2-1) for _ in range(N)]
data[0][N-1] = '*'

for row in range(0, N, 3):
    for col in range(2, N*2-3):
        if row != 0 and data[row-3][col] == '*':
            data[row][col-3] = '*' if data[row][col-3] != '*' else ' '
            data[row][col+3] = '*'

    for col in range(2, N*2-3):
        if data[row][col] == '*':
            data[row+1][col-1] = data[row+1][col+1]= '*'
            data[row+2][col-2] = data[row+2][col-1] = data[row+2][col] = data[row+2][col+1] = data[row+2][col+2]= '*'

    print(''.join(data[row]))
    print(''.join(data[row+1]))
    print(''.join(data[row+2]))