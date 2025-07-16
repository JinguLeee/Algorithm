def isPaper(x, y, size, paper) :
    color = paper[x][y]
    for x2 in range(x, x+size):
        for y2 in range(y, y+size):
            if paper[x2][y2] != color:
                return False, -1
    return True, color

def divide(x, y, size, paper, w, b) :
    p, c = isPaper(x, y, size, paper)
    if p : 
        if c == 0: w += 1
        else: b += 1
    else:
        half = size//2
        w, b = divide(x, y, half , paper, w, b)
        w, b = divide(x+half, y, half , paper, w, b)
        w, b = divide(x, y+half, half , paper, w, b)
        w, b = divide(x+half, y+half, half , paper,w, b)
    return w, b

import sys
si = sys.stdin.readline
N = int(si())

white = 0; blue = 0
paper = [list(map(int, si().split())) for _ in range(N)]
w = 0; b = 0
w, b = divide(0, 0, N, paper, w, b)

print(w)
print(b)