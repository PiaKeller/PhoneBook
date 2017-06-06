String name01 = "Adam Apfel";
String name02 = "Bernd Birne";
String name03 = "Christoph Ce";

String number01 = "09333 1432";
String number02 = "09333 8172";
String number03 = "09333 496";

void setup()
{

size(400, 800);
background(255);

}

void draw()
{
  fill(0);
  textSize(24);
  text("Telefonbuch:", 20, 40);

  textSize(14);
  text(name01 + ": " + number01, 20, 80);
  text(name02 + ": " + number02, 20, 110);
  text(name03 + ": " + number03, 20, 140);

}
