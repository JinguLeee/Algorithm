import sys
si = sys.stdin.readline

from collections import deque

N = int(si())
divisors = [False, False] + [True] * (N - 1)

for i in range(2, int(N ** 0.5) + 1):
    if divisors[i]:
        for j in range(i * i, N + 1, i):
            divisors[j] = False

divisors = [i for i, val in enumerate(divisors) if val]

sum = 0
result = deque()
count = 0
while divisors:
    num = divisors.pop()
    sum += num
    result.append(num)
    while sum > N:
        num = result.popleft()
        sum -= num
    if sum == N :
        count += 1
print(count)