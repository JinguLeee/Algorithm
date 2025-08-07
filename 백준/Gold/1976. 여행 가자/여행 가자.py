def find(num):
    if root[num] == num:
        return num
    else :
        root[num] = find(root[num])
        return root[num]

def union(start, end):
    sp = find(start)
    ep = find(end)

    if sp < ep :
        root[ep] = sp
    else :
        root[sp] = ep


import sys
si = sys.stdin.readline
country = int(si())
si()

root = [i for i in range(country)]
for row in range(country):
    l = list(map(int, si().split()))
    for col in range(row, country):
        if l[col] == 1:
            union(row, col)

result = -1
for q in list(map(int, si().split())):
    if result == -1:
        result = find(q-1)
    else :
        if result != find(q-1):
            print("NO")
            sys.exit()
print("YES")