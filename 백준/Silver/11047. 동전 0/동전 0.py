import sys
si = sys.stdin.readline
N, K = map(int, si().split(' '))
coins = []
for _ in range(N):
    coin = int(si())
    if coin <= K:
        coins.append(coin)
coins.reverse()

count = 0
for coin in coins:
    count += K//coin
    K %= coin
    if K == 0:
        break
print(count)