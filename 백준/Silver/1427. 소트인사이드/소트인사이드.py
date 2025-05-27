N = input()

count = [0] * 10
for s in N:
    count[int(s)] += 1

result = ''
for i in range(10)[::-1]:
    result += str(i) * count[i]

print(result)