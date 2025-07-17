def getMax(cut_list):
    cut_list.sort()
    return max(cut_list[i+1] - cut_list[i] for i in range(len(cut_list)-1))

import sys
si = sys.stdin.readline
width, height = map(int, si().split())

width_cut = [0, width]
height_cut = [0, height]

for _ in range(int(si())):
    m, n = map(int, si().split())
    if m == 0: height_cut.append(n)
    else: width_cut.append(n)

width = getMax(width_cut)
height = getMax(height_cut)
print(width*height)