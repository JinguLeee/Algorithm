import heapq
import sys
si = sys.stdin.readline

heap = []
result_list  = []
for _ in range(int(si())) :
    num = int(si())
    if num == 0:
        result_list.append(str(heapq.heappop(heap)[1] if heap else 0))
    else :
        heapq.heappush(heap, (abs(num), num))
print('\n'.join(result_list))