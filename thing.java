void setup()
{size(800,800);
rectMode(CENTER);
frameRate(200000000);
background(0);
}
float f=0;
float r=0;
void draw()
{

  rotate(radians(r));
square(f,0,50);
circle(f,0,20);
r=r+1;
f+=0.2;
}