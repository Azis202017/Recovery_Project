
#define lampu1 D5
#define lampu2 D6

void setup() {
  // put your setup code here, to run once:
 Serial.begin(9600);
 pinMode (lampu1,OUTPUT);
 pinMode (lampu2,OUTPUT);
 
}

void loop() {
  // put your main code here, to run repeatedly:
  digitalWrite(lampu1,HIGH);
  digitalWrite(lampu2,HIGH);
  delay(1000);
}
