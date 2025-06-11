def dfs(A_list, B_list):
    if not A_list or not B_list:
        return
    
    a_max = max(A_list)
    a_idx = A_list.index(a_max)
    b_max = max(B_list)
    b_idx = B_list.index(b_max)

    if a_max == b_max:
        result.append(a_max)
        dfs(A_list[a_idx+1:], B_list[b_idx+1:])
    elif a_max > b_max:
        A_list.pop(a_idx)
        dfs(A_list, B_list)
    else:
        B_list.pop(b_idx)
        dfs(A_list, B_list)



A_count = int(input())
A_list = list(map(int, input().split()))
B_count = int(input())
B_list = list(map(int, input().split()))
result = []
dfs(A_list, B_list)
print(len(result))
print(*result)