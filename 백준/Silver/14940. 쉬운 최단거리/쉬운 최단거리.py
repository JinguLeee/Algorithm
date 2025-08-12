def move(point, count):
    for i in range(4):
        x = point[0] + dr[i]
        y = point[1] + dc[i]
        if 0 <= x < row and 0 <= y < col and root[x][y] == 1 and result[x][y] == -1:
            result[x][y] = count
            end.append([x, y])


import sys
from collections import deque

si = sys.stdin.readline
row, col = map(int, si().split())

root = []
end = deque()
result = [[-1] * col for _ in range(row)]
for r in range(row):
    root.append(tuple(map(int, si().split())))
    for c in range(col):
        if root[r][c] != 1:
            result[r][c] = 0
            if root[r][c] == 2:
                end.append([r, c])

dr = [1, -1, 0, 0]
dc = [0, 0, 1, -1]
count = 1
while end:
    for _ in range(len(end)):
        move(end.popleft(), count)
    count += 1

for i in range(row):
    print(*result[i])