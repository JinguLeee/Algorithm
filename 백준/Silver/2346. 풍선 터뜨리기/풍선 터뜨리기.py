import sys
si = sys.stdin.readline
from collections import deque

N = int(si())
moves = list(map(int, si().split()))
balloons = deque((moves[i], i + 1) for i in range(N))

result = []
while balloons:
    move, idx = balloons.popleft()
    result.append(idx)

    if not balloons:
        break
    balloons.rotate(-(move-1) if move > 0 else -move)

print(' '.join(map(str, result)))