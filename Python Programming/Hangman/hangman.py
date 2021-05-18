import turtle
from turtle import *
import math
from random import randint

sWidth = 1300
sHeight = 650

screen = turtle.getscreen()
screen.setup(sWidth, sHeight)
screen.bgcolor("orange")

gameWin = False
gameLose = False
wordList = ["CHRONIC", "PHLEGM", "PTERODACTYL", "MUSCLE", "MNEMONIC", "ASTHMA", "APROPOS", "RECEIPT"]
secretWord = wordList[randint(1, len(wordList) - 1)]
boolList = [False, False, False, False, False, False, False, False, False, False, False]
goodLetters = []
badLetters = []
badLetterIterator = 0
correctLetters = []
for letters in secretWord:
    correctLetters.append(letters)


def reset_game():
    global gameWin, gameLose, secretWord, boolList, goodLetters, badLetters, badLetterIterator, correctLetters
    gameWin = False
    gameLose = False
    secretWord = wordList[randint(1, len(wordList) - 1)]
    boolList = [False, False, False, False, False, False, False, False, False, False, False]
    goodLetters = []
    badLetters = []
    badLetterIterator = 0
    correctLetters = []
    for letter in secretWord:
        correctLetters.append(letter)
    wordTurtle.clear()
    manTurtle.clear()
    errTurtle.clear()
    badTurtle.clear()


manTurtle = Turtle()  # Draws the hangman
manTurtle.hideturtle()
manTurtle.color("blue")
width_h_pot = math.sqrt(sWidth ** 2 + sHeight ** 2)
manTurtle.width(int(width_h_pot * 0.01))
manTurtle.speed(0)
manTurtle.penup()

wordTurtle = Turtle()  # Word turtle to draw the blanks and letters
wordTurtle.hideturtle()
wordTurtle.penup()
wordTurtle.color("blue")
wordTurtle.setheading(180)
wordTurtle.forward(300)
wordTurtle.setheading(270)
wordTurtle.forward(50)

errTurtle = Turtle()  # Error message turtle
errTurtle.hideturtle()
errTurtle.penup()
errTurtle.color("blue")

badTurtle = Turtle()  # Bad letter turtle
badTurtle.hideturtle()
badTurtle.penup()
badTurtle.color("blue")
badTurtle.setheading(180)
badTurtle.forward(300)
badTurtle.setheading(270)
badTurtle.forward(100)


def draw_scaffold():
    manTurtle.penup()
    manTurtle.setheading(0)
    manTurtle.forward(int(sWidth * 0.25))
    manTurtle.setheading(270)
    manTurtle.forward(int(sHeight / 4))

    manTurtle.pendown()
    manTurtle.setheading(180)
    manTurtle.forward(int(sHeight / 4))
    manTurtle.setheading(0)
    manTurtle.forward(int(sHeight / 2))
    manTurtle.setheading(180)
    manTurtle.forward(int(sHeight / 4))

    manTurtle.setheading(90)
    manTurtle.forward(int(sHeight / 2))

    manTurtle.setheading(180)
    manTurtle.forward(int(sHeight / 8))
    manTurtle.penup()


def draw_head():
    manTurtle.setheading(180)
    manTurtle.forward(20)
    manTurtle.setheading(270)
    manTurtle.forward(30)

    manTurtle.pendown()
    manTurtle.circle(30)
    manTurtle.setheading(90)
    manTurtle.penup()


def draw_body():
    manTurtle.setheading(0)
    manTurtle.forward(30)
    manTurtle.setheading(270)
    manTurtle.forward(30)

    manTurtle.pendown()
    manTurtle.setheading(270)
    manTurtle.forward(sHeight / 8)

    manTurtle.penup()


def draw_arms(d):
    if d == 'l':
        manTurtle.setheading(90)
        manTurtle.forward(sHeight / 16)
        manTurtle.pendown()
        manTurtle.setheading(180)
        manTurtle.forward(sHeight / 16)
        manTurtle.setheading(0)
        manTurtle.forward(sHeight / 16)
        manTurtle.penup()
        manTurtle.setheading(270)
        manTurtle.forward(sHeight / 16)

    elif d == 'r':
        manTurtle.setheading(90)
        manTurtle.forward(sHeight / 16)
        manTurtle.pendown()
        manTurtle.setheading(0)
        manTurtle.forward(sHeight / 16)
        manTurtle.setheading(180)
        manTurtle.forward(sHeight / 16)
        manTurtle.penup()
        manTurtle.setheading(270)
        manTurtle.forward(sHeight / 16)


def draw_legs(d):
    if d == 'l':
        manTurtle.pendown()
        manTurtle.setheading(247.5)
        manTurtle.forward(sHeight / 8)
        manTurtle.setheading(67.5)
        manTurtle.forward(sHeight / 8)
        manTurtle.penup()

    elif d == 'r':
        manTurtle.pendown()
        manTurtle.setheading(292.5)
        manTurtle.forward(sHeight / 8)
        manTurtle.setheading(112.5)
        manTurtle.forward(sHeight / 8)
        manTurtle.penup()


def draw_hands(d):
    if d == 'l':
        manTurtle.setheading(90)
        manTurtle.forward(sHeight / 16)
        manTurtle.setheading(180)
        manTurtle.forward(sHeight / 16)
        manTurtle.pendown()
        manTurtle.circle(5)
        manTurtle.penup()
        manTurtle.setheading(0)
        manTurtle.forward(sHeight / 16)
        manTurtle.setheading(270)
        manTurtle.forward(sHeight / 16)

    elif d == 'r':
        manTurtle.setheading(90)
        manTurtle.forward(sHeight / 16)
        manTurtle.setheading(0)
        manTurtle.forward(sHeight / 16)
        manTurtle.setheading(180)
        manTurtle.pendown()
        manTurtle.circle(5)
        manTurtle.penup()
        manTurtle.forward(sHeight / 16)
        manTurtle.setheading(270)
        manTurtle.forward(sHeight / 16)


def draw_feet(d):
    if d == 'l':
        manTurtle.setheading(247.5)
        manTurtle.forward(sHeight / 8)
        manTurtle.pendown()
        manTurtle.setheading(180)
        manTurtle.forward(sHeight / 32)
        manTurtle.setheading(0)
        manTurtle.forward(sHeight / 32)
        manTurtle.penup()
        manTurtle.setheading(67.5)
        manTurtle.forward(sHeight / 8)

    elif d == 'r':
        manTurtle.setheading(292.5)
        manTurtle.forward(sHeight / 8)
        manTurtle.pendown()
        manTurtle.setheading(0)
        manTurtle.forward(sHeight / 32)
        manTurtle.setheading(180)
        manTurtle.forward(sHeight / 32)
        manTurtle.penup()
        manTurtle.setheading(112.5)
        manTurtle.forward(sHeight / 8)


def get_guess():
    try:
        while True:
            x = turtle.textinput("Guess", "Guess A Letter").upper()
            if x == '':
                write_error_message("Please enter a guess")
            else:
                write_error_message(' ')
                return x
    except Exception as e:
        print(e)
        quit()


def draw_word(guess):
    wordTurtle.clear()
    screen_word = ""
    if len(guess) > 1:
        if guess == secretWord:
            global gameWin
            gameWin = True
        else:
            global gameLose
            gameLose = True
    else:
        if guess in correctLetters:
            add_good_letter(guess)
        else:
            add_bad_letter(guess)

        for i in range(0, len(secretWord)):
            if secretWord[i] in goodLetters:
                screen_word += secretWord[i] + " "
            else:
                screen_word += "_" + " "

        if '_' not in screen_word:
            gameWin = True

    my_font_size = 20
    wordTurtle.write(screen_word, move=False, align="left", font=("Courier", my_font_size, "normal"))
    draw_bad_letters()


def update_drawing(incoming_list):  # all boolean values
    manTurtle.goto(0, 0)
    manTurtle.hideturtle()
    manTurtle.penup()

    if incoming_list[0]:
        draw_scaffold()
    if incoming_list[1]:
        draw_head()
    if incoming_list[2]:
        draw_body()
    if incoming_list[3]:
        draw_arms('l')
    if incoming_list[4]:
        draw_arms('r')
    if incoming_list[5]:
        draw_legs('l')
    if incoming_list[6]:
        draw_legs('r')
    if incoming_list[7]:
        draw_hands('l')
    if incoming_list[8]:
        draw_hands('r')
    if incoming_list[9]:
        draw_feet('l')
    if incoming_list[10]:
        draw_feet('r')


def add_good_letter(letter):
    global goodLetters
    if letter not in goodLetters:
        goodLetters.append(letter)


def add_bad_letter(letter):
    global badLetters, badLetterIterator
    if letter not in badLetters:
        badLetters.append(letter)
        badLetterIterator += 1

    if badLetterIterator <= 11 and badLetterIterator != 0:
        global boolList
        for i in range(0, badLetterIterator):
            boolList[i] = True
        update_drawing(boolList)
    else:
        global gameLose
        gameLose = True


def draw_bad_letters():
    badTurtle.clear()
    my_font_size = 15
    badTurtle.write(badLetters, move=False, align="left", font=("Courier", my_font_size, "normal"))


def write_error_message(the_msg):
    errTurtle.clear()
    my_font_size = 15
    errTurtle.write(the_msg, move=False, align="left", font=("Courier", my_font_size, "normal"))


def game_loop():
    while not gameWin:
        draw_word(get_guess())
        if gameLose:
            break
    game_over()
    if ask_to_play() == 'Y':
        game_loop()


def game_over():
    if gameWin:
        write_error_message("Yay! You have won!")
    if gameLose:
        write_error_message("You have lost.")


def ask_to_play():
    try:
        while True:
            x = turtle.textinput("Y/n", "Play again?").upper()
            if len(x) > 1:
                write_error_message("Please enter Y or N")
            elif x == 'Y':
                reset_game()
                return x
            elif x == 'N':
                return x
            else:
                write_error_message("Please enter Y or N")
    except Exception as e:
        print(e)
        quit()


# Execution
game_loop()
turtle.mainloop()
