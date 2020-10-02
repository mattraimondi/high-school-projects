# Turtle 1
# Exploring the Python Turtle library
# 15 September 2020

import turtle
from random import randint

# Get the screen, set width and height
s = turtle.getscreen()
sWidth = 700
sHeight = 800
s.screensize(sWidth, sHeight)
s.bgcolor("dodgerblue")

# Create turtle
t1 = turtle.getturtle()
t1.shape("turtle")
t1.width(3)
t1.speed(0)

# Function to draw a shape using the turtle pen feature
def drawShape(sides, sideLength, color):
    t1.pendown()
    t1.color(color)
    for i in range(sides):
        t1.forward(sideLength)
        t1.left(360/sides)
    t1.penup()

# Creates a cool design
def multipleShapes(sides, sideLength, color):
    for i in range(sides):
        drawShape(sides, sideLength, color)
        t1.right(360/sides)
        
# Creates a cooler design
def randomMultipleShapes(color):
    for i in range(10):
        sides = randint(3,6)
        sideLength = randint(50,150)
        drawShape(sides, sideLength, color)
        t1.right(360/sides)

randomMultipleShapes("purple")