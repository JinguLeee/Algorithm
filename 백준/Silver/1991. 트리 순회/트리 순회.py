def dfs1(curr):
    if curr == '.':
        return
    result1.append(curr)
    dfs1(num_dict[curr][0])
    dfs1(num_dict[curr][1])
    result3.append(curr)

def dfs2(curr):
    l = num_dict[curr][0]
    if l != '.': dfs2(l)
    result2.append(curr)

    r = num_dict[curr][1]
    if r != '.': dfs2(r)

from collections import defaultdict
import sys
si = sys.stdin.readline

N = int(si())
num_dict = defaultdict(list)
for _ in range(N):
    a, b, c = si().strip().split(' ')
    num_dict[a].append(b)
    num_dict[a].append(c)

result1, result2, result3 = [], [], []
dfs1("A")
dfs2("A")

print("".join(result1))
print("".join(result2))
print("".join(result3))