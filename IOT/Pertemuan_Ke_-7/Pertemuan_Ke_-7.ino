#define led D6
#define buz D5
#define trigger D2
#define echo D1 
long waktu,jarak;


void setup() {
  // put your setup code here, to run once:
Serial.begin(9600);
pinMode(buz,OUTPUT);
pinMode(trigger,OUTPUT);
pinMode(echo,INPUT);

}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(trigger.HIGH);
  delayMicroseconds(10);
  digitalWrite(trigger,LOW);
  waktu = pulseIn(echo,HIGH);
  jarak = waktu/58;
  if(jarak > 50){
    digitalWrite(D6,LOW);
    digitalWrite(D5,LOW);
  }
  else{
    digitalWrite(D5,HIGH);
    for(int i = 0; i <180; i++){
      digitalWrite(D6,HIGH);
      delay(15);
      digitalWrite(D6,LOW);  
    }
  }
}
