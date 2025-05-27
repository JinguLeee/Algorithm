array = [[False]*100 for _ in range(100)]
re_num = int(input())
for i in range(re_num):
    x, y = map(int, input().split(' '))
    for x_point in range(x, x+10):
        for y_point in range(y, y+10):
            array[x_point][y_point] = True

result = 0
for i in range(100):
    for j in range(100):
        if array[i][j]:
            result += 1
print(result)