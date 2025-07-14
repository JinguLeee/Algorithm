import sys
si = sys.stdin.readline

d_grade = {'A+' : 4.5, 'A0' : 4, 'B+' : 3.5, 'B0' : 3, 'C+' : 2.5, 'C0' : 2, 'D+' : 1.5, 'D0' : 1, 'F' : 0}

grade_sum = 0
score_sum = 0
for _ in range(20) :
    name, score, grade = si().strip().split(' ')
    if grade in d_grade :
        grade_sum += (d_grade.get(grade, 0) * float(score))
        score_sum += float(score)
print(grade_sum / score_sum if score_sum != 0 else 0)