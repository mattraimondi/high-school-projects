# Turtle 2
# Exploring the Python Turtle library
# 2 October 2020

import turtle
from random import randint

# Get the screen, set width and height
s = turtle.getscreen()
sWidth = 1000
sHeight = 600
s.screensize(sWidth, sHeight)
s.bgcolor("deepskyblue")

# Create turtle and hide it
t1 = turtle.getturtle()
t1.hideturtle()

# Function to draw a shape using the turtle pen feature
def drawShape(sides, sideLength, turtle):
    turtle.pendown()
    for i in range(sides):
        turtle.forward(sideLength)
        turtle.left(360/sides)
    turtle.penup()

# Do something function
def doSomething(x, y):
    for i in range(randint(10, 30)):
        newT = turtle.Turtle()
        newT.speed(0)
        newT.penup()
        newT.goto(x,y)
        newT.width(randint(3, 7))
        newT.setheading(randint(0, 359))
        newT.pendown()
        newT.forward(randint(50, 200))
        newT.penup()
        drawShape(4, randint(20,50), newT)
        newT.hideturtle()

# Call funtion when click detected
s.onclick(doSomething)
s.mainloop()