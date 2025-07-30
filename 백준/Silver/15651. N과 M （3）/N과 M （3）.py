def dfs(path):
    if len(path) == M:
        print(' '.join(map(str, path)))
        return
    for i in range(1, N + 1):
        dfs(path + [i])

import sys
si = sys.stdin.readline
N, M = map(int, si().split(' '))
dfs([])