def dfs(idx, start, center, end):
    if idx == 1:
        result.append([start, end])
        return
    dfs(idx - 1, start, end, center)
    result.append([start, end])
    dfs(idx - 1, center, start, end)


import sys
from collections import deque

si = sys.stdin.readline
N = int(si())

result = []
dfs(N, 1, 2, 3)
print(len(result))
for row in result:
    print(*row)