import sys
si = sys.stdin.readline

stack = []
result_list = []
current = 1
result = True

for _ in range(int(si())):
    num = int(si())

    while current <= num:
        stack.append(current)
        result_list.append("+")
        current += 1

    if stack and stack[-1] == num:
        stack.pop()
        result_list.append("-")
    else:
        result = False
        break

if result:
    print("\n".join(result_list))
else:
    print("NO")