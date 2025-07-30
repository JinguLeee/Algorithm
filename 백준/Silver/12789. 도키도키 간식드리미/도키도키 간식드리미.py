import sys
from collections import deque
si = sys.stdin.readline
N = int(si())
num_list = deque(map(int, input().split(' ')))

save = []
last = 1
while num_list:
    num = num_list.popleft()
    if last == num: last += 1
    else: save.append(num)

    while True:
        if not save or save[-1] != last: break
        else:
            last += 1
            save.pop()
print('Sad' if save else 'Nice')