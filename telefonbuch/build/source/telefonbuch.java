import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class telefonbuch extends PApplet {

// String name01 = "Adam Apfel";
// String name02 = "Bernd Birne";
// String name03 = "Christoph Ce";
//
// String number01 = "09333 1432";
// String number02 = "09333 8172";
// String number03 = "09333 496";
JSONArray list;


public void setup()
{




list = loadJSONArray("json/list.json");

}

public void draw()
{
  background(255);
  fill(0);
  textSize(24);
  text("Telefonbuch:", 20, 40);

  textSize(14);

  for(int i = 0; i < list.size(); i++)
  {
    JSONObject entry = list.getJSONObject(i);
    text(entry.getString("name") + ": " + entry.getString("number"), 20, 80 + i * 30);
  }
}

  public void mousePressed()
  {
    list = loadJSONArray("json/list.json");
  }


  // textSize(14);
  // text(name01 + ": " + number01, 20, 80);
  // text(name02 + ": " + number02, 20, 110);
  // text(name03 + ": " + number03, 20, 140);
  public void settings() { 
size(400, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "telefonbuch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
