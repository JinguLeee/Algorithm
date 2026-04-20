def dfs(num, parent):
    rank_list[num] = 1
    for point in graph[num]:
        if point != parent:
            dfs(point, num)
            rank_list[num] += rank_list[point]


import sys

sys.setrecursionlimit(10**6)
si = sys.stdin.readline
from collections import defaultdict

point_cnt, point, result_cnt = map(int, si().split())
graph = defaultdict(list)

for _ in range(point_cnt - 1):
    a, b = map(int, si().split())
    graph[a].append(b)
    graph[b].append(a)

num_set = set()
rank_list = [0] * (point_cnt + 1)
dfs(point, 0)

for _ in range(result_cnt):
    print(rank_list[int(si())])
