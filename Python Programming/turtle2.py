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
def makeAColor():
    newColor = "#"
    for i in range(6):
        newDigit = hexList[randint(0,len(hexList)-1)]
        newColor += newDigit
    return newColor

# Function to draw a shape using the turtle pen feature
def drawShape(sides, sideLength, color, turtle):
    turtle.fillcolor(color)
    turtle.pendown()
    turtle.begin_fill()
    for i in range(sides):
        turtle.forward(sideLength)
        turtle.left(360/sides)
    turtle.end_fill()
    turtle.penup()

# Do something function
def doSomething(x, y):
    for i in range(randint(10, 30)):
        newT = turtle.Turtle() # Create a new turtle
        newColor = makeAColor() # Make a new color
        newT.speed(0) # Set speed so program runs as quickly as possible
        newT.penup()
        newT.goto(x,y)
        newT.width(randint(3, 7))
        newT.setheading(randint(0, 359))
        newT.pendown()
        newT.forward(randint(50, 200))
        newT.penup()
        randomSideLength = randint(20, 50)
        halfLength = (randomSideLength / 2)
        newT.right(halfLength * 3)
        drawShape(randint(3, 8), randomSideLength, newColor, newT)
        newT.hideturtle()

# Call funtion when click detected
s.onclick(doSomething)
s.mainloop()