sp_num, re_num = map(int, input().split(' '))
array = [0]*sp_num
for i in range(sp_num):
    array[i] = i+1

for i in range(re_num):
    start, end = map(int, input().split(' '))
    array[start-1:end] = array[start-1:end][::-1]

print(*array)