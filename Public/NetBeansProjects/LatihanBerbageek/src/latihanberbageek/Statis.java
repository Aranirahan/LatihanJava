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
public class Statis {
    /*
-Tidak usah membuat objek
-Semua data dan method harus static
-Tidak bisa menggunakan kata kunci “this”
*/
    static int tinggi = 120;
    String warna = "hijau";
    public static void main(String[]args){
        tinggi = 30;
        //tidak memerlukan objek instance;
        System.out.print(tinggi);
    }
    static int getTinggi(){
        //tidak bisa memanggil function yang tida static
        //printWarna();
        
        //tidak bisa memakai kata kunci this
        //this.tingg = 250;
        return tinggi;
    }
    void printWarna(){
        
        System.out.print(warna);
    }
    
}
