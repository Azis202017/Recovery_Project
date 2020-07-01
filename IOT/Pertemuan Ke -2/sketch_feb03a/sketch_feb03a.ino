#include <Servo.h>

Servo S;



void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  pinMode(D5, OUTPUT);
  S.attach(D6);
}
void loop() {
  // put your main code here, to run repeatedly:
 
  if(Serial.available()>0){
    
    int input = Serial.read();
    if(input =='A'){
      digitalWrite(D5,HIGH);
      S.write(90);
      }
    else if(input=='B'){
      digitalWrite(D5,LOW);
      S.write(0);
    }
   
     
    else if(input == 'C'){
     digitalWrite(D5,LOW);
      
      for (int i = 0; i<180; i++){
        S.write(0);
        delay(15);
          }
      for(int i =180; i>=1; i--){
        S.write(i);
        delay(15);
        }      
      }
      
    }
}

  
  
