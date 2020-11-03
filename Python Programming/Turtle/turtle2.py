# Turtle 2
# Exploring the Python Turtle library
# 2 October 2020

import turtle
from random import randint

#this is our list of available base 16 (hex) numbers
hexList = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f']
# positions 0    1    2    3    4    5    6    7    8    9    10   11   12   13   14   15

# Get the screen, set width and height
s = turtle.getscreen()
sWidth = 1000
sHeight = 600
s.screensize(sWidth, sHeight)
s.bgcolor("deepskyblue")

# Create turtle and hide it
t1 = turtle.getturtle()
t1.hideturtle()

# Function to make a new color
def makeAColor(whatColor):
    newColor = "#"
    
    if whatColor == "Red": # Red override
        r = "ff" # Prominent red
        g1 = str(randint(0, 6)) # First green value
        b1 = str(randint(0, 6)) # First blue value
        g2 = str(randint(0, 9)) # Second green value
        b2 = str(randint(0, 9)) # Second blue value
        newColor += (r + g1 + g2 + b1 + b2)
    elif whatColor == "Green": # Green override
        g = "ff" # Prominent green
        r1 = str(randint(0, 9)) # First red value
        b1 = str(randint(0, 9)) # First blue value
        r2 = str(randint(0, 9)) # Second red value
        b2 = str(randint(0, 9)) # Second blue value
        newColor += (r1 + r2 + g + b1 + b2)
    elif whatColor == "Blue": # Blue override
        b = "ff" # Prominent blue
        r1 = str(randint(0, 9)) # First red value
        g1 = str(randint(0, 9)) # First green value
        r2 = str(randint(0, 9)) # Second red value
        g2 = str(randint(0, 9)) # Second green value
        newColor += (r1 + r2 + g1 + g2 + b)
    else:
        for i in range(6): # Create random color
            newDigit = hexList[randint(0,len(hexList)-1)]
            newColor += newDigit

    return newColor

# Function to draw a shape using the turtle pen feature
def drawShape(sides, sideLength, color, turtle):
    turtle.fillcolor(color)
    turtle.pendown()
    turtle.begin_fill()
    for i in range(sides): # Draws the shape with regard to the number of sides
        turtle.forward(sideLength)
        turtle.left(360/sides)
    turtle.end_fill()
    turtle.penup()

# Do something function
def doSomething(x, y):
    for i in range(randint(10, 30)):
        newT = turtle.Turtle() # Create a new turtle
        newColor = makeAColor("Red") # Make a new color
        newT.speed(0) # Set speed so program runs as quickly as possible
        newT.penup()
        newT.goto(x,y) # Go to mouse click position
        newT.width(randint(3, 7)) # Set pen thickness randomly
        newT.setheading(randint(0, 359)) # Rotate the turtle to a random degree from 0 to 359
        newT.pendown()
        newT.forward(randint(50, 200)) # Move a random length forward
        newT.penup()
        randomSideLength = randint(20, 50) # Generate random side length
        halfLength = (randomSideLength / 2) # Get the half length
        newT.right(halfLength * 3) # Move to the right in an attempt to center the shape
        drawShape(randint(3, 8), randomSideLength, newColor, newT) # Draw a shape with the new color, random number of sides, and random side length
        newT.hideturtle()

# Call function when click detected
s.onclick(doSomething)
s.mainloop()
