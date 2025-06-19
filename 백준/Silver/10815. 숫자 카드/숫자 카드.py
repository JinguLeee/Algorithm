import sys
si = sys.stdin.readline
N = int(si())
N_set = set(map(int, si().split()))

M = int(si())
M_list = list(map(int, si().split()))

result_list = []
for card in M_list :
    result_list.append(1 if card in N_set else 0)
print(*result_list)