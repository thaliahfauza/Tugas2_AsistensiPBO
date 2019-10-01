/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AsistensiPBO;

/**
 *
 * @author Laptop
 */
public class Pelajar {
    private String nip;
    private String nama;
    private int nilaiUjian1;
    private int nilaiUjian2;
    private int nilaiTugas;
    
    public Pelajar(){
        nip = "Tidak diketahui";
        nama = "Tidak diketahui";
        nilaiUjian1 = 0;
        nilaiUjian2 = 0;
        nilaiTugas = 0;
}
    public void setNip(String nip){
        this.nip = nip;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNilaiUjian1(int n1){
        this.nilaiUjian1 = n1;
    }
    public void setNilaiUjian2(int n2){
        this.nilaiUjian2 = n2;
    }
     public void setNilaiTugas(int nt){
        this.nilaiTugas = nt;
    }
    public String getNip(){
        return nip;
    }
    public String getNama(){
        return this.nama;
    }
    public int getNilaiUjian1(){
        return this.nilaiUjian1;
    }
    public int getNilaiUjian2(){
        return this.nilaiUjian2;
    }
    public int getNilaiTugas(){
        return this.nilaiTugas;
}
    
    public double nilaiAkhir(){
        double nilaiAkhir;
        nilaiAkhir = (double)((0.4 * this.getNilaiUjian1()) + (0.4 * this.getNilaiUjian2()) + (0.2 * this.getNilaiTugas()));
        return nilaiAkhir;
    }
    
    public boolean isLulus(){
        return this.nilaiAkhir() >= 60;
    }
    
    public void status(){
        if(this.isLulus()==true){
            System.out.println("Nilai Akhir   : " +this.nilaiAkhir());
            System.out.println("Status        : Lulus");
        }
        else{
            System.out.println("Nilai Akhir   : " +this.nilaiAkhir());
            System.out.println("Status        : Tidak Lulus");
        }
    }
}
    

