def find():
    move = 0
    while True:
        for _ in range(len(q)):
            curr = q.popleft()
            if curr == end:
                return move
            if curr + 6 >= end:
                return move + 1

            val = 0
            for next in range(curr, curr + 7):
                if not visit[next]:
                    visit[next] = True
                    if not is_move(next):
                        val = next
                        visit[val] = True
            if val != 0:
                q.append(val)
        move += 1


def is_move(next):
    if next in dic:
        next = dic[next]
        q.append(next)
        visit[next] = True
        is_move(next)
        return True
    else:
        return False


import sys

si = sys.stdin.readline
from collections import deque

N, M = map(int, si().split())
dic: dict[int, int] = {}

for _ in range(N + M):
    a, b = map(int, si().split())
    dic[a] = b

end = 100
q = deque()
q.append(1)
visit = [False] * (end + 1)

print(find())