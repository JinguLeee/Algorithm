import sys
si = sys.stdin.readline
from collections import deque

N, M = map(int, si().split())
num_deque = deque(i for i in range(1, N+1))
numbers = list(map(int, si().strip().split()))

result = 0
for i in range(M):
    idx = 0
    while True:
        get_num = num_deque.popleft()
        if get_num == numbers[i] :
            result += min(idx, len(num_deque)-idx+1)
            break
        num_deque.append(get_num)
        idx += 1
print(result)