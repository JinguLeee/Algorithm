def isPaper(x, y, size, paper) :
    color = paper[x][y]
    for x2 in range(x, x+size):
        for y2 in range(y, y+size):
            if paper[x2][y2] != color:
                return False, -1
    return True, color

def divide(x, y, size, paper) :
    global w, b
    p, c = isPaper(x, y, size, paper)
    if p : 
        if c == 0: w += 1
        else: b += 1
    else:
        half = size//2
        divide(x, y, half , paper)
        divide(x+half, y, half , paper)
        divide(x, y+half, half , paper)
        divide(x+half, y+half, half , paper)

import sys
si = sys.stdin.readline
N = int(si())

w = 0; b = 0
paper = [list(map(int, si().split())) for _ in range(N)]
divide(0, 0, N, paper)

print(w)
print(b)