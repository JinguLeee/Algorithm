import heapq
import sys
si = sys.stdin.readline

jewel_count, bag_count = map(int, si().strip().split())
# 0 : weight 1 : price
jewels = [tuple(map(int, si().strip().split())) for _ in range(jewel_count)]
jewels.sort()
bags = sorted(int(si()) for _ in range(bag_count))

result = 0
heap = []
i = 0
for bag_weight in bags:
    while i < jewel_count and jewels[i][0] <= bag_weight:
        heapq.heappush(heap, -jewels[i][1])
        i += 1

    if heap:
        result += -heapq.heappop(heap)

print(result)