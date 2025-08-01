import sys
si = sys.stdin.readline
N = int(si())
l = list(map(int, input().split(' ')))

if l[N-1] < 0 :
    print(l[N-2], l[N-1])
elif l[0] > 0 :
    print(l[0], l[1])
else :
    start = 0
    end = N-1
    min_gap = abs(l[start] + l[end])
    result = [l[start], l[end]]
    while start < end:
        curr_gap = l[start] + l[end]
        if abs(curr_gap) < min_gap:
            min_gap = abs(curr_gap)
            result = [l[start], l[end]]
        if curr_gap > 0:
            end-=1
        elif curr_gap < 0:
            start+=1
        else:
            break
    print(result[0], result[1])