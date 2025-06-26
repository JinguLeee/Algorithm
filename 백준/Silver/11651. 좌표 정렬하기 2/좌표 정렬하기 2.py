import sys
si = sys.stdin.readline

num_list = [tuple(map(int, si().split())) for _ in range(int(si()))]
num_list.sort(key=lambda x: (x[1], x[0]))
for x, y in num_list:
    print(x, y)