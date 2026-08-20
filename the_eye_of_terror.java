void setup()
{
size(600,600);
rectMode(CENTER);
background(255,0,0);
noFill();


}
float r=0;
void draw()
{translate(300,300);
  rotate(radians(r));
  rect(0,0,200,200);
  rect(300,0,100,100);
  circle(-0,50,20);
  circle(-200,0,40);
r=r+3;
}