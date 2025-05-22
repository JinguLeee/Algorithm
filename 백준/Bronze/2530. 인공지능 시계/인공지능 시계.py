import datetime

hours, minutes, seconds = map(int, input().split())
total_seconds = hours*60*60 + minutes*60 + seconds
total_seconds += int(input())

hours = total_seconds // (60*60) % 24
minutes = total_seconds // 60 % 60
seconds = total_seconds % 60

print(hours, minutes, seconds)