/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgif.pkg1.pkg10118028.latihan61bangunruang;

/**
 *
 * @author User
 * NAMA      : Surya Fakhriy Hasbi
   KELAS     : IF-01 2018
   NIM       : 10118028
   DESKRIPSI :  Bangun Ruang

 */
public class IF110118028Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Bola b = new Bola();        
        b.setR(7);        
        System.out.println("Volume : "+b.Volume());
        
        Kerucut k = new Kerucut();
        k.setT(9);
        k.setR(14);
        System.out.println("Volumw : "+k.Volume());
        
        Tabung t = new Tabung();
        t.setT(21);
        t.setR(10);
        System.out.println("Volumr : "+t.Volume());
    }
    
}
