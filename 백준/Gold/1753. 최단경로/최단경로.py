import sys
import heapq

si = sys.stdin.readline
N, M = map(int, si().split())
high = int(si())

result = [-1] * (N + 1)
result[high] = 0

graph = [[] for _ in range(N + 1)]
for _ in range(M):
    a, b, c = map(int, si().split())
    graph[a].append([b, c])

pq = []
heapq.heappush(pq, (0, high))

while pq:
    dist, node = heapq.heappop(pq)
    if dist > result[node]:
        continue

    for next_node, cost in graph[node]:
        now_dist = dist + cost
        if result[next_node] == -1 or now_dist < result[next_node]:
            result[next_node] = now_dist
            heapq.heappush(pq, (now_dist, next_node))

for i in range(1, N + 1):
    print(result[i] if result[i] != -1 else "INF")