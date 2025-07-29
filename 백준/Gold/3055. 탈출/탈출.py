def move(row, col):
    if row >=0 and row < N and col >= 0 and col < M and not visited[row][col] :
        visited[row][col] = True
        return True
    else:
        return False
        

import sys
si = sys.stdin.readline
from collections import deque
N, M = map(int, si().split())

root = []
start = deque()
water = deque()
visited = [[False]*M for _ in range(N)]
for row in range(N):
    root.append(tuple(input().strip()))
    for col in range(M):
        match root[row][col]:
            case "S":
                start.append([row, col])
                visited[row][col] = True
            case "D":
                end = [row, col]
                visited[row][col] = True
            case "*":
                water.append([row, col])
                visited[row][col] = True
            case "X":
                visited[row][col] = True

dr = [1, -1, 0, 0]
dc = [0, 0, 1, -1]
count = 0
isEnd = False
while start:
    count += 1
    for _ in range(len(water)):
        row, col = water.popleft()
        for i in range(4):
            nr = row+dr[i]
            nc = col+dc[i]
            if move(nr, nc):
                water.append([nr, nc])

    for _ in range(len(start)):
        row, col = start.popleft()
        for i in range(4):
            nr = row+dr[i]
            nc = col+dc[i]
            if [nr, nc] == end:
                print(count)
                sys.exit()
            if move(nr, nc):
                start.append([nr, nc])
print('KAKTUS')