import sys
si = sys.stdin.readline

A, B = map(int, si().split(' '))

A_set = set()
B_set = set()

if A < B:
    A_set = set(map(int, si().split()))
    B_set = set(map(int, si().split()))
else:
    B_set = set(map(int, si().split()))
    A_set = set(map(int, si().split()))

result = 0
for i in A_set:
    if i in B_set:
        B_set.remove(i)
    else:
        result += 1

print(result + len(B_set))