/*************************************************************
  Download latest Blynk library here:
    https://github.com/blynkkk/blynk-library/releases/latest

  Blynk is a platform with iOS and Android apps to control
  Arduino, Raspberry Pi and the likes over the Internet.
  You can easily build graphic interfaces for all your
  projects by simply dragging and dropping widgets.

    Downloads, docs, tutorials: http://www.blynk.cc
    Sketch generator:           http://examples.blynk.cc
    Blynk community:            http://community.blynk.cc
    Follow us:                  http://www.fb.com/blynkapp
                                http://twitter.com/blynk_app

  Blynk library is licensed under MIT license
  This example code is in public domain.

 *************************************************************
  This example runs directly on NodeMCU.

  Note: This requires ESP8266 support package:
    https://github.com/esp8266/Arduino

  Please be sure to select the right NodeMCU module
  in the Tools -> Board menu!

  For advanced settings please follow ESP examples :
   - ESP8266_Standalone_Manual_IP.ino
   - ESP8266_Standalone_SmartConfig.ino
   - ESP8266_Standalone_SSL.ino

  Change WiFi ssid, pass, and Blynk auth token to run :)
  Feel free to apply it to any other example. It's simple!
 *************************************************************/

/* Comment this out to disable prints and save space */
#define BLYNK_PRINT Serial
#define TRIGGERPIN D5
#define ECHOPIN    D8

#include <ESP8266WiFi.h>
#include <BlynkSimpleEsp8266.h>

char auth[] = "0ZtyghoiJyT3QJLW7xWwI-f9d29OtDJa";

// Your WiFi credentials.
// Set password to "" for open networks.
char ssid[] = "Heee";
char pass[] = "abdulazis";
WidgetLCD lcd(V1);
void setup()
{
  // Debug console
  Serial.begin(9600);

  Blynk.begin(auth, ssid, pass);
  // You can also specify server:
  //Blynk.begin(auth, ssid, pass, "blynk-cloud.com", 80);
  //Blynk.begin(auth, ssid, pass, IPAddress(192,168,1,100), 8080);
  pinMode(TRIGGERPIN, OUTPUT);
  pinMode(ECHOPIN, INPUT);
}

void loop()
{
   lcd.clear();
  lcd.print(0, 0, "Distance in cm"); 
  long waktu, jarak;
  int tinggimax=200;
  digitalWrite(TRIGGERPIN,HIGH);
  delayMicroseconds(10);
  digitalWrite(TRIGGERPIN,LOW);
  waktu = pulseIn(ECHOPIN,HIGH); 
  jarak = waktu/58;
  Serial.print("jarak : " );
  Serial.print(jarak);
  Serial.println(" CM");
  int tinggi = tinggimax-jarak;
 

  delay(500);
  lcd.print(7,1,jarak);
  Blynk.run();
}
