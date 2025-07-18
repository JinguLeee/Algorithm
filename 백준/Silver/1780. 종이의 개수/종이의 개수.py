def isPaper(x, y, size) :
    num = paper[x][y]
    for x2 in range(x, x+size):
        for y2 in range(y, y+size):
            if paper[x2][y2] != num:
                return False
    result[num+1] += 1
    return True

def divide(x, y, size) :
    if not isPaper(x, y, size):
        size //= 3
        divide(x, y, size)
        divide(x+size, y, size)
        divide(x+size*2, y, size)
        divide(x, y+size, size)
        divide(x+size, y+size, size)
        divide(x+size*2, y+size, size)
        divide(x, y+size*2, size)
        divide(x+size, y+size*2, size)
        divide(x+size*2, y+size*2, size)

import sys
si = sys.stdin.readline
N = int(si())

paper = [list(map(int, si().split())) for _ in range(N)]
result = [0, 0, 0]
divide(0, 0, N)
print("\n".join(map(str, result)))