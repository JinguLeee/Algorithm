score = int(input())
score_list = [60, 70, 80, 90, 100]
grade_list = ["F", "D", "C", "B", "A"]


for i in range(len(score_list)):
    if score_list[i] > score:
        break
print(grade_list[i])