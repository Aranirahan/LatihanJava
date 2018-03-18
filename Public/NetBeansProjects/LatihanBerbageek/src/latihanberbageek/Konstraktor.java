/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanberbageek;

/**
 *
 * @author aran
 */
//class otomatis menjadi function
public class Konstraktor {
    
int tinggi;
String warna;
    public Konstraktor (int tinggi, String warna){
        this.tinggi = tinggi;
        this.warna = warna;
    }
public static void main(String[]args){
    
    Konstraktor objek = new Konstraktor(180,"putih") ;
    System.out.print(objek.warna);
}
    
}
