 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketpesawat;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class TiketPesawat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean Login = true;
        while (Login){
        System.out.println("Selamat Datang Di Azis Shop ");
        System.out.println("^_^_^_^_^_^_^_^_^_^_^_^_^__^_^__^_^__^^_^_^");
        System.out.println("Silahkan Login Terlebih Dahulu Untuk Membeli Tiket Pesawat Online");
        System.out.println("==================================================================");
        Scanner input = new Scanner(System.in);
        
            
            String Username,Password,inputUser,inputPassword;
            Username = "Azis";
            Password = "1234";
           
            System.out.println("Masukkan Username Anda : ");
            inputUser = input.nextLine();
            Scanner input2 = new Scanner (System.in);
            System.out.println("Masukkan Password Anda : ");
            inputPassword = input2.nextLine();
            
            if (inputUser.equalsIgnoreCase(Username) && (inputPassword.equalsIgnoreCase(Password))){
                System.out.println("Selamat Anda Sudah Login");
                boolean Menu = true;
                while (Menu){
                System.out.println("Silahkan Memilih Tiket Yang Tersedia");
                System.out.println("**************************************");
                System.out.println("1.Garuda Indonesia");
                System.out.println("2.Lion Air");
                System.out.println("3.Keluar");
                System.out.println("***************************************");
                Scanner tiket = new Scanner(System.in);
                System.out.println("Silahkan Pilih Tiket dengan nomor yang tersedia : ");
                int tiket2 = tiket.nextInt();
                 if (tiket2 == 1){
                     
                     System.out.println("Pilihan class dan tujuan :");
                     System.out.println("1. First class Jakarta-BALI");
                     System.out.println("2.Vip Class Indonesia-Amerika");
                    
                     Scanner PemilihanClass = new Scanner(System.in);
                     int PemilihanClassPesawat = PemilihanClass.nextInt();
                        boolean PemilihanPesawat = true;
                        while (PemilihanPesawat){
                        if (PemilihanClassPesawat == 1){
                         System.out.println("Anda Telah Memilih First Class Garuda  Jakarta-Bali");
                         System.out.println(" Tarif Harga Yang Dikenakan : ");
                         System.out.println("1.Hanya berangkat Rp = 3.000.000");
                         System.out.println("2.Pulang Pergi = Rp 6.000.000");
                         Scanner PemilihanTarif = new Scanner(System.in);
                         int PemilihanTarif2 = PemilihanTarif.nextInt();
                         if (PemilihanTarif2 == 1 ){
                             System.out.println("Anda Memilih Tiket Pesawat Garuda dengan pilihan Hanya berangkat dengan pesawat Garuda Tujuan Jakarta-Bali  ");
                             System.out.println ("***********************************************************************************************************");
                             Scanner JumlahOrang = new Scanner(System.in);
                             System.out.println("Jumlah Orang? ");
                             int JumlahOrang2 = JumlahOrang.nextInt();
                             int JumlahOrang3 = JumlahOrang2*3000000;
                             System.out.println("Total Harga : Rp." + JumlahOrang3);
                             System.out.println("***********************************************************************************************************");
                             System.out.println("Apakah anda sudah yakin? ");
                             System.out.println("Jawab (YA/TIDAK)");
                             Scanner jawab = new Scanner(System.in);
                             String jawab2 = jawab.nextLine();
                             if (jawab2.equalsIgnoreCase("YA")){
                                 System.out.println("Pesanan anda berhasil dipesan!!! Terimakasih Sudah Memesan ^_^ ");
                                 System.out.println("Apakah Anda Ingin Balik Ke Menu?");
                                    System.out.println("Jawab (ya/tidak)");
                                    Scanner jawab4 = new Scanner(System.in);
                                    String jawab3 = jawab4.nextLine();
                                    if (jawab3.equalsIgnoreCase("ya")){
                                    PemilihanPesawat = false;
                                    Menu = true;   
                                    }
                                   
                             }
                             else if (jawab2.equalsIgnoreCase("Tidak")){
                                 PemilihanPesawat = true;
                                 PemilihanPesawat = false;
                             }
                             
                             
                        
                         }
                         else if (PemilihanTarif2 == 2){
                             boolean pemilihanPesawat = true;
                             while(pemilihanPesawat) { 
                             System.out.println("Anda Menggunakan Jasa Pesawat Garuda Tujuan Jakarta-Bali Pulang Pergi");
                             System.out.println("Harga Tiket ");
                             System.out.println("Pulang Pergi Garuda Jakarta-Bali Rp 6.000.000");
                             System.out.println("Jumlah Orang?");
                             Scanner Jumlah = new Scanner(System.in);
                             int Jumlah2 = Jumlah.nextInt();
                             int jumlah = Jumlah2*6000000;
                             System.out.println("Total Harga : Rp." +jumlah);
                             System.out.println("Apakah anda sudah yakin?");
                             System.out.println("Jawabannya (Yap/Tidak)");
                             Scanner Hah = new Scanner(System.in);
                             String Hah2 = Hah.nextLine();
                             boolean hah3 = true;
                             while (hah3){
                             if(Hah2.equalsIgnoreCase("Yap")){
                                System.out.println("Tiket Yang Anda Pesan Berhasil!!! Terimakasih Sudah Memesan ^_^");
                                System.out.println("Apakah anda ingin balik ke menu?");
                                Scanner heymenu = new Scanner(System.in);
                                System.out.println("Silahkan Ketik Kembali Ke Menu Untuk Balik Ke menu, namun jika anda tidak yakin bisa mengetikkan Tidak Yakin untuk kembali ke pembayaran");
                                String heymenu2 = heymenu.nextLine();
                                if(heymenu2.equalsIgnoreCase("Kembali Ke Menu")){
                                    Menu = true;
                                    hah3 = false;
                                    pemilihanPesawat = false;
                                    PemilihanPesawat = false;
                                }
                                
                                else if (heymenu2.equalsIgnoreCase("Tidak Yakin")){
                                   hah3 = false; 
                                    pemilihanPesawat = true;
                                    
                             }
                   
                              
                             }
                             else if (Hah2.equalsIgnoreCase("Tidak")){
                                 hah3 = false;
                                 pemilihanPesawat = true;
                             }
                         }
                        }
                        
                        }
                         
                         
                       
                     }
                        else if (PemilihanClassPesawat ==2){
                            System.out.println("VIP Indonesia-Amerika");
                            System.out.println("Tarif Harga");
                            System.out.println("1.PP Garuda Indonesia = Rp 15.000.000");
                            System.out.println("2.Pergi Garuda Indonesia Rp = 10.000.000");
                            Scanner BuanyakTarif = new Scanner(System.in);
                            System.out.println("Silahkan Pilih Yang Mana : ");
                            int tarifParah = BuanyakTarif.nextInt();
                            if (tarifParah == 1){
                                System.out.println("PP Garuda Indonesia");
                                System.out.println("1. orang harganya 15.000.000");
                                Scanner Harrga = new Scanner(System.in);
                                System.out.println("Masukkan Jumlah Orang : ");
                                int Har3 = Harrga.nextInt();
                                int hr4 = Har3*15000000;
                                System.out.println("Apakah Anda Sudah Yakin?");
                                System.out.println("Ya/Tidak ");
                                Scanner Yakin = new Scanner(System.in);
                                String Yakin2 = Yakin.nextLine();
                                if (Yakin2.equalsIgnoreCase("Ya")){
                                   System.out.println("Pesanan Anda Berhasil Dipesan ^_^ Terimakasih Sudah Memesan^_^");
                                   System.out.println("Balik Lagi Kemenu?");
                                   System.out.println("Ketik Ya Untuk Balik Kemenu Lagi Dan  Ketik Tidak Untuk Logout");
                                   Scanner Auah = new Scanner(System.in);
                                   String Auah2 = Auah.nextLine();
                                   if(Auah2.equalsIgnoreCase("Ya")){
                                       
                                       Menu = true;
                                       Menu = false;
                                   }
                                  
                                   else if(Auah2.equalsIgnoreCase("Tidak")){
                                       
                                       PemilihanPesawat =false;
                                       Menu =false;
                                       Login = true;
                                   }
                                   }
                                    
                                }
                                 else if(tarifParah == 2){
                                     System.out.println("Tiket Pergi Doang");
                                     System.out.println("1. orang harganya Rp 10.000.000");
                                     System.out.println("Jumlah Orang :" );
                                     Scanner how = new Scanner(System.in);
                                     int How = how.nextInt();
                                     int How2 = How * 10000000;
                                     System.out.println("Total Harga : "+ How2);
                                     System.out.println("Apakah Anda Sudah Yakin?");
                                     System.out.println("Ya/Tidak");
                                     Scanner inputJwbn = new Scanner(System.in);
                                     String InputJwbn = inputJwbn.nextLine();
                                     if (InputJwbn.equalsIgnoreCase("Ya")){
                                         System.out.println("Apakah Anda Ingin Balik Ke Menu?");
                                         System.out.println("Ketik Ya untuk kembali ke menu, dan ketik keluar untuk logout");
                                         Scanner a = new Scanner (System.in);
                                         String b = a.nextLine();
                                         if (b.equalsIgnoreCase("Ya")){
                                            
                                             Menu = true;
                                             PemilihanPesawat = false; 
                                         }
                                         else if (b.equalsIgnoreCase("Keluar")){
                                             Login = true;
                                             Login = false;
                                         }
                                     }
                                     else if(InputJwbn.equalsIgnoreCase("Tidak")){
                                         System.out.println("Apakah Anda Ingin Melakukan Transaksi Lagi?");
                                         System.out.println("Ketik Ya Untuk Melakukan Transaksi Lagi,ketik Keluar untuk Logout");                                        
                                         Scanner y = new Scanner(System.in);
                                         String o = y.nextLine();
                                         if(o.equalsIgnoreCase("Ya")){
                                             PemilihanPesawat = true;
                                             PemilihanPesawat = false;
                                         }  
                                         else if (o.equalsIgnoreCase("Tidak")){
                                             Login = true;
                                             Login = false;
                                         }
                                     
                                     }
                            }
                            }
                        
                        }       
                     
                 }
                 
                 else if (tiket2 ==2 ){
                     System.out.println("Lion Air");
                     System.out.println("1.First Class Jakarta-Surabaya");
                     System.out.println("2.Business Class Surabaya-Kalimantan");
                     Scanner Pilihan2  = new Scanner(System.in);
                     int Pilihan = Pilihan2.nextInt();
                     if (Pilihan == 1){
                     Boolean FirstClass =true;
                     while (FirstClass){
                     System.out.println("First Class Jakarta-Surabaya");
                     System.out.println("1.Pulang Pergi");
                     System.out.println("2.Berangkat");
                     Scanner MilihLagi = new Scanner(System.in);
                     int MilihLagi2 = MilihLagi.nextInt();
                     if (MilihLagi2 == 1){
                         boolean FirstClass2 = true;
                         while (FirstClass2){
                         System.out.println("First Class Lion Air Jakarta-Surabaya");
                         System.out.println("PP");
                         System.out.println("1 Orang Dengan Harga Rp 3.000.000");
                         System.out.println("Jumlah Orang :");
                         Scanner e = new Scanner(System.in);
                         int e2 = e.nextInt();
                         int e3 = e2 * 3000000;
                         System.out.println("Total Harga : Rp. " + e3);
                         FirstClass2 = false;
                         }
                         System.out.println("Apakah Anda Sudah Yakin?");
                         System.out.println("YA/Tidak");
                         Scanner hei = new Scanner(System.in);
                         String hei2 = hei.nextLine();
                         if (hei2.equalsIgnoreCase("Ya")){
                             System.out.println("Transaksi Anda Sudah Berhasil ^_^ ");
                             System.out.println("Apakah Anda Ingin Kembali Ke Menu?");
                             System.out.println("Ketik Iya untuk kembali kemenu dan ketik Keluar untuk logout");
                             Scanner yy = new Scanner(System.in);
                             String yyy = yy.nextLine();
                             if (yyy.equalsIgnoreCase("Iya")){
                             Menu = true;
                             FirstClass = false;
                             }
                                                                  
                            
                             else if (yyy.equalsIgnoreCase("Keluar")){
                                 Login = true;
                                 Menu = false;
                                 
                             }
                             
                         }
                         else if (hei2.equalsIgnoreCase("Tidak")){
                             System.out.println("Ketik ya untuk Melakukan Pembayaran lagi");
                             Scanner balik = new Scanner(System.in);
                             String balik2 = balik.nextLine();
                             if (balik2.equalsIgnoreCase("Ya"));
                             FirstClass2 = true;
                                     }
                         
                     }
                     
                     }
                         
                 
                 }
                 
                 else if (tiket2 ==3){
                     System.out.println("Logout!");
                     System.out.println("Serius Mau Logout? ");
                     System.out.println("Ketik Serius Untuk Logout");
                     Scanner Logout = new Scanner(System.in);
                     String Logout2 = Logout.nextLine();
                     if (Logout2.equalsIgnoreCase("Serius")){
                         Menu = false;
                         Login = true;
                         System.out.println("Selamat Anda Telah Logout!");
                         
                     }
                 }
                     
                 
                 
                
                 
            
                 else {
                     System.out.println("Maaf Hasil Yang Anda Ketikkan Tidak Tersedia ^_^");
                     System.out.println("Apakah Anda Ingin Kembali Lagi Ke Menu? ");
                     System.out.println("Jawabannya (Ya/Tidak)");
                     Scanner Rempong = new Scanner (System.in);
                     String Rempong2 = Rempong.nextLine();
                     if(Rempong2.equalsIgnoreCase("Ya")){
                         Menu = true;
                     }
                     else if(Rempong2.equalsIgnoreCase("Tidak")){
                         System.out.println("Terimakasih ^_^");
                         System.out.println("Ketik Keluar");
                         Scanner Keluar13 = new Scanner(System.in);
                         String Keluar14 = Keluar13.nextLine();
                         if(Keluar14.equalsIgnoreCase("Keluar")){
                             Menu = false;
                             Login = true;
                         }
                     }
                     
                 }
                
                         
                         
                }
            }
            
            }  
            
           
        
            else {
                System.out.println("Password Anda Salah !!!");
                System.out.println("Apakah Anda Ingin Mencoba Lagi?");
                Scanner CobaLagi = new Scanner(System.in);
                System.out.println("Ketikkan Yap Untuk Login Kembali jikalau tidak ingin login lagi silahkan ketik Tidak Ingin");
                String Cobalagi2 = CobaLagi.nextLine();
                
                if(Cobalagi2.equalsIgnoreCase("Yap")){
                    Login = true;
                }
                else if (Cobalagi2.equalsIgnoreCase("Tidak Ingin")){
                    System.out.println("Terimakasih ^_^ Silahkan Datang Kembali");
                    Login = false;
                }
            }     
        }
    }
    }
    

    
  

