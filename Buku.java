/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asispbo;

/**
 *
 * @author Thaliah
 */
public class Buku {
    private String namaPengarang;
    private String judulBuku;
    private int tahunTerbit;
    private int cetakanKe;
    private double hargaJual;
    
    public Buku(){
        namaPengarang = "Tidak diketahui";
        judulBuku = "Tidak diketahui";
        tahunTerbit = 0;
        cetakanKe = 0;
        hargaJual = 0;
    }
    
    public Buku(String np, String jb, int t, int ke, double harga){
        namaPengarang = np;
        judulBuku = jb;
        tahunTerbit = t;
        cetakanKe = ke;
        hargaJual = harga;
    }
    
    public String getNamaPengarang(){
        return this.namaPengarang;
    }
    
    public String getJudulBuku(){
        return this.judulBuku;
    }
    
    public int getTahunTerbit(){
        return this.tahunTerbit;
    }
    
    public int getCetakanKe(){
        return this.cetakanKe;
    }
    
    public double getHargaJual(){
        return this.hargaJual;
    }
    
    public void setNamaPengarang(String np){
        this.namaPengarang = np;
    }
    
    public void setJudulBuku(String jb){
        this.judulBuku = jb;
    }
    
    public void setTahunTerbit(int t){
        this.tahunTerbit = t;
    }
    
    public void setCetakanKe(int ke){
        this.cetakanKe = ke;
    }
    
    public void setHargaJual(double harga){
        this.hargaJual = harga;
    }

    public void infoBuku(){
        System.out.println("Nama Pengarang = " +this.getNamaPengarang());
        System.out.println("Judul Buku     = " +this.getJudulBuku());
        System.out.println("Tahun Terbit   = " +this.getTahunTerbit());
        System.out.println("Cetakan Ke     = " +this.getCetakanKe());
        System.out.println("Harga Jual     = Rp" +this.getHargaJual());
    }
}
