N, idx = map(int, input().split(' '))

divisors = []
for i in range(1, int(N ** 0.5)+1):
    if N % i == 0:
        pair = N // i
        if i == pair:
            divisors.append(i)
        else :
            divisors.extend([i, pair])
divisors.sort()

if len(divisors) < idx:
    print(0)
else:
    print(divisors[idx-1])