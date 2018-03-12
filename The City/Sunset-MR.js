var canvas;
var canvasContext;
var xPosition = 650;
var yPosition = 100;
var c=document.getElementById("myCanvas");
var ctx=c.getContext("2d");
var my_gradient=ctx.createLinearGradient(0,0,0,600);
window.onload = function() {
    canvas = document.getElementById('myCanvas');
canvasContext = canvas.getContext('2d');
    //Moves the Sun part 1
var framesPerSecond = 30;
    setInterval(function() {
moveEverything();
drawEverything();
}, 1000/framesPerSecond);
}
function drawEverything() {
    //Draws Backround
my_gradient.addColorStop(0,"lightblue");
my_gradient.addColorStop(1,"#ff99cc");
ctx.fillStyle=my_gradient;
ctx.fillRect(0,0,800,600);
    //Three buildings
    canvasContext.fillStyle = 'grey';
canvasContext.fillRect(100,300,100,canvas.height);
canvasContext.fillStyle = '#FF7D33'; //Orange
canvasContext.fillRect(200,80,100,canvas.height);
    canvasContext.fillStyle = 'grey';
canvasContext.fillRect(300,200,100,canvas.height);
    
    //Draws Trees
    canvasContext.fillStyle = 'brown';
canvasContext.fillRect(500,540,20,canvas.height);
    canvasContext.beginPath();
canvasContext.fillStyle = 'green'; 
canvasContext.arc(495,550,20,0,2*Math.PI,true);canvasContext.fill();
    canvasContext.beginPath();
canvasContext.fillStyle = 'green'; 
canvasContext.arc(510,530,20,0,2*Math.PI,true);canvasContext.fill();
    canvasContext.beginPath();
canvasContext.fillStyle = 'green'; 
canvasContext.arc(525,550,20,0,2*Math.PI,true);canvasContext.fill();
    canvasContext.fillStyle = 'brown';
canvasContext.fillRect(600,520,20,canvas.height);
    canvasContext.beginPath();
canvasContext.fillStyle = 'green'; 
canvasContext.arc(595,530,20,0,2*Math.PI,true);canvasContext.fill();
    canvasContext.beginPath();
canvasContext.fillStyle = 'green'; 
canvasContext.arc(610,510,20,0,2*Math.PI,true);canvasContext.fill();
    canvasContext.beginPath();
canvasContext.fillStyle = 'green'; 
canvasContext.arc(625,530,20,0,2*Math.PI,true);canvasContext.fill();
    //Draws Sun
    canvasContext.beginPath();
canvasContext.fillStyle = '#FFC24F';//Yellow/Orange 
canvasContext.arc(xPosition,yPosition,60,0,2*Math.PI,true);canvasContext.fill();
    //Draws Grass
    canvasContext.beginPath();
    canvasContext.moveTo(0,600);
canvasContext.lineTo(800,600);
canvasContext.lineWidth = 25;
canvasContext.strokeStyle = 'green';
canvasContext.stroke();
{   //Draws Windows
        canvasContext.moveTo(115,310);
    canvasContext.lineTo(115,330);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(115,340);
    canvasContext.lineTo(115,360);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(115,370);
    canvasContext.lineTo(115,390);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
            canvasContext.moveTo(115,400);
    canvasContext.lineTo(115,420);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(115,430);
    canvasContext.lineTo(115,450);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(115,460);
    canvasContext.lineTo(115,480);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,90);
    canvasContext.lineTo(215,110);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,120);
    canvasContext.lineTo(215,140);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,150);
    canvasContext.lineTo(215,170);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,180);
    canvasContext.lineTo(215,200);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,210);
    canvasContext.lineTo(215,230);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,240);
    canvasContext.lineTo(215,260);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,270);
    canvasContext.lineTo(215,290);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,300);
    canvasContext.lineTo(215,320);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,330);
    canvasContext.lineTo(215,350);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,360);
    canvasContext.lineTo(215,380);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,390);
    canvasContext.lineTo(215,410);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,420);
    canvasContext.lineTo(215,440);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(215,450);
    canvasContext.lineTo(215,470);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,210);
    canvasContext.lineTo(315,230);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,240);
    canvasContext.lineTo(315,260);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,270);
    canvasContext.lineTo(315,290);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,300);
    canvasContext.lineTo(315,320);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,330);
    canvasContext.lineTo(315,350);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,360);
    canvasContext.lineTo(315,380);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,390);
    canvasContext.lineTo(315,410);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,420);
    canvasContext.lineTo(315,440);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
        canvasContext.moveTo(315,450);
    canvasContext.lineTo(315,470);
    canvasContext.lineWidth = 10;
    canvasContext.strokeStyle = 'white';
    canvasContext.stroke();
    context.closePath();
};
}
     //Moves the Sun part 2
    function moveEverything(){
if(yPosition < 400){
yPosition = yPosition + 0.50;}
        
}