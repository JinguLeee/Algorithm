import sys
si = sys.stdin.readline

name_count = 0
name_set = set()
num = int(si())

for _ in range(num):
    name = si().strip()
    if name == 'ENTER':
        name_set.clear()
    else:
        if name not in name_set:
            name_count += 1
            name_set.add(name)
print(name_count)