def dfs(start, path):
    if len(path) == M:
        if tuple(path) not in compare_set:
            compare_set.add(tuple(path))
            print(*path)
    else:
            
        for i in range(start, N):
            dfs(i, path+[num_list[i]])


N, M = map(int, input().split(' '))
num_list = sorted(list(map(int, input().split(' '))))
compare_set = set()
dfs(0, [])