import sys
si = sys.stdin.readline

N = int(si())
maxdp = [[0] * 3 for _ in range(2)]
mindp = [[0] * 3 for _ in range(2)]
maxdp[0] = list(map(int, si().split()))
mindp[0] = maxdp[0][:]

for row in range(1, N):
    row %= 2
    data = list(map(int, si().split()))
    maxdp[row][0] = data[0] + max(maxdp[row-1][0:2])
    maxdp[row][1] = data[1] + max(maxdp[row-1])
    maxdp[row][2] = data[2] + max(maxdp[row-1][1:])
    mindp[row][0] = data[0] + min(mindp[row-1][0:2])
    mindp[row][1] = data[1] + min(mindp[row-1])
    mindp[row][2] = data[2] + min(mindp[row-1][1:])
print(max(maxdp[N%2-1]), min(mindp[N%2-1]))