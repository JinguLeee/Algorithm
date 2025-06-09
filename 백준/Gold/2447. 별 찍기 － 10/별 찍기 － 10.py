def draw(x, y, size, data):
    if size == 3:
        for i in range(3):
            data[x][y+i] = data[x+2][y+i] = '*'
        data[x+1][y] = data[x+1][y+2] = '*'
    else:
        size //= 3
        draw(x, y, size, data)
        draw(x+size, y, size, data)
        draw(x+size*2, y, size, data)
        draw(x, y+size, size, data)
        draw(x+size*2, y+size, size, data)
        draw(x, y+size*2, size, data)
        draw(x+size, y+size*2, size, data)
        draw(x+size*2, y+size*2, size, data)
        

N = int(input())
data = [[' '] * N for _ in range(N)]
draw(0, 0, N, data)

for row in data:
    print(''.join(row))