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
class Tua{
    int umur;
    public Tua(int umur){
        this.umur = umur*2;
    }
    
    int getUmur(){
        return umur;
    }
}
public class KonstraktorWaris extends Tua{
    int umur;
    public KonstraktorWaris(int umur){
        super(20);
        this.umur = umur;
    }
    void ambilAtas(){
        System.out.println(super.getUmur());
    }
    public static void main (String[]args){
        KonstraktorWaris objek = new KonstraktorWaris(10);
        System.out.println(objek.umur);
        objek.ambilAtas();
        
    }
}
