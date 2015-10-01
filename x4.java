/// making a button on my own
boolean button = true ;

float buttonX = 100;
float buttonY = 150;
float buttonW = 100;
float buttonH = 75;

void setup() {
  size(600,600);
}
 void draw () {
   if ( mouseX > buttonX && mouseX < buttonX + buttonW && mouseY > buttonY && mouseY < buttonY+buttonH && mousePressed ) {
   
    button = false;
 } else { 
   button = true;  
 }
 if ( button ) {
  background(255,0,147); 
    stroke (0);
   
   } else {
    background(50,247,12);
   stroke(0);
   }
   
   fill(0,0, 255);
   rect(buttonX, buttonY, buttonW,buttonH);
   text( "press here!", buttonX+10,buttonY-5, buttonW/2, buttonH/2);

 }
