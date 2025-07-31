import sys
si = sys.stdin.readline
N = int(si())
l = list(map(int, input().split(' ')))

for _ in range(int(si())):
    s, num = map(int, si().split())
    if s == 1:
        for i in range(num-1, N, num):
            l[i] = 1 if l[i] == 0 else 0
    else :
        num-=1
        idx = 0
        l[num] = 1 if l[num] == 0 else 0
        while True:
            idx += 1
            if num + idx >= N or num-idx < 0 or l[num+idx] != l[num-idx]:
                break
            l[num+idx] = l[num-idx] = 1 if l[num+idx] == 0 else 0
for i in range(0, N, 20):
    print(*l[i:min(i+20, N)])