def dfs(curr):
    visited[curr] = True
    for num in num_dict[curr]:
        if not visited[num]:
            result[num] = curr
            dfs(num)

from collections import defaultdict
import sys
sys.setrecursionlimit(10**6)
si = sys.stdin.readline

N = int(si())
num_dict = defaultdict(set)
for _ in range(1, N):
    a, b = map(int, si().split())
    num_dict[a].add(b)
    num_dict[b].add(a)

result = [0] * (N+1)
visited = [False] * (N+1)
dfs(1)
print("\n".join(map(str, result[2:])))