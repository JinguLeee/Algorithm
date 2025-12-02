def dfs(row):
    if row == N:
        return 1

    count = 0
    for col in range(N):
        if colC[col] or diaC_1[row + col] or diaC_2[row - col + N]:
            continue
        colC[col] = diaC_1[row + col] = diaC_2[row - col + N] = True
        count += dfs(row + 1)
        colC[col] = diaC_1[row + col] = diaC_2[row - col + N] = False
    return count


import sys

si = sys.stdin.readline
N = int(si())

colC = [False] * N
diaC_1 = [False] * (2 * N + 1)
diaC_2 = [False] * (2 * N + 1)

print(dfs(0))