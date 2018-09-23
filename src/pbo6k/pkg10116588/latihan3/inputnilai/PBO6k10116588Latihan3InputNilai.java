/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116588.latihan3.inputnilai;

import java.util.Scanner;

/**
 *
 * @author Indra F
 *  Nama                     : Indra Febriastanto
 * NIM                      : 10116588
 * KELAS                    : PBO6K
 * Deskripsi program        : Program ini berisi untuk menampilkan
 * Jenis - jenis tipe data  : string,bilangan bulat
 */
 
public class PBO6k10116588Latihan3InputNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application
        System.out.println("Masukkan Nama Anda:");
        Scanner scanner =new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("nama anda adalah " +nama);
    }
    
}
