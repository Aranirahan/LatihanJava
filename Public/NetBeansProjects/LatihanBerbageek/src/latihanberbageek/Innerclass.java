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
class luar{
    private int vPrivate = 10;
    class dalam{
   
        void ambil_vPrivate(){
            System.out.println("vPrivate Terambil = "+vPrivate);
        }   
    }    
    void ambil_methode_ambil_vPrivate(){
        dalam objekDalam = new dalam();
        objekDalam.ambil_vPrivate();
        
        }
}

public class Innerclass {
    public static void main (String[]args){
        //Tidak bisa membuat objek class dalam
        //karena classnya di dalam class
        //dalam objek = new dalam();
        
        //Hanya bisa menggunakan class luar
        luar objek = new luar();
        
        //Tidak bisa mengakses methode ambil_vPrivate 
        //karena classnya di dalam class
        //objek.ambil_vPrivate();
        
        //Hanya bisa menggunakan methode yg ada di class luar
        objek.ambil_methode_ambil_vPrivate();
        
    }
    
    
}
