def dfs(start, path):
    if len(path) == 6:
        print(' '.join(map(str, path)))
        return
    for i in range(start, num_len):
        dfs(i + 1, path + [num_list[i]])


import sys
si = sys.stdin.readline

first = True
while True:
    num_list = list(map(int, si().split()))
    num_len = len(num_list)
    if num_len == 1 and num_list[0] == 0:
        break
    if first: first = False
    else: print()
    dfs(1, [])