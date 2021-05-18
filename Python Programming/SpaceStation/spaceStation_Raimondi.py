import json
import turtle
import urllib.request
import time

url = "http://api.open-notify.org/astros.json"
response = urllib.request.urlopen(url)
result = json.loads(response.read())

url2 = "http://api.open-notify.org/iss-now.json"

response2 = urllib.request.urlopen(url2)
result2 = json.loads(response2.read())

iss_info = result2["iss_position"]
print(iss_info)
lon = iss_info["longitude"]
lat = iss_info["latitude"]

screen = turtle.getscreen()
screen.setup(720, 360)
screen.setworldcoordinates(-180, -90, 180, 90)
screen.bgpic("map.gif")


boston = turtle.Turtle()
boston_url = "http://api.open-notify.orf/iss-pass.json?lat=42.361145&lon=71.057"
boston.shape("circle")
boston.color("magenta", "magenta")
boston.width(5)
boston.penup()
boston.goto(-71.057083, 42.361145)

response_bos = urllib.request.urlopen(boston_url)

request_info = response_bos["request"]
