def draw_triangle(x, y, size, data):
    if size == 3:
        data[x][y] = '*'
        data[x+1][y-1] = data[x+1][y+1] = '*'
        data[x+2][y-2] = data[x+2][y-1] = data[x+2][y] = data[x+2][y+1] = data[x+2][y+2] = '*'
    else:
        half = size//2
        draw_triangle(x, y, half, data)
        draw_triangle(x+half, y-half, half, data)
        draw_triangle(x+half, y+half, half, data)
        

N = int(input())
data = [[' '] * (2 * N - 1) for _ in range(N)]
draw_triangle(0, N - 1, N, data)

for row in data:
    print(''.join(row))
