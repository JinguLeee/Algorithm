min, max = map(int, input().split(' '))
num_set = set(range(min, max+1))
for i in range(2, int(max**0.5)+1):
    if i > min and i not in num_set:
        continue
    start = min if min % i**2 == 0 else (min // i**2 + 1)* i**2
    for num in range(start, max+1, i**2):
        num_set.discard(num)

print(len(num_set))