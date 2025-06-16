name_dict = {}
for _ in range(int(input())):
    age, name = input().split()
    age = int(age)
    if age not in name_dict:
        name_dict[age] = []
    name_dict[age].append(name)

for age in sorted(name_dict):
    for name in name_dict[age]:
        print(age, name)