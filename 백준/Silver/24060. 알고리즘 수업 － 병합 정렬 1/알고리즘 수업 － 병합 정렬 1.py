def merge_sort(A, p, r):
    if p < r:
        q = int((p + r) / 2)
        merge_sort(A, p, q)
        merge_sort(A, q + 1, r)
        merge(A, p, q, r)


def merge(A, p, q, r):
    i, j, t = p, q + 1, 0
    while i <= q and j <= r:
        if A[i] <= A[j]:
            tmp[t] = A[i]
            t += 1
            i += 1
        else:
            tmp[t] = A[j]
            t += 1
            j += 1

    while i <= q:
        tmp[t] = A[i]
        t += 1
        i += 1
    while j <= r:
        tmp[t] = A[j]
        t += 1
        j += 1

    i, t = p, 0
    while i <= r:
        result.append(tmp[t])
        A[i] = tmp[t]
        t += 1
        i += 1


import sys

si = sys.stdin.readline
N, K = map(int, si().split())
A = list(map(int, si().split()))
tmp = A.copy()
result = []


merge_sort(A, 0, N - 1)
print(-1 if len(result) < K else result[K - 1])
