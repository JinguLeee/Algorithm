def dfs(path, visited):
    if len(path) == M:
        print(*path)
    else:
        for i in range(N):
            if visited[i] == False:
                visited[i] = True
                dfs(path+[num_list[i]], visited)
                visited[i] = False

N, M = map(int, input().split(' '))
num_list = sorted(list(map(int, input().split(' '))))
visited = [False]*N
dfs([], visited)