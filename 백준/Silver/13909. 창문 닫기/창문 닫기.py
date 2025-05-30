N = int(input())
for i in range(1, N+1):
    if i**2 == N:
        break
    elif i**2 > N:
        i -= 1
        break

print(i)