import sys
si = sys.stdin.readline

weight = []
for _ in range(int(si())) :
    weight.append(int(si()))
weight.sort(reverse=True)

max_weight = 0
for i in range(len(weight)):
    max_weight = max(max_weight, weight[i] * (i+1))
print(max_weight)