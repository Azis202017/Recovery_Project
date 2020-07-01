#define led D5
#define buz D3

void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(led,OUTPUT);
pinMode(buz,OUTPUT);
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(led,HIGH);
  digitalWrite(buz,HIGH);
  delay(1000);
  digitalWrite(led,LOW);
  digitalWrite(buz,LOW);
  delay(1000);
}
