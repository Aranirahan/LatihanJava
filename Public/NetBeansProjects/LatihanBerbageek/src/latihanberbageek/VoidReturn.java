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

public class VoidReturn {
    String warna;
    int tinggi;
    
    public static void main (String[]args){
        VoidReturn objek = new VoidReturn();
        System.out.println(objek.warna);
        objek.setWarna();
        System.out.println(objek.warna);
        
        System.out.println(objek.getTinggi());
    }
    

    void setWarna(){
        this.warna = "pink";
        this.tinggi = 200;
    }
    
        int getTinggi (){
        this.warna = "pink";
        this.tinggi = 300;
        return tinggi;
    }


}
