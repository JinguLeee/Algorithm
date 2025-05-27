while True:
    N = int(input())
    if N == -1:
        break
    
    divisor_sum = 1
    divisors = [1]
    for i in range(2, int(N ** 0.5)+1):
        if N % i == 0:
            pair = N // i
            if i == pair:
                divisor_sum += i
                divisors.append(i)
            else :
                divisor_sum += i + pair
                divisors.extend([i, pair])
    
    if divisor_sum == N:
        divisors.sort()
        print(f"{N} = {' + '.join(map(str, divisors))}")
    else:
        print(f"{N} is NOT perfect.")