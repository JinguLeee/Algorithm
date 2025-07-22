from collections import deque
import sys
si = sys.stdin.readline

M, N, H = map(int, si().split())
q = deque()
box = []
count = 0

for h in range(H):
    l = []
    for n in range(N):
        tomato = list(map(int, si().split()))
        for m in range(M):
            if tomato[m] == 0: count += 1
            elif tomato[m] == 1: q.append([h, n, m, 0])
        l.append(tomato)
    box.append(l)

dh = [1, -1, 0, 0, 0, 0]
dn = [0, 0, 1, -1, 0, 0]
dm = [0, 0, 0, 0, 1, -1]

max_day = 0

r = 0
while q:
    h, n, m, day = q.popleft()
    for i in range(6):
        nh = h+dh[i]
        nn = n+dn[i]
        nm = m+dm[i]
        if 0 <= nh < H and 0 <= nn < N and 0 <= nm < M and box[nh][nn][nm] == 0:
            box[nh][nn][nm] = 1
            count -= 1
            q.append([nh, nn, nm, day+1])
            max_day = max(day+1, max_day)
print(-1 if count > 0 else max_day)