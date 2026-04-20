def dist(a_point, b_point):
    a_x, a_y = a_point
    b_x, b_y = b_point
    return ((a_x - b_x) ** 2 + (a_y - b_y) ** 2) ** 0.5


def find(num):
    if num == parent[num]:
        return num
    else:
        parent[num] = find(parent[num])
        return parent[num]


import sys

si = sys.stdin.readline

point_cnt, line_cnt = map(int, si().split())
stars = [tuple(map(float, si().split())) for _ in range(point_cnt)]
parent = [i for i in range(point_cnt)]
for _ in range(line_cnt):
    a, b = map(int, si().split())
    ap = find(a - 1)
    bp = find(b - 1)
    if ap < bp:
        parent[bp] = ap
    else:
        parent[ap] = bp

graph = [[a, b, dist(stars[a], stars[b])] for a in range(point_cnt) for b in range(a + 1, point_cnt)]
graph.sort(key=lambda x: x[2])

result = 0
for line in graph:
    a, b, c = line
    ap = find(a)
    bp = find(b)
    if ap == bp:
        continue
    if ap < bp:
        parent[bp] = ap
    else:
        parent[ap] = bp
    result += c
    line_cnt += 1

print(f"{result:.2f}")