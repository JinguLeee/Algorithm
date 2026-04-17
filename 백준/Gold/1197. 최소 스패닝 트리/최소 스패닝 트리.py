def find(num):
    if num == parent[num]:
        return num
    else:
        parent[num] = find(parent[num])
        return parent[num]


import sys

sys.setrecursionlimit(10**6)
si = sys.stdin.readline
V, E = map(int, si().split())

graph = [tuple(map(int, si().split())) for _ in range(E)]
graph.sort(key=lambda x: x[2])

cnt = 0
result = 0
parent = [i for i in range(V)]
for line in graph:
    if cnt == V - 1:
        break
    a, b, c = line
    ap = find(a - 1)
    bp = find(b - 1)
    if ap == bp:
        continue
    if ap < bp:
        parent[bp] = ap
    else:
        parent[ap] = bp
    result += c
    cnt += 1
print(result)
