import sys
si = sys.stdin.readline

stack = []
result_list = []

for _ in range(int(si())):
    num_list = list(map(int, si().split()))
    match num_list[0]:
        case 1:
            stack.append(num_list[1])
        case 2:
            result_list.append(stack.pop() if stack else -1)
        case 3:
            result_list.append(len(stack))
        case 4:
            result_list.append(0 if stack else 1)
        case 5:
            result_list.append(stack[-1] if stack else -1)
print("\n".join(map(str,result_list)))