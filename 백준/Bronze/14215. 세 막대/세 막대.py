import sys

si = sys.stdin.readline
a, b, c = map(int, si().split())
minus = min(c - 1 - (a - b if a > b else b - a), a + b - c - 1, 0)
result = a + b + c + minus
print(result)