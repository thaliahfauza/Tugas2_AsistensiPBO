/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asispbo;

import java.util.HashSet;

/**
 *
 * @author Toshiba
 */
public class TesBuku {
    public static void main(String[] args) {
        Buku novel = new Buku();
        novel.setJudulBuku("Lima Sekawan");
        novel.setNamaPengarang("Enid Blyton");
        novel.setTahunTerbit(1988);
        novel.setCetakanKe(2);
        novel.setHargaJual(50000);
        
        novel.infoBuku();
        System.out.println("");
        Buku novel2 = new Buku("Dan Brown", "Inferno", 2007, 3, 180000);
        novel2.infoBuku();
    }
    
}
