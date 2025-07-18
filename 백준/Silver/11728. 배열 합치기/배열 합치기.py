import sys
si = sys.stdin.readline
si()
a = list(map(int, si().split()))
a += list(map(int, si().split()))
a.sort()
print(*a)