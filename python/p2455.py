firstSt = input().split()
secondSt = input().split()
thirdSt = input().split()
fourthSt = input().split()
cntNow = 0
cntMax = 0
stations = [firstSt,secondSt,thirdSt,fourthSt]

for station in stations:
    cntNow = cntNow - int(station[0])
    cntNow = cntNow + int(station[1])
    if cntNow > cntMax:
        cntMax = cntNow
print(cntMax)
