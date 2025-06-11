def dfs(start, path):
    if len(path) == M:
        print(*path)
    else:
        for i in range(start, N+1):
            dfs(i+1, path+[i])


N, M = map(int, input().split(' '))
dfs(1, [])