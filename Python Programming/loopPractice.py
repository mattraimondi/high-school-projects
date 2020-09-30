# Loop Practice
# 30 September 2020

def printIt(answer):
    print(f"Your answer is {answer}.")

# Make a loop that counts to 100 and prints the numbers

for i in range (10):
    print(i+1)
    
# Make a loop that adds all the numbers from 1 to 10

sum1, sum2 = 0, 0

for i in range (10):
    sum1 += (i + 1) # short way
    sum2 = sum2 + (i + 1) # long way

print("sum1 = %i, sum2 = %i" % (sum1, sum2)) # oldest
print("sum1 = {}, sum2 = {}".format(sum1, sum2)) # older
print("sum1 = " + str(sum1) + ", sum2 = " + str(sum2)) # old
print(f"sum1 = {sum1}, sum2 = {sum2}") # new

# Print out all numbers from to 1000000

mSum = 0
for i in range(1000000):
    mSum += (i + 1)

printIt(mSum)