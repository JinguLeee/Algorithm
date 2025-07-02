import sys
si = sys.stdin.readline

N, M = map(int, si().split())
word_dic: dict[str, int] = {}
for _ in range(N):
    word = si().strip()
    if len(word) < M:
        continue
    word_dic[word] = word_dic.get(word, 0) + 1

word_sorted = sorted(word_dic.items(), key=lambda x: (-x[1], -len(x[0]), x[0]))
print('\n'.join(key for key, _ in word_sorted))