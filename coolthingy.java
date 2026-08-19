float animation=0;
float supamei=600;
float iemapus=300;
float negative=300;
void setup()
{textSize(30);
  
 size(600,600);
}

void draw(){fill(50,4947);
  text("FLASHINGLIGHTSWARNING",140,50);
  
 
  fill(255,255,0);
  triangle(50,300,200,200,200,400);
  triangle(200,200,300,50,400,200);
  triangle(400,200,550,300,400,400);
  triangle(400,400,450,575,300,450);
  triangle(300,450,150,575,200,400);
  fill(random(255));
  quad(300,450,400,300,300,200,200,300);
  quad(500,150,550,50,510,25,475,50);
  quad(100,150,140,50,90,20,60,50);
  quad(500,550,550,500,500,450,450,500);
  quad(100,550,150,500,100,450,50,500);

   fill(0,10);
  rect(0,0,600,600);
    stroke(random(255),random(255),random(255));
    fill(random(255),random(255),random(255));
  circle(animation,supamei,50);
  circle(supamei,animation,50);
  circle(supamei,supamei,50);
  circle(animation,animation,50);
  circle(iemapus,iemapus,50);
  circle(negative,negative,50);
  circle(negative,iemapus,50);
  circle(iemapus,negative,50);
  circle(iemapus,300,50);
  circle(negative,300,50);
  circle(300,negative,50);
  circle(300,iemapus,50);
  circle(300,supamei,50);
  circle(supamei,300,50);
  circle(animation,300,50);
  circle(300,animation,50);
  circle(300,300,100);
  supamei-=1;
  animation+=1;
  iemapus-=1;
  negative+=1;
  
  if (negative == 600) {
    animation=0;
    supamei=600;
    iemapus=300;
    negative=300;
  }
}