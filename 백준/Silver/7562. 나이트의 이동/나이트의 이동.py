def bfs(x, y):
    if -1 < x < N and -1 < y < N:
        if chess[x][y] == -1:
            return True
        elif chess[x][y] == 0:
            chess[x][y] = 1
            move.append([x, y])
        return False


def find():
    count = 0
    while True:
        count += 1
        size = len(move)
        for i in range(size):
            x, y = move.popleft()
            for i in range(len(dx)):
                find = bfs(x + dx[i], y + dy[i])
                if find:
                    result.append(count)
                    return


import sys
from collections import deque

si = sys.stdin.readline
dx = [-1, -1, -2, -2, 1, 1, 2, 2]
dy = [-2, 2, -1, 1, -2, 2, -1, 1]
result = []

for _ in range(int(si())):
    N = int(si())
    s_x, s_y = map(int, si().split())
    e_x, e_y = map(int, si().split())

    if s_x == e_x and s_y == e_y:
        result.append(0)
        continue

    chess = [[0] * N for _ in range(N)]
    chess[s_x][s_y] = 1
    chess[e_x][e_y] = -1

    move = deque()
    move.append([s_x, s_y])

    find()
print(*result, sep="\n")