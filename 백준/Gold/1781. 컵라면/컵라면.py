import heapq
import sys
si = sys.stdin.readline

N = int(si())
problems = [tuple(map(int, si().strip().split())) for _ in range(N)]
problems.sort()

heap = []
for deadline, count in problems:
    heapq.heappush(heap, count)

    if len(heap) > deadline:
        heapq.heappop(heap)

print(sum(heap))