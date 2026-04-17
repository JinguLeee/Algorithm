import sys

si = sys.stdin.readline
N = int(si()) - 1

for _ in range(N + 1):
    a, b = map(int, si().split(" "))
    for __ in range(b):
        si()
    print(a - 1)