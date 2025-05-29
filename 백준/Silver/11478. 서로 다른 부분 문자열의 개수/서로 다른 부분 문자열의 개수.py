str_value = input()

str_set = set()
for i in range(1, len(str_value)+1):
    for j in range(len(str_value)-i+1):
        str_set.add(str_value[j:j+i])

print(len(str_set))