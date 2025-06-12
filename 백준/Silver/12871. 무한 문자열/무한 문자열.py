import math
A, B = list(input()), list(input())
A_len, B_len = len(A), len(B)
lcm = A_len * B_len // math.gcd(A_len, B_len)

A *= (lcm//A_len)
B *= (lcm//B_len)
print(1 if A == B else 0)