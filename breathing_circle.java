void setup()
{
size(600,600);
}
float breath=0;
void draw()
{
fill(0,10);
rect(0,0,600,600);
stroke(255,0,0);
strokeWeight(5);
noFill();
circle(300,300,noise(breath)*600);
breath=breath+0.01;
}
