def main():
    sq = N // idx + 10 ** ((idx-1) // 2)
    le = N % idx
    
    if le == 0:
        sq -=1
        le = 1
    number = str(sq)
    l = len(number)
    if l < le:
        le = l-le+1 if idx % 2 == 0 else l-le
        
    return number[le-1]

N = int(input())
idx = 1
count = 9
while True :
    sum_count = idx*count
    if N < sum_count:
        print(main())
        break
    elif N == sum_count:
        print(9)
        break

    N -= sum_count
    if idx % 2 == 0:
        count *= 10
    idx += 1