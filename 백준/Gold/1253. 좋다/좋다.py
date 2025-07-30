import sys
si = sys.stdin.readline
N = int(si())
l = list(map(int, input().split(' ')))
l.sort()

count = 0
for curr in range(N):
    start = 0
    end = N-1
    num = l[curr]
    while start < end:
        if start == curr:
            start += 1
            continue
        if end == curr :
            end -= 1
            continue

        plus = l[start] + l[end]
        if num > plus : start += 1
        elif num < plus : end -= 1
        else :
            count+=1
            break
print(count)