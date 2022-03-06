a,b,c = map(int, input().split())
dices = [a,b,c]
prize = 0
if a==b==c:
    prize = 10000+a*1000
elif a==b or b==c:
    prize = 1000 + b *100
elif a==c:
    prize = 1000 + a *100
elif a!=b and b!=c and a!=c:
    prize = max(dices)*100
print(prize)
