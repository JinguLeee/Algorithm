import sys
si = sys.stdin.readline

def dfs(path, visited):
    if len(path) == M:
        print(*path)
    else:
        for i in range(N):
            if visited[i] == False:
                visited[i] = True
                dfs(path+[i+1], visited)
                visited[i] = False

N, M = map(int, si().split(' '))
visited = [False]*N
dfs([], visited)