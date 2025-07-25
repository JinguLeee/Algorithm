import sys
si = sys.stdin.readline
N, M = map(int, input().split(' '))

ropes = []
for _ in range(N):
    ropes.append(int(si()))

start = 1
end = max(ropes)
result = 0
while start <= end:
    point = (start + end) // 2
    count = sum(rope // point for rope in ropes)
    if count >= M:
        result = point
        start = point + 1
    else: end = point - 1
print(result)