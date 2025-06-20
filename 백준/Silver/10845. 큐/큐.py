from collections import deque
import sys
si = sys.stdin.readline

num_queue = deque()
result_list = []
for _ in range(int(si())):
    act = si().strip()
    match act:
        case "pop":
            result_list.append(num_queue.popleft() if num_queue else -1)
        case "size":
            result_list.append(len(num_queue))
        case "empty":
            result_list.append(0 if num_queue else 1)
        case "front":
            result_list.append(num_queue[0] if num_queue else -1)
        case "back":
            result_list.append(num_queue[-1] if num_queue else -1)
        case _:
            num_queue.append(int(act.split()[1]))

print("\n".join(map(str,result_list)))