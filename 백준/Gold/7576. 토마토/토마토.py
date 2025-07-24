from collections import deque
import sys
si = sys.stdin.readline

M, N = map(int, si().split())
q = deque()
box = []
count = 0


for n in range(N):
    tomato = list(map(int, si().split()))
    box.append(tomato)
    for m in range(M):
        if tomato[m] == 0: count += 1
        elif tomato[m] == 1: q.append([n, m, 0])

dn = [1, -1, 0, 0]
dm = [0, 0, 1, -1]

max_day = 0

r = 0
while q:
    n, m, day = q.popleft()
    for i in range(4):
        nn = n+dn[i]
        nm = m+dm[i]
        if 0 <= nn < N and 0 <= nm < M and box[nn][nm] == 0:
            box[nn][nm] = 1
            count -= 1
            q.append([nn, nm, day+1])
            max_day = max(day+1, max_day)
print(-1 if count > 0 else max_day) 