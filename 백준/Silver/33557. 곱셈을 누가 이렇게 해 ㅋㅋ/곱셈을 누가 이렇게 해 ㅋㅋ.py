from collections import deque
import sys
si = sys.stdin.readline

result = []
for _ in range(int(si())):
    a, b = map(int, si().split())
    mul = a * b

    q = deque()
    while a > 0 and b > 0:
        q.appendleft(str((a % 10) * (b % 10)))
        a //= 10 ; b //= 10

    if a > 0: q.appendleft(str(a))
    elif b > 0: q.appendleft(str(b))

    result.append("1" if int("".join(q)) == mul else "0")

print("\n".join(result))