def find(num):
    if l[num] == num:
        return num
    else :
        l[num] = find(l[num])
        return l[num]

def union(start, end):
    sp = find(start)
    ep = find(end)
    if sp == ep :
        return True
    elif sp < ep :
        l[ep] = sp
    else :
        l[sp] = ep
    return False


import sys
si = sys.stdin.readline
M, N = map(int, si().split())

l = [i for i in range(M)]
for count in range(1, N+1):
    start, end = map(int, si().split())
    if union(start, end):
        print(count)
        sys.exit()
print(0)