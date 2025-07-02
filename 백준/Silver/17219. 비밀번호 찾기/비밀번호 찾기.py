import sys
si = sys.stdin.readline

N, M = map(int, si().split())

pass_dic = {}
result_list = []
for _ in range(N):
    site, pass_w = si().strip().split()
    pass_dic[site] = pass_w

for _ in range(M):
    result_list.append(pass_dic[si().strip()])
print("\n".join(map(str,result_list)))