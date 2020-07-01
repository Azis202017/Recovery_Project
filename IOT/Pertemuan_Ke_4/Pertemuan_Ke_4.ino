#include <Servo.h>
#define led D5
#define buz D3
Servo S;




void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  S.attach(D8);
  pinMode(led, OUTPUT);
  pinMode(buz, OUTPUT);
}

void loop() {

  // put your main code here, to run repeatedly:
  if (Serial.available() > 0) {
    int input = Serial.read();
    if (input == 'A') {
      digitalWrite(D5, HIGH);
      digitalWrite(D3,HIGH);
      S.write(90);
    }
    else if (input == 'B') {
      digitalWrite(D5, LOW);
      digitalWrite(D3, LOW);
      S.write(0);
    }
    else if (input == 'C') {
      digitalWrite(D5,LOW);
      digitalWrite(D3,LOW);
      for(int i=0; i <180; i++){
        S.write(0);
        delay(15);
      }
      for(int i=180; i >= 1; i--){
        S.write(i);
      }
    }
  }
}
