import sys
si = sys.stdin.readline
INF = int(1e9)

N = int(si())
rgb = [tuple(map(int, si().strip().split())) for _ in range(N)]
result = []
for color in range(3):
    dp = [[0]*(N-1) for _ in range(3)]
    a = (color+1) % 3
    b = (color+2) % 3

    dp[color][0] = rgb[0][color]
    dp[a][0] = INF
    dp[b][0] = INF

    for col in range(1, N-1):
        for row in range(3):
            a = (row+1) % 3
            b = (row+2) % 3
            dp[row][col] = rgb[col][row] + min(dp[a][col-1], dp[b][col-1])
    
    a = (color+1) % 3
    b = (color+2) % 3
    result.append(rgb[-1][a] + min(dp[color][-1], dp[b][-1]))
    result.append(rgb[-1][b] + min(dp[color][-1], dp[a][-1]))
print(min(result))