probCnt = int(input())
probTorF = input().split()

point = 0
pointAdd = 1

for i in range(0,len(probTorF)):
    if probTorF[i] == '1':
        point +=pointAdd
        pointAdd +=1
    else:
        pointAdd = 1
        continue
print(point)
