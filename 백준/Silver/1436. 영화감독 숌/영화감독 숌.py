import sys

si = sys.stdin.readline
N = int(si()) - 1

idx = 0
q = 0

while True:
    if q % 10 != 6:
        if idx == N:
            print(q * 1000 + 666)
            break
        idx += 1
        q += 1
        continue

    cnt = 0
    check_q = q
    while check_q % 10 == 6:
        cnt += 1
        check_q //= 10

    if idx + 10**cnt > N:
        result = N - idx
        result += 666 * (10**cnt)
        result += check_q * (10 ** (cnt + 3))
        print(result)
        break
    else:
        idx += 10**cnt
        q += 1