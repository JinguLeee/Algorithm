import sys
si = sys.stdin.readline

name_dict = {}
num = int(si())
for _ in range(num):
    name, state = si().strip().split(' ')
    if state == 'enter':
        name_dict[name] = True
    elif state == 'leave':
        del name_dict[name]

print('\n'.join(sorted(name_dict.keys(), reverse=True)))