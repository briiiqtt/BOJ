cnt = int(input())
vote = input()
voteA = 0
voteB = 0
for i in range(0,len(vote)):
    if vote[i] == "A":
        voteA +=1
    elif vote[i] == "B":
        voteB +=1
if voteA > voteB:
    print("A")
elif voteA < voteB:
    print("B")
else:
    print("Tie")
