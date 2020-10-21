/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program.pkg1;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Program1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in); //object scanner baru
        
        String nama, nisn, ttl, jenisKelamin, agama, alamat; //variabel
        
        System.out.println("|     KARTU PELAJAR         |");
        System.out.println("===========================================");
        
        System.out.print("Nama Lengkap : " );
        nama = input.nextLine(); //memberikan nilai variabel dg menyimpan inputan dari user
        System.out.print("NISN : " );
        nisn = input.nextLine();
        System.out.print("Tempat Tanggal Lahir : " );
        ttl = input.nextLine();
        System.out.print("Jenis Kelamin : ");
        jenisKelamin = input.nextLine();
        System.out.print("Agama : ");
        agama = input.nextLine();
        System.out.print("Alamat : ");
        alamat = input.nextLine();

        System.out.println("");
        
        // Tampilkan datanya 
        System.out.println("+------------------------------------------+");
        System.out.println("|          KARTU PELAJAR          |");
        System.out.println("+------------------------------------------+");
        System.out.println("| Nama Lengkap : " + nama);
        System.out.println("| NISN : " + nisn);
        System.out.println("| Tempat Tanggal Lahir :  " + ttl);
        System.out.println("| Jenis Kelamin : " + jenisKelamin);
        System.out.println("| Agama : " + agama);
        System.out.println("| Alamat : " + alamat);
        System.out.println("+------------------------------------------+");
    }
    
}
