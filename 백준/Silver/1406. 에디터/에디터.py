import sys
si = sys.stdin.readline
from collections import deque

left_deque = deque(si().strip()[::1])
right_deque = deque()

for _ in range(int(si())):
    act_list = list(si().strip().split(' '))
    match act_list[0]:
        case "L":
            if left_deque:
                right_deque.appendleft(left_deque.pop())
        case "D":
            if right_deque:
                left_deque.append(right_deque.popleft())
        case "B":
            if left_deque:
                left_deque.pop()
        case "P":
            left_deque.append(act_list[1])

print("".join(left_deque)+"".join(right_deque))