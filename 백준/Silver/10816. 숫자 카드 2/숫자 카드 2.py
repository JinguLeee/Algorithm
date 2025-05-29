import sys
si = sys.stdin.readline

si()
have_dict:dict[int, int] = {}
have_list = list(map(int, si().split(' ')))
for i in have_list:
    have_dict[i] = have_dict.get(i, 0) + 1

si()
result =  []
for i in map(int, si().split(' ')):
    result.append(str(have_dict.get(i, 0)))

print(" ".join(result))