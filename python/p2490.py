for i in range(0,3):
    a,b,c,d = input().split()
    arr = [a,b,c,d]
    count = 0
    for ii in arr:
        if ii == '0':
            count +=1
    if count == 1:
        print('A')
    elif count == 2:
        print('B')
    elif count == 3:
        print('C')
    elif count == 4:
        print('D')
    elif count == 0:
        print('E')
