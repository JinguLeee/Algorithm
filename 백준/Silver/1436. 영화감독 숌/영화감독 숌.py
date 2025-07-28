import sys
si = sys.stdin.readline
N = int(si())

l = []
for i in range(666, 2666800):
    if '666' in str(i):
        l.append(i)
print(l[N-1])