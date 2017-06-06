// String name01 = "Adam Apfel";
// String name02 = "Bernd Birne";
// String name03 = "Christoph Ce";
//
// String number01 = "09333 1432";
// String number02 = "09333 8172";
// String number03 = "09333 496";
JSONArray list;


void setup()
{

size(400, 800);


list = loadJSONArray("json/list.json");

}

void draw()
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

  void mousePressed()
  {
    list = loadJSONArray("json/list.json");
  }


  // textSize(14);
  // text(name01 + ": " + number01, 20, 80);
  // text(name02 + ": " + number02, 20, 110);
  // text(name03 + ": " + number03, 20, 140);
