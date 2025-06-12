words = set()
for _ in range(int(input())):
    words.add(input())
words = sorted(words, key=lambda x:(len(x), x))
for word in words:
    print(word)