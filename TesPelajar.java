/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asispbo;
import java.util.Scanner;

/**
 *
 * @author Laptop
 */
public class TesPelajar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pelajar pelajar1 = new Pelajar();
        
        System.out.print("Masukkan Nama Pelajar  : ");
        String nama = input.nextLine();
        System.out.print("Masukkan NIP           : ");
        String nip = input.next();
        System.out.print("Masukkan Nilai Ujian 1 : ");
        int nilai1 = input.nextInt();
        System.out.print("Masukkan Nilai Ujian 2 : ");
        int nilai2 = input.nextInt();
        System.out.print("Masukkan Nilai Tugas   : ");
        int nilaiTugas = input.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        pelajar1.setNama(nama);
        pelajar1.setNip(nip);
        pelajar1.setNilaiUjian1(nilai1);
        pelajar1.setNilaiUjian2(nilai2);
        pelajar1.setNilaiTugas(nilaiTugas);
        
        pelajar1.status();
    } 
}