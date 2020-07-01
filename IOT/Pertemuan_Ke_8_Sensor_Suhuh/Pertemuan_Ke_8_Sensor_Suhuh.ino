
#include <DHT.h>
#define pin D6;
#define tipe DHT11
DHT dht(D6,DHT11);


void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  dht.begin();
}

void loop() {
  // put your main code here, to run repeatedly:
  repeatedly:
  float sensorSuhu = dht.readTemperature();
  float humi = dht.readHumidity();
  Serial.print("Suhu : " );
  Serial.print(sensorSuhu);
  Serial.println("C");
  
  Serial.print("Humidiity : ");
  Serial.print(humi);
  Serial.println("%");
  delay(1000);
  delay(1000);
 
}
