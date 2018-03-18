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
class Parent{
    int tinggi = 100;
    String warna = "biru";
    int getTinggi(){
    //memanggil tinggi yg ada di parent
    return tinggi;
       
    }
    
}


public class Overriding extends Parent {
    String warna = "hijau";
    int tinggi = 200;
    int getTinggi(){
        //memanggil tinggi yg ada di parent
        return super.tinggi;
       
    }
    void panggilSuper(){
        System.out.println(super.getTinggi());
    }
    public static void main(String[]args){
    Overriding udin = new Overriding();
    
    int udinTinggi = udin.tinggi;
    System.out.println(udinTinggi);
    
    int udinTinggiGet = udin.getTinggi();
    System.out.println(udinTinggiGet);
    
    //Method static tidak bisa memakai super
    //int udinSuper = super.getTinggi();
    //System.out.print(udinSuper);
    
    //Memanggilnya dengan cara bikin method void
    udin.panggilSuper();
    
    }
    
}
