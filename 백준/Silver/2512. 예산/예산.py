import sys
si = sys.stdin.readline
m_len = int(si())
m_list = list(map(int, si().split()))
m_list.sort(reverse=True)

input_b = int(si())
gap = sum(m_list) - input_b

if gap <= 0 : 
    budget = m_list[0]
elif input_b < m_list[-1] * m_len:
    budget = input_b // m_len
else:
    for i in range(1, m_len):
        gap -= i * (m_list[i-1] - m_list[i]); budget = m_list[i]
        if gap <= 0:
            break
    if gap < 0:
        gap = 0-gap; budget += gap // i
print(budget)