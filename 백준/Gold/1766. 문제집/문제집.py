import heapq
from collections import defaultdict
import sys
si = sys.stdin.readline
M, N = map(int, si().split())

num_count = [0] * (M+1)
num_dict = defaultdict(list)
for _ in range(N):
    start, end = map(int, si().split())
    num_dict[start].append(end)
    num_count[end] += 1

num_heap = []
for i in range(1, M+1):
    if num_count[i] == 0:
        num_heap.append(i)

result= []
while num_heap:
    num = heapq.heappop(num_heap)
    result.append(num)
    for n in num_dict[num]:
        num_count[n] -= 1
        if num_count[n] == 0:
            heapq.heappush(num_heap, n)
print(*result)