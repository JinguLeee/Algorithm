def make(num):
    if num == 1:
        return '-'
    return make(num/3) + int(num/3)*' ' + make(num/3)

dash_list = []
while True:
    try:
        N = 3**int(input())
        dash_list.append(make(N))
    except EOFError:
        break
print('\n'.join(dash_list))