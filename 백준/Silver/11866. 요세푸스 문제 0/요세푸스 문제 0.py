import sys
import queue
si = sys.stdin.readline
N, K = map(int, si().split(' '))

num_queue = queue.Queue()
result_list = []

for i in range(1, N+1):
    num_queue.put(i)

i = 0
while num_queue.qsize() > 0 :
    num = num_queue.get()
    i += 1
    if i % K == 0:
        result_list.append(num)
    else:
        num_queue.put(num)

print("<"+', '.join(map(str, result_list))+">")