import sys
si = sys.stdin.readline

N = int(si())
idx = 1
result = [0]*10

while N // idx != 0 :
    if idx == 1:
        count = N // 10
        for i in range(10): result[i] += count
        for i in range(1, N%10 + 1): result[i] += 1
    else:
        count = N // (idx*10) * idx
        mod = N//idx%10
        if mod == 0:
            mod = N//(idx*10)-1
            mod *=idx
            mod += N%idx
            result[0] += mod+1
            for i in range(1, 10): result[i] += count
        else:
            result[mod] += N%idx+1
            for i in range(10): result[i] += count
            for i in range(1, N//idx%10): result[i] += idx
    idx *= 10 
print(*result)