sumPrice = int(input())
prices = []
for i in range(0,9):
    prices.append(int(input()))

for price in prices:
    sumPrice = sumPrice - price

print(sumPrice)
