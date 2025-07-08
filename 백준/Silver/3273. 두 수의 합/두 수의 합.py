import sys
si = sys.stdin.readline
si()

num_set = set(map(int, si().split()))
X = int(si())
result = 0
while num_set:
    num = X - num_set.pop()
    if num in num_set:
        num_set.remove(num)
        result += 1
print(result)