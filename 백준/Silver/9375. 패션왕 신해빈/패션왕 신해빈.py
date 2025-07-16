import sys
si = sys.stdin.readline

result = []
for _ in range(int(si())) :
    r = 0
    d = {}
    for _ in range(int(si())) :
        name, tag = si().strip().split(' ')
        d[tag] = (d.get(tag, 0) + 1)
    
    if len(d) != 0:
        r = 1
        for c in d : r *= (d[c]+1)
        r -= 1
    result.append(str(r))
print("\n".join(result))