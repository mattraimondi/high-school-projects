# Temperature Converter
# 28 October 2020

# Global variable used for adding the unit letter to the final answer
finalSymbol = ""

# Function that takes care of all math and rounding
def convertTemp(op, temp):
    if op == 1:
        return round((((temp-32)*5)/9), 2)
    elif op == 2:
        return round((((temp/5)*9)+32), 2)

# While loop where the logic of the program takes place, determining the unit of the number coming in,
# cleaning it, and then running the function to convert from one unit to the other. Also sets the finalSymbol
# variable to the opposite of the unit entered. Any time there is a "continue" statement, it restarts the loop
# because the desired input was not received. A break statement ends the loop since it would otherwise go infinitely.
while True:
    answer = (input("Enter a Temp in Fahrenheit or Celsius (F or C, or Q to Quit)\n\tExample:\t32F\n"))
    
    if "f" in answer.lower():
        try:
            answer = answer.lower().replace("f","")
            answer = (convertTemp(1, eval(answer)))
            finalSymbol = "C"
            break
        except:
            continue
    elif "c" in answer.lower():
        try:
            answer = answer.lower().replace("c","")
            answer = (convertTemp(2, eval(answer)))
            finalSymbol = "F"
            break
        except:
            continue
    elif "q" in answer.lower():
        print("Quitting")
        exit(0) # Ends the program
    else:
        continue

# Print out the final answer for the user
print(f"{answer}{finalSymbol}")
