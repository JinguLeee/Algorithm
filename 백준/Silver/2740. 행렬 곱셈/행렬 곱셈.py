import sys

si = sys.stdin.readline
N, M = map(int, si().split())
A_map = [list(map(int, si().split())) for _ in range(N)]
M, K = map(int, si().split())
B_map = [list(map(int, si().split())) for _ in range(M)]
result = [[0] * K for _ in range(N)]

for A_row in range(N):
    for A_col in range(M):
        for B_col in range(K):
            result[A_row][B_col] += A_map[A_row][A_col] * B_map[A_col][B_col]

for row in result:
    print(" ".join(str(num) for num in row))
