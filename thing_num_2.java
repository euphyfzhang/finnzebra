void setup()
{size (600,600);
rectMode(CENTER);
background(255,255,0);
}
float r=0;
void draw()
{frameRate(1000);
fill(0,5);
rect(0,0,100000,100600);
fill(255,0,0);
translate(300,300);
rotate(radians(-r));
circle(-100,0,50);
translate(100,0);
rotate(radians(r));
circle(0,0,50);
resetMatrix();
translate(350,250);
rotate(radians(r));
circle(-100,0,20);
translate(100,0);
rotate(radians(-r));
circle(0,0,20);
resetMatrix();
translate(150,200);
rotate(radians(r));
circle(-100,0,30);
translate(100,0);
rotate(radians(-r));
circle(0,0,30);
r=r+1;
}
