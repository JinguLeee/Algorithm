def find(num):
    if sets[num] == num:
        return num
    sets[num] = find(sets[num])
    return sets[num]


def union(a, b):
    if A == B:
        return
    elif A < B:
        sets[A] = B
    else:
        sets[B] = A


import sys

si = sys.stdin.readline
N, M = map(int, si().split())
sets = [n for n in range(N + 1)]
for _ in range(M):
    p, a, b = map(int, si().split())
    A = find(a)
    B = find(b)

    if p == 0:  # 합집합
        union(A, B)
    else:  # 출력
        print("YES" if A == B else "NO")