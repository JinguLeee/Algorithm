def dfs(path, visited):
    if len(path) == M:
        if tuple(path) not in compare_set:
            compare_set.add(tuple(path))
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
compare_set = set()
dfs([], visited)