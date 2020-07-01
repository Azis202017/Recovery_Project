#define trigger D2
#define echo D1
long waktu , jarak;
int tinggimax=200;
void setup(){
  Serial.begin(9600);
  pinMode(trigger,OUTPUT);
  pinMode(echo, INPUT);
}
void loop(){
  digitalWrite(trigger,HIGH);
  delayMicroseconds(10);
  digitalWrite(trigger,LOW);
  waktu = pulseIn(echo,HIGH); 
  jarak = waktu/58;
  Serial.print("jarak : " );
  Serial.print(jarak);
  Serial.println(" CM");
  int tinggi = tinggimax-jarak;
  Serial.println("Tinggi");

  delay(500);
   
}
