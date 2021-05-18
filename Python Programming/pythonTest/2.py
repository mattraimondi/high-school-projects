def convert2DogYrs(hYrs):
    dSum = 0
    if hYrs % 1 != 0:
        hYrs = int(hYrs * 1)
    for i in range(hYrs + 1):
        if i == 1 or i == 2:
            dSum += 10.5
        elif i >= 3:
            dSum += 4

    return dSum


print(f"A Dog that is {1} years (human) is: \t{convert2DogYrs(1)} in dog years.")
print(f"A Dog that is {1} years (human) is: \t{convert2DogYrs(2.5)} in dog years.")
print(f"A Dog that is {1} years (human) is: \t{convert2DogYrs(15)} in dog years.")
print(f"A Dog that is {1} years (human) is: \t{convert2DogYrs(18.5)} in dog years.")
