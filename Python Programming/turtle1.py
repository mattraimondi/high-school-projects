import turtle
import time
from random import randint

# get the screen, set width and height
s = turtle.getscreen()
sWidth = 700
sHeight = 800
s.screensize(sWidth, sHeight)
s.bgcolor("dodgerblue")

# create turtle
t1 = turtle.getturtle()
t1.shape("turtle")
t1.width(3)
t1.speed(0)

# function to draw a shape using the turtle pen feature
def drawShape(sides, sideLength, color):
    t1.pendown()
    t1.color(color)
    for i in range(sides):
        t1.forward(sideLength)
        t1.left(360/sides)
    t1.penup()

# creates a cool design
def multipleShapes(sides, sideLength, color):
    for i in range(sides):
        drawShape(sides, sideLength, color)
        t1.right(360/sides)

#randomNumber = randint(3,6)
#multipleShapes(randomNumber, 100, "green")

t1.circle(50)
time.sleep(3)