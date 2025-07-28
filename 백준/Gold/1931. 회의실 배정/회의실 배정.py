import sys
si = sys.stdin.readline

time = [tuple(map(int, input().split())) for _ in range(int(si()))]
time.sort(key=lambda x: (x[1], x[0]))

count = 0
curr = 0
for start, end in time:
    if start >= curr:
        curr = end
        count += 1
print(count)