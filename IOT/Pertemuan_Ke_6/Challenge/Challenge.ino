#define trigger D2
#define echo D1
#define buz D0
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
    digitalWrite(D0,LOW);
  }
  else if (jarak <= 50 && jarak <=49){
    digitalWrite(D0,HIGH);
  }
}
