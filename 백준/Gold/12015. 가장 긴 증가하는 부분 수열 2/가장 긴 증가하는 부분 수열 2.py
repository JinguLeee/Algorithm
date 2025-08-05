def change(num) :
    start = 0
    end = len(result)-1
    
    while start <= end:
        curr = (start + end) // 2
        if result[curr] > num:
            end = curr - 1
        elif result[curr] < num:
            start = curr + 1
        else :return
    result[start] = num

import sys
si = sys.stdin.readline
from collections import deque

si()
l = deque(map(int, si().split()))

result = []
for i in l:
    if not result or result[-1] < i:
        result.append(i)
    elif result[-1] > i:
        change(i)
print(len(result))