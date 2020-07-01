/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latproject;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Latproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-------");
        System.out.println("Untuk memesan silahkan Login ");
        System.out.println("-------");
        System.out.println("Username");
        System.out.println("Password");
        System.out.println("--------");
        
        String username = "APAA";
        String password = "IYAA";
        
        boolean benar = true;
        
        //input satu
        Scanner username1 = new Scanner (System.in);
        username = username1.nextLine();
        
        //input dua
        Scanner password1 = new Scanner (System.in);
        password = password1.nextLine ();
        
        if (username.equalsIgnoreCase("APAA")&& password.equals("IYAA")){
            System.out.println("Daftar tiket bioskop :");
            System.out.println("1. VVIP");
            System.out.println("2. VIP");
            System.out.println("3. REGULAR");
            System.out.println("4. Logout");
            Scanner daftar = new Scanner (System.in);
            int daftartiket = daftar.nextInt();
            
        if(daftartiket ==1 ){
            System.out.println("VVIP");
            
            Scanner HargaTiket2 = new Scanner(System.in);
            int HargaTiket =HargaTiket2.nextInt();
            int HargaTiket3 = HargaTiket*60000;
            System.out.println ("Jumlah Harga Tiket " + HargaTiket3);
        }
        else if (daftartiket ==2 ){
            System.out.println("VIP");
            Scanner HargaTiket2 = new Scanner(System.in);
            int HargaTiket =HargaTiket2.nextInt();
            int HargaTiket3 = HargaTiket*55000;
            System.out.println ("Jumlah Harga Tiket " + HargaTiket3);
        }
        else if (daftartiket ==3){
            System.out.println ("REGULAR");
            Scanner HargaTiket2 = new Scanner(System.in);
            int HargaTiket =HargaTiket2.nextInt();
            int HargaTiket3 = HargaTiket*45000;
            System.out.println ("Jumlah Harga Tiket " + HargaTiket3);
        }
        else if(daftartiket ==4){
            while (benar){
            System.out.println("Mau Pesan Lagi?");
            Scanner Pesan = new Scanner (System.in);
            System.out.println("Iya/Tidak");
            String Pesan2 = Pesan.nextLine();
            if(Pesan2.equalsIgnoreCase("Iya")){
            System.out.println("Daftar tiket ");
            System.out.println("1. VVIP");
            System.out.println("2. VIP");
            System.out.println("3. REGULAR");
            System.out.println("4. Logout");
            
             daftartiket = daftar.nextInt();
            
        if(daftartiket ==1 ){
            System.out.println("VVIP");
            
            Scanner HargaTiket2 = new Scanner(System.in);
            int HargaTiket =HargaTiket2.nextInt();
            int HargaTiket3 = HargaTiket*60000;
            System.out.println ("Jumlah Harga Tiket " + HargaTiket3);
        }
        else if (daftartiket ==2 ){
            System.out.println("VIP");
            Scanner HargaTiket2 = new Scanner(System.in);
            int HargaTiket =HargaTiket2.nextInt();
            int HargaTiket3 = HargaTiket*55000;
            System.out.println ("Jumlah Harga Tiket " + HargaTiket3);
        }
        else if (daftartiket ==3){
            System.out.println ("REGULAR");
            Scanner HargaTiket2 = new Scanner(System.in);
            int HargaTiket =HargaTiket2.nextInt();
            int HargaTiket3 = HargaTiket*45000;
            System.out.println ("Jumlah Harga Tiket " + HargaTiket3);
                } 
                }
            else if (Pesan2.equalsIgnoreCase("Tidak")){
                benar = false;
            }
            }
        }
        
      
       }
    }
    
}

