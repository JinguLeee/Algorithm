num = 0
sum = int(input())
for i in range(sum+1):
    num += i
    if num == sum:
        break
    elif num > sum:
        i -= 1
        break
print(i)