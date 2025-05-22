count = int(input())
max_result = 0

for r in range(count):
    numbers = list(map(int, input().split()))
    dic: dict[int, int] = {}
    for i in numbers:
        dic[i] = 1 if dic.get(i) is None else dic.get(i)+1

    if len(dic) == 1 :
        for a in dic:
            result = 10000 + a*1000
            break
    elif len(dic) == 2 :
        for a in dic:
            if dic.get(a) == 2:
                result = 1000 + a*100
                break
    elif len(dic) == 3 :
        max_num = max(dic)
        result = max_num * 100

    max_result = max(max_result, result)

print(max_result)