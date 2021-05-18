def drawTri(num):
    numArr = []
    for i in range(num):
        numArr.append(i + 1)
        for x in numArr:
            print(x, end=' ')
        print()

drawTri(5)
