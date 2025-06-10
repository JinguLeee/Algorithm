row = list(input())
re_str = list(input())
re_len = len(re_str)
stack = []

for s in row:
    stack.append(s)
    if stack[-re_len:] == re_str:
         for _ in range(re_len):
            stack.pop()
if stack:
    print(''.join(stack))
else:
    print("FRULA")