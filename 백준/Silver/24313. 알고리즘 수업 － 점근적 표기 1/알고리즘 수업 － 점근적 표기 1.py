import sys
si = sys.stdin.readline
a, b = map(int, si().split())
c = int(si())
d = int(si())

if a < c:
    print(1 if (a - c) * d + b <= 0 else 0)
elif a == c:
    print(1 if b <= 0 else 0)
else:
    print(0)