import sys

si = sys.stdin.readline
N, M = map(int, si().split())
A = list(map(int, si().split()))
result = 0
mod = [0] * M
cul = 0
for idx in range(N):
    cul += A[idx]
    m = cul % M
    mod[m] += 1
    if m == 0:
        result += 1

for idx in range(M):
    cnt = mod[idx]
    result += cnt * (cnt - 1) // 2
print(result)