import sys
si = sys.stdin.readline
from collections import deque

si()
height = list(map(int, si().split(' ')))
result = [0]*len(height)
save = []

for i in range(len(height)):
    while save and height[i] > height[save[-1]]:
        save.pop()
    if save:
        result[i] = save[-1]+1
    else:
        result[i] = 0
    save.append(i)

print(*result)